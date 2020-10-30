# Chapter One: Introduction 

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
- ROM vs. EEPROM 
    - ROM: cannot be changed, ROM can only stores static programs e.g. bootstrap program.
