# Synchronization Problems

## 1. Readers-Writers Problem

### *Problem Statement* 

- A shared resource can be accessed by multiple processes, assume the shared resource is **file**.
- Any number of **readers** can read from the file simultaneously.
- Only one **writer** can write to file.
- When a **writer** is writing data to the file, no other process can access the file. 
- Also a **writer** cannot write to the file if there are non zero number of readers accessing the resource at that time.

### *Priority*

* Readers > Writer
* Therefore, If a **writer** wants to write to the file, it must wait until there are **no readers** currently accessing that file.

### *Solution*

```java
semaphore rw_mutex = 1; // common for read/write processes.
semaphore mutex = 1; // ensure mutual exclusion when read_count is updated.
int read_count = 0; // keeps track of how many processes are currently reading.
```

- The implementation of run method inside **writer** process would be:

  ```java
  do {
      wait(rw_mutex);
      
     . . .
      /* critical section */
      /* writing is performed */
      . . .
      
      signal(rw_mutex);
  } while (true);
  ```
  
- The implementation of run method inside **reader** process would be:

  ```java
  do {
      wait(mutex);
      read count++;
      
      if (read count == 1)
      	wait(rw_mutex);
      	
     signal(mutex);
     
     . . .
      /* critical section */
      /* reading is performed */
      . . .
      
      wait(mutex);
      
      read count--;
      if (read count == 0)
      	signal(rw_mutex);
      	
      signal(mutex);
  } while (true);
  ```
## 2. The Bounded-Buffer Problem
### *Problem Statement* 

  Consider a producer which produces items in the buffer and a consumer which consumes produced_item from the buffer.

### *Solution*

```java
int n;
semaphore mutex = 1;
semaphore empty = n;
semaphore full = 0
```

- The implementation of run method inside **producer** process would be:

  ```java
  do {
      . . .
      /* produce an item in next produced */
      . . .
      wait(empty);
      wait(mutex);
      . . .
      /* add next produced to the buffer */
      . . .
      signal(mutex);
      signal(full);
  } while (true);
  ```

- The implementation of run method inside **consumer** process would be:

  ```java
  do {
      wait(full);
      wait(mutex);
      . . .
      /* remove an item from buffer to next consumed */
      . . .
      signal(mutex);
      signal(empty);
      . . .
      /* consume the item in next consumed */
      . . .
  } while (true);
  ```

# 3. The Dining-Philosophers Problem [Video](https://www.youtube.com/watch?v=_ruovgwXyYs)

### *Problem Statement* 

### *Solution*

```java
semaphore chopstick[5];

do {
    wait(chopstick[i]);
    wait(chopstick[(i+1) % 5]);
    . . .
    /* eat for awhile */
    . . .
    signal(chopstick[i]);
    signal(chopstick[(i+1) % 5]);
    . . .
    /* think for awhile */
    . . .
} while (true);
```

Deadlock occurs here when all philosophers pick their right chopstick and no chopstick will be available.

<img src="C:\Users\omara\AppData\Roaming\Typora\typora-user-images\image-20201209002345615.png" alt="image-20201209002345615" style="zoom: 67%;" />

To prevent deadlock...

```java
semaphore chopstick[5];

do {
    wait(chopstick[min(i, (i+1) % 5)]);
    wait(chopstick[max(i, (i+1) % 5)]);
    
    . . .
    /* eat for awhile */
    . . .
    
    signal(chopstick[(i+1) % 5]);
    signal(chopstick[i]);
    . . .
    /* think for awhile */
    . . .
} while (true);
```

