# Semaphores

### Semaphore and Multi-threading 

- Each process that wishes to use a resource **performs a wait()** operation on the semaphore.
- When a process releases a resource, it **performs a signal()** operation.
- When all resources are allocated, **any incoming process is blocked** till a resource is free to use.

### Properties of Semaphores

1. It's simple and always have a non-negative Integer value.
2. Works with many processes.
3. Can have many different critical sections with different semaphores.
4. Each critical section has unique access semaphores.
5. Can permit multiple processes into the critical section at once, if desirable.

### ***Types of Semaphores***

- ***Binary Semaphore:*** can range only between 0 and 1, behave similarly to mutex locks.

- ***Counting Semaphore:*** can range over an unrestricted domain.  a finite number of resources.


### ***Basic Implementation for a Counting Semaphore***

```java
class Semaphore {
    int resources; // number of resources.
    
    synchronized boolean wait() {
        resources--;
        if(resources < 0)
            wait();
   	}

    synchronized void signal(){
        resources++;
        if(resources <=0)
            notify();  
    }
}
```

# Key Terms



### Deadlock

#### *Definition*

It is a state where a set of processes is waiting for an event (acquire lock/release lock) that can be caused only by another process in the set.

#### *Example*

Consider a system consisting of two processes, P0 and P1, each accessing two semaphores, S and Q, set to the value 1:

![image-20201208215221372](C:\Users\omara\AppData\Roaming\Typora\typora-user-images\image-20201208215221372.png)

Suppose that P0 executes wait(S) and then P1 executes wait(Q).

When P0 executes wait(Q), it must wait until P1 executes signal(Q). 

Similarly, when P1 executes wait(S), it must wait until P0 executes signal(S).

Since these signal() operations cannot be executed, P0 and P1 are deadlocked.

#### *Avoiding Deadlocks*

Deadlocks can be avoided by avoiding at least one of the four conditions, because all this four conditions are required simultaneously to cause deadlock.

1. ***Mutual Exclusion***

   Resources shared such as read-only files do not lead to deadlocks but resources, such as printers and tape drives, requires exclusive access by a single process.

2. ***Hold and Wait***

   In this condition processes must be prevented from holding one or more resources while simultaneously waiting for one or more others.

3. ***No Preemption***

   Preemption of process resource allocations can avoid the condition of deadlocks, where ever possible.

4. ***Circular Wait***

   Circular wait can be avoided if we number all resources, and require that processes request resources only in strictly increasing(or decreasing) order.

   

### Starvation

#### *Definition*

A situation in which processes wait indefinitely within the semaphore, known as **indefinite blocking**.

#### *Occurrence*
Indefinite blocking may occur if we remove processes from the list associated with a semaphore in LIFO (last-in, first-out) order.

### Priority Inversion

[Great Explanation for PI](https://www.youtube.com/watch?v=oH29dpPPpME)

#### *Scenario*

![image-20201208222331055](C:\Users\omara\AppData\Roaming\Typora\typora-user-images\image-20201208222331055.png)




#### *Definition* 

 The case which a high priority process behave as low-priority process and a low-priority process behave as a high-priority process. 

#### *Solution*

Priority-inheritance Protocol