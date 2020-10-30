# Chapter One: Introduction 

# Table of Contents
[1.1: What Operating Systems Do?](#11-what-operating-systems-do)

[1.2: Computer-System Organization](#12-computer-system-organization)

[1.3: Computer-System Architecture](#13-computer-system-architecture)

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
  Idea: 
 - Single Processor Systems
 One main CPU is capable of executing instruction set including instructions from user processes.
 - Multiprocessor Systems
