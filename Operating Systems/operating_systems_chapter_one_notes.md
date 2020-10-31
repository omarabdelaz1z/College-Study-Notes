# Chapter One: Introduction 

# Table of Contents
[1.1: What Operating Systems Do?](#11-what-operating-systems-do)

[1.2: Computer-System Organization](#12-computer-system-organization)

[1.3: Computer-System Architecture](#13-computer-system-architecture)

[1.4: Computer-System Structure](#14-computer-system-structure)

[1.5: Computer-System Operations](#14-computer-system-operations)

### 1.1: What Operating Systems Do?
- A computer system is divided into: **Hardware**, **Operating System**, **Application Programs** and **Users**.
- Hardware **provides basic resources** for the system.
- Application Programs use these **resources** to accomplish users' problems. 
- Operating System is a **coordinator** which controls the hardware's use among various apps for various users.
- Users tends to view the OS as an interface that is **easy to use**. Some seeks to **performance** over **resource utilization**.
- **Resource Utilization**: how various hardware and software resources are **shared**.
- Multi-user operating systems **must maximize resource utilization** to assure all available resources are used efficiently and no indvidual user takes more than his fair share.
- Server/Workstation operating systems **compromise between individual usability and resource utilization** because Server OSs allow their users to have dedicated resources but also share networking and servers such print servers.
- The previous operating systems provides a user interface. However, There are other operating systems **have little or no user interface** such **embdedded/ auto-mobile devices**.
- An operating system is considered as a **resource allocator** or **hardware coordinator** or **resource manager** or **control program** to prevent errors and improper use of the computer.
- The fundamental goal of computer systems is to **execute user programs** and to make solving user problems easier. And hardware is designed to achieve this goal.
- Types of computer software:

    1. *System Software*: all software associated with the operating system such as: **drivers**, **utility programs** and the operating system itself is a system program.
    2. *Application Software*: all software not associated with the opereting systems such as: **general/specific-purpose software programs**.

- Mobile OSs not only include a core kernal but also include **middleware**, **frameworks** designed to provide additional services to application developers.

### 1.2: Computer-System Organization
A modern computer system consists of one or more CPUs and device controllers connected through a shared bus that provide access to shared memory. 

![A modern computer system](https://i.imgur.com/mUSwYzg.png)


- When a computer powers up, **the bootstrap program** loads the operating system into memory to initialize all hardware components to start providing services to the system and users.
- Some services are loaded into memory at boot time (e.g. system programs) to become **system daemons** that run the entire time the **kernel (operating system) is running**.
- **Note**: Bootstrap is stored in **ROM OR EEPROM** in the computer hardware.

- Interrupt Basics:
  - Any event is called an interrupt and it might come from a hardware component or software application.
  - This interrupt requires the CPU to stop the current program execution to perform some service related to the interrupt.
  - The service is called an interrupt service routine (ISR) or an interrupt handler.
  - ISR is a software routine that hardware invokes in response to an interrupt (represented as an I/O Activity).
  
  - Interrupts are used to:
    - Coordinate I/O activities and prevent the CPU from being tied up during data transfer process.
      The CPU needs to know if the I/O is ready before it can proceed. Without the interrupt capability, 
      the CPU needs to check the status of the I/O devicecontinuously.

    - Perform time-critical applications.
      Many emergent events require the CPU to take action immediately.
      The interrupt mechanism provides a way to force the CPU to divert from
      normal program execution and take immediate actions.

  - Interrupt vector is a table of pointers/ addresses of ISR for the interrupting device. The use of pointers is to provide the necessary speed.
  - The interrupt architecture must also save the address of the interrupted instruction.
  - After the interrupt is serviced, the saved return address is loaded into the program counter, and the interrupted computation resumes
    as though the interrupt had not occurred.
  
  
    ![Interrupt timeline for a single process doing output](https://i.imgur.com/6apCZuP.png)
    

- The CPU only load instructions from memory where run programs are stored.
- **ROM vs. EEPROM** 
    - ROM: cannot be changed, ROM can only stores static programs e.g. bootstrap program.
    - EEPROM: can be changed but not frequently. e.g. smartphones store their **factory-installed programs** in EEPROM.
    
Interaction is achieved through a sequence of load or store instructions to specific memory addressesز

- **Load Instruction vs Store Instruction**
    - Load Instruction: **moves the content from main memory to an internal register within the CPU**.
    - Store Instruction: **moves the content of a register to main memory**.
    
- Ideally, we want the programs and data to reside in main memory permanently. This arrangement usually is not possible for the following two reasons:
    1. Main memory is usually too small to store all needed programs and data permanently.
    2. Main memory is a volatile storage device that loses its contents whe power is turned off or otherwise lost.
    
- **Secondary Storage/Memory** holds a large quantities of data permanently e.g. magnetic disk.
- Also, There is other storage systems such **cache, cd-rom and magentic tapes**.

- Overall, Storage system provides the basic functions of storing a datum and holding that datum until it is retrieved at a later time. The main
differences **among the various storage systems** lie in **speed**, **cost**, **size**, and **volatility**.

- **Volatile Storage Vs. Nonvolatile Storage**:
    - Volatile storage: loses its contents when the power to the device is removed. 
    - Nonvolatile storage: don't lose its contents and is used for safekeeping the data.
    
 *Note: Storage is a type of I/O devices within a computer*

![Storage-device hierarchy](https://i.imgur.com/5tiIyRu.png)

**I/O System**
- A large portion of an operating system must be dedicated to manage I/O devices to assure reliability and performance of a system.
- Any device (I/O unit) consists of mechanical componenet and an electronic component. This electric component is a called a device controller.
- Device Controller: is an interface between the device and device driver. it maintaints some local buffer storage and a set of special-purpose registers.
- Device Driver: a software allows the operating system to identify and handle a particular device.

- Any device connected to the computer is connected by a plug and socket, and the socket is connected to a device controller. Following is a model for connecting the CPU, memory, controllers, and I/O devices where CPU and device controllers all use a common bus for communication.

![I/O devices](https://www.tutorialspoint.com/operating_system/images/device_controllers.jpg)

I/O operations: 

To start an I/O operation, the device driver loads the appropriate registers within the device controller. The device controller, in turn, examines the contents of these registers to determine what action to take (such as “read a character from the keyboard”). The controller starts the transfer of data from the device to its local buffer. 
Once the transfer of data is complete, the device controller informs the device driver via an interrupt that it has finished its operation. The device driver then returns control to the operating system, possibly returning the data or a pointer to the data if the operation was a read. For other operations, the device driver returns status information. 

Communcation through I/O devices
- There are three ways that allows the CPU to send or recieve an information through I/O devices.
    - Special Instruction I/O: allow data to be sent to an I/O device or read from an I/O device.
    - Memory-Mapped Instruction I/O: The memory handles the instructions from I/O devices as The device is mainly connected to it.
        Memory mapped IO is used for most high-speed I/O devices like disks, communication interfaces.
    ![Memory-Mapped Instruction Cycle](https://www.tutorialspoint.com/operating_system/images/memory_mapped_io.jpg)
    - Direct Memory Access: 
    
    
    
### 1.3: Computer-System Architecture
  
#### Single Processor Systems

   - Most Modern Personal Computers (PCs) are single processor systems.
   - Main CPU) is capable of executing a process one at a time and then the next process is selected from the ready queue.
   
   ![Single Processors](https://www.tutorialspoint.com/assets/questions/media/10916/Single%20Processor.PNG)
   
   - General-Purpose Examples: I/O processors that move data among system components.
   - Specific-Purpose Examples: Device Processors such as disk, keyboard and graphics controllers.
       
#### Multiprocessor Systems
- Known as **parallel systems or multicore systems**. 
- Systems with two or more processors sharing computer components.
- Advantages:

    - *Increasing throughput*: **More Processors, More Work Done** with a certain amount of overhead to keep computer parts working properly due to the shared resources.

    - *Economy of Scale*: Multiprocessor System cost less than multiple single-processor systems due to shared resources such as storage, power supply and peripherals.

    - *Increased Reliability*: If exists any failure on one of the processors the system won't halt, the system will just slow down.

*Note: Systems have multiprocessors, provides graceful degradation service also called. Because they can suffer a failure of any single component and still continue operation. This service requires a mechanism to detect failures*.

- Types of Multiprocessor Systems:
    1. Asymmetric Multiprocessor Systems: There exists a manager (boss processor) which controls the system and schedules and allocate works for the worker processors. I.e. Each Processor assigned for task to accomplish.

    2. Symmetric Multiprocessor Systems (SMPS): There's no manager here, all processors (also known in this case as peers) assigned to perform all tasks within the operating system. all peers share physical memory. The benefit from SMP is to run processes simultaneously N processes can run if there are N CPUs.

        *Note: we must carefully control I/O to ensure that the data reach the appropriate processor.*
        
        ![Symmetric Multiprocessor Architecture](https://i.imgur.com/6G7M8TZ.png)

    In general: Multiprocessing adds CPUs to **increase computing power**. If the CPU has an integrated memory controller, then adding CPUs can also increase the amount of memory addressable in the system. Either way, multiprocessing can cause a system to change its memory access model from uniform memory access (UMA) to non-uniform memory access (NUMA). 

    - **UMA**: access to any RAM from any CPU takes the same amount of time.
    - **NUMA**: some parts of memory may take longer to access than other parts, creating a performance penalty. 

    Operating systems can minimize the NUMA penalty through resource management.

    - Multiprocessor systems with single core is less efficient than a single processor systems with multiple chips because **on-chip communication is faster** and also consumes less power than multiple single-core chips.

    *Note: It is important to note that while multi-core systems are multiprocessor systems, not all multiprocessor systems are multi-core*.
    *Note: From the operating system view, these multi-core processors appear as N standard processors.*
        ![A dual-core design with two cores placed on the same chip.](https://i.imgur.com/pbT5Dsp.png)

    3. Clustered Systems: 
        ![General structure of a clustered system.](https://i.imgur.com/GrvKqm4.png)
        - systems consists of two or more **loosely-coupled systems**. 
        - Each node (system) may vary from single processor system or a multi-core system. These clustered systems **share storage and network via LAN or WAN (CLOUD)**. 
        - Clustering provides **high-availability service** (similar to reliability that stated above when discussing advantages of multiprocessor systems.)

        - There's two types of clustering: 

            - **asymmetric**: one machine is in hot-standby mode in which do nothing but monitor the server and the systems running the applications.
            - **symmetric**: two or more hosts running application and monitor each other, they use all available hardware thats why they are efficient.
        - Systems which support **parallelization**, which divides a program into separate components that run in parallel on individual computers in the cluster. *Note: The application must be written to use parallelization*.

        - clusters can provide **high-performance computing (HPC) environments**.
            Such systems can supply significantly greater computational power than single-processor or even SMP systems 
            because they can run an application concurrently on all computers in the cluster.     
        - Usually sharing storage via **storage-area network (SAN)**
        - Some have distributed lock manager (DLM) to avoid conflicting operations.


### 1.4: Operating-System Structure
- **Multiprogrammed Systems (Batch System)**

    ![Memory layout for a multiprogramming system.](https://i.imgur.com/7qMOVQX.png)

    Systems provide an environment in which the various system resources (for example, CPU, memory, and peripheral devices) are utilized effectively, 
    but they do not provide for user interaction with the computer system.

    The idea of Multiprogrammed systems:
    1. The operating system stores several processes/jobs in memory.
    2. Since memory is too small, some jobs are kept in the job pool, where some of the jobs resides on disk awaiting allocation in the main memory.
    3. Some of the jobs in memory - that are being executed - needs to wait for an I/O operation, so The CPU switches to another job and execute it.
    4. The **CPU in Multiprogrammed systems is never idle**, there are always jobs being executed.

- **Multitasking (Time-sharing)**
    - Uses **CPU scheduling and multiprogramming**.
    - The CPU executes **multiple jobs by switching among them so frequently**.
    - Response time **is short**.
    - In a multi-task system, There's a direct interaction between the user and the system by giving instruction through I/O devices and waits for immediate results.
    - Since the operating system awaits for user's input to execute some process, the operating system can switch to another process whenever the user give an input.
    - Therefore, the operating system must ensure reasonable response time. 
    - This goal is sometimes accomplished through **swapping** whereby processes **are swapped in and out of main memory to the disk**.
    - **Virtual Memory** enables users to run programs that are larger than actual physical memory.
    - In this type of systems, the system must provide **file system that are based on disk management**.
    - Also, the system must provide mechanisms for **Job Synchronization, Communication and Deadlock Manager**.
    
### 1.5: Operating-System Operations
### 1.5: Operating-System Operations
### 1.6: Process Management

- Any program/task/job/time-shared program in execution phase (in active state) is called a process. 
- A process needs to allocate resources - either when created or during runtime - to accomplish its task.
- The process can be a system code or a user code.
- All these processes can potentially execute concurrently -by multiplexing on a single CPU.
- When the process terminates, the operating system reclaim any reusable resources.

- The operating system is responsible to manage processes:
    1. Scheduling processes and threads on the CPUs.
    2. Creating and deleting both user and system processes.
    3. Suspending and resuming processes.
    4. Providing mechanisms for process synchronization.
    5. Providing mechanisms for process communication.
    
### 1.7: Memory Management
- Main memory is the a repository of quickly accessible data shared by the CPU and I/O devices.
- According to Von Neumann architecture, The CPU reads instructions from main memory during the instruction-fetch cycle and both reads and writes data from main memory during the data-fetch cycle.
- To run a program, it must be mapped to absolute addresses and loaded into memory as a process.
- The operating system must apply a memory management scheme suitable to the hardware design. The reason for that, a memory management scheme reflects some algorithms, these algorithms support from the hardware.

- The operating system is responsible to:
    1. Keeping track of which parts of memory are currently being used and who is using them.
    2. Deciding which processes (or parts of processes) and data to move into and out of memory.
    3. Allocating and deallocating memory space as needed.
### 1.8: Storage Management
### 1.9: Protection and Security
### 1.10: Kernel Data Structures

Usage of Data structures in Operating Systems:
- The array represents the construction of the main memory.

- Lists - such as linked lists - are sometimes used by kernel algorithms and frequently used to construct other data structures such stacks and queues.

- The operating system uses a Stack when invoking function calls as the operating system pushes parameters, local variables and return address into stack. The stack becomes empty when returning from the function call.

- The operating system uses Queues to execute jobs in order (First In First Out). These jobs are waiting in a queue to be run on available CPU.

- Trees is data structure used to represent hierarchical data. For Example, Linux uses a balanced binary search tree as part its CPU-scheduling algorithm

- Hash functions are used extensively in operating systems because it retrieves data in O(1).

- Bitmaps are used to indicate the status of n items using binary representation. For example, we can know the status of each resource stored in that data structure denoted with 0 or 1. 

- Also, Bitmaps can be used to indicate the availability of each disk block in a disk drive.

### 1.11: Computing Environments
### 1.12: Open-Source Operating Systems
