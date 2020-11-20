# Chapter 2: Operating-System Structures

### 2.1 Operating-System Services

- *Operating System services differ from one OS to another but there are set of features in common.*
  
  - ***User Interface***: *Such as **CLI** that <u>uses commands</u> or **Batch System** that <u>uses executable script files</u> and **GUI**, an interface that deal with <u>a pointing device to facilitate I/O operations easily</u>*.
  
  - ***Program Execution***: *So we - as users - can **load programs into memory** and be able to **run and end** its execution either normally or abnormally <u>indicating an error message</u>.*
  
  - ***I/O Operations***: *The OS should provide I/O management to do I/O operations.*
  
  - ***File-system Manipulation***: *Including <u>reading/writing files and directories</u> or to do <u>CRUD</u> operations for a given file and **Permission Management** for accessing permissions for the file.*
  
  - ***Communications***: *To allow information to be exchanged **between two or more processes** where they access a **shared memory** location or predefined-formatted packets are moved between processes known as **message passing.***
  
  - ***Error Detection***: *Errors may vary such as memory error, power failure, parity error on disk, network connection failure, overflow, access violation. Therefore, <u>the operating system should behave correctly and consistently towards these kind of errors</u>.*
  
  - ***Resource Allocation***: *How to execute **multiple jobs at the same time**, therefore we need to **allocate resources** efficiently for job.* 
  
    For instance, in determining **how best to use the CPU**, operating systems have **CPU-scheduling** 	routines that take into account the speed of the CPU, the jobs that must be executed, the number of registers available, and other factors.
  
  - ***Protection and Security***: *Involves **resource-access control**, **Network security** (system-outsiders) such as **User Authentication.***

### 2.2 User and Operating-System Interface

#### 2.2.1 Command Interpreters

- CLI can either be a part of the **OS kernel** and also can be a part of the **system programs**.
- The main role of the command interpreter (CLI) is to get and execute the user-specified command.

- One type of a CLI, contains the code to execute a command as it makes the appropriate system call for a specific command. 
- Another type of CLI used in UNIX systems, it actually loads a file (command) in memory and execute it with the arguments given with the command. In this way, a programmer can make his own command.

#### 2.2.2 Graphical User Interfaces

- Graphical Interfaces varies and have developed much, it's started with ***Mouse and keyboard*** and navigating through the interface with them, clicking and typing. More over, GUIs has Improved by allowing ***touchscreen*** interface by making gestures (use your fingers to make an action) to do a specific actions.

#### 2.2.3 Choice of Interface

- It's a personal preference.
- ***System Administrators*** and ***power users*** prefer CLI because it's efficient for their tasks and make repetitive tasks easier - just create **shell script** and execute that script.
- In contrast, most Windows users are happy to use the Windows GUI environment and almost never use the MS-DOS shell interface.

### 2.3 System Calls

System Call and System Call Interface

- ***System Call***: a way to allow programs to interact with the operating system. These system calls provide services to the user program via API where the program is an application program written according to the operating system  API. 
- It provides an interface between a process and operating system to allow user-level processes to request services of the operating system. 
- ***System Call Interface***: An interfaces that serves as the link to system calls made by the operating system.
  - The interface maintains a table of system calls indexed with numbers, each number is associated to a system call.
  - The system call interface then invokes the intended system call in the operating-system kernel and
    returns the status of the system call and any return values.
- Three general methods are used to pass parameters to the operating system.
  - Parameters passed in **registers**, 
  - If the registered is full, the parameters are **stored in a block in memory** and the **address** of the block holding parameters **is passed as a parameter in a register.** Linux apply this approach.
  - Parameters can be pushed onto the program stack and popped off the stack by the OS.
  - Some operating systems prefer the block or stack method
    because those approaches do not limit the number or length of parameters
    being passed.
- Assume an application in Windows (ie. uses Windows API) and the application has a CreateProcess() function. So to make a process through the application, the program invokes NTCreateProcess() system call in the windows kernel through the CreateProcess() Function. 

- The Question here: Why not call system calls directly?
- The Answer: to assure ***Program Portability***. 

### 2.4 Types of System Calls

- System calls can be grouped roughly into **six major categories**

  - **Process Control**
  - **File Manipulation**
  - **Device Manipulation**
  - **Information Maintenance**
  - **Communications**
  - **Protection**

  