## Chapter Seven: Defining the System Architecture

- An important part of design is ***choosing appropriate technologies***, adapting those technologies and software to ***an organization’s existing technology architecture***, or ***modifying existing architecture to support new technologies and systems.***

### Anatomy of a Modern System (Environment)

- ***Server***: *A computer or group of computers that manages shared resources such as databases, and Web sites, and enables users and other computers to access those resources over a network (hosting).*

- ***Computer Network*** is a collection of hardware, software, and transmission media that enables computing devices to communicate with one another and to share resources. 

  Networks come in many sizes—ranging from small networks that span a single home or office to international networks that connect countries and continents.

- ***World Wide Web***: is the set of resources and services that can be accessed via the Internet.

- Web Resources are accessed by ***Uniform Resource Locator (URL)*** 

<img src="https://i.imgur.com/QsHV4jF.png" alt="Parts of a Uniform Resource Locator" style="zoom: 50%;" />

- ***Software*** : It is divided into two groups.

  - ***Application Software***: software performs user- or business-specific tasks. 

    It can be distributed as:

    - ***App***: Installed on a computer or smartphone.

    - ***Web-based App***: application software that uses a Web browser as the primary user interface,
      has a URL for application/user access, uses a Web server and server-side software components, and uses Web Protocols such as HTTP for communication between Web browser and server.

      **Note:** *They are common for ease of access, use of widely Web Protocols. However, those benefits come at a cost. Web applications are a well-defined target for security breaches because URLs and Web standards are open and widely known. Also, application performance can suffer when networks are congested.*

  - ***System Software***: software, such as operating systems and Web server software, that works behind the scenes to support application software and control or interact with hardware or software resources.

  - ***Embedded Software***

    - The OS offers embedded software such as graphical display, touch screen and gesture-based input, voice recognition, speech generation, music and video playback, and access to the Internet and Web resources.
    - The Web browser also offers some embedded software such as Toolbars, Plug-ins, Widgets, Add-on.
      

    *The combination of a computing device’s OS, apps, Web browser, and embedded components creates a software environment within which an app or Web-based application operates.*

    *Designers must decide which embedded software components will be included in their systems, and they must design their application software for that embedded software.*

- ***Protocols***: *a set of languages, rules, and procedures that ensure accurate and efficient data **exchange** and **coordination** among hardware and software components.*

  Types of Protocols:

  - ***Network Protocols***: enable accurate message transmission among the various computers and software components.
    - The benefit of network protocols in information system, **is the usage of firewalls** which examine incoming and outgoing packets and block those arriving from or sent to dangerous URLs.
    - Thus, an information system designer must ensure that network messages among software
      components won’t be blocked by a firewall at either end.
    - For increased security, the system designer may want to work with security and network specialists to develop ***a virtual private network (VPN)*** to isolate sensitive communications  between servers or between an organization’s own employees and servers.
    - ***Virtual Private Network* **secure communication over the Internet using technologies that reliably identify senders and recipients, and encrypt network messages sent among them
  - ***Web Protocols***
    - ***Hypertext Markup Language (HTML)***: a protocol that defines the structure and content of a Web page.
    - ***Extensible Markup Language (XML)***: HTML Extension that enables the meaning of words, phrases to be defined.
    - ***Hypertext Transfer Protocol (HTTP)***: HTTP defines the format and content of requests for Web documents and resources, and includes some simple commands for other types of requests.
    - ***Hypertext Transfer Protocol Secure (HTTPS)*** HTTPS is an extension of HTTP that employs secure network protocols to reliably identify senders and recipients and encrypt network messages sent among them.

  ### Architectural Concepts

  ***Technology architecture:*** *The set of computing hardware, network hardware and topology, and system software employed by an organization.*

  **Application architecture: ** *The set of information systems (the software applications) the organization needs to support its strategic plan*.

- The technology architecture ***defines the infrastructure*** that supports application software and the services it provides. Hence, Both architectures are interdependent.
  

- **Note 1:** *high-quality technology architecture can’t make up for poor application architecture. Application software must be designed to ensure ease of construction, deployment, operation, and future updates.*

- **Note 2:** *An organization must choose technologies that match its application needs and support those technologies over a period of years or decades.*

- **Note 3**: *The technology architecture must evolve slowly over time to enable new functions, new ways of working, and new ways of interacting with customers and strategic partners.*

  ***Technology Architecture can be:***

  - ***Software as a Service (SaaS)***: *A software delivery model similar to a utility, in which application software is accessed via the Internet without locally installed programs.*

    Examples:

    - Facebook, Tumblr, Pinterest, Google, Adobe Creative, Amazon and UPS.
      

    Two common features shared by most applications that employ the SaaS
    model include the following:

    - Little or no application software is installed on the user’s device.
    - User data is stored on servers, though copies may be stored on the user’s device for improved performance. 
      

  - ***Web Services***: *A software service accessed over the Internet using Web protocols.*

    - ***it more commonly refers to smaller and more focused applications, such as transmitting shipping information from seller to shipper, or single functions, such as looking up the zip code that matches a shipping address.***

  - ***Distributed Architectures***

    - Client/Server Architecture
      

      A server manages system resources and provides access to these resources through a well-defined communication interface. 

      A client uses the communication interface to request resources, and the server
      responds to these requests.

      Advantage of this architecture:

      - Easily supports software to be developed by three-layer architecture.

    - Three-Layer Architecture

      A major benefit of three-layer architecture is its inherent flexibility

       ***View Layer, Business Logic Layer and Data Layer*** .

      <img src="https://i.imgur.com/VGNPOgJ.png" alt="Three-Layer Architecture" style="zoom:150%;" />

    <img src="https://i.imgur.com/GcsdVMx.png" alt="Internal Deployment with three-layer architecture" style="zoom:67%;" />

    

### Interoperability 

***Interoperability:*** *The ability of a component or system to interact with other components or systems.*

- System designers must do several things, including the following:

  1. Understand and describe the current environment in which the system will operate.

  2. Reuse existing software components and services that can provide needed functions for the new system.
  3. Build components that can’t be purchased as software modules or used as a service.
  4. Structure and assemble the components in a way that is feasible to build, test, deploy, and operate over the long term.

### Architectural Diagrams

- Commonly used to visually describe an information system’s environment, components, and deployment.

- Types of Architectural Diagrams

  - ***Location Diagrams***: *Done early in design phase and shows the **geographic placement** of various system components including hardware, buildings and users.*

  -  Network Diagrams: *shows how locations and hardware components are **interconnected with network devices and wiring.*** *used to describe network connections within a server room*

    ![Network Diagram](https://i.imgur.com/DQiyVcT.png)

  - ***Deployment Diagrams***: *A deployment diagram describes how software components are distributed*
    *across hardware and system software components.*

    ![Deployment](https://i.imgur.com/eYF3suE.png)

### Describing the Environment

- P.203 - Key Questions and Questions.

### Designing Application Components

- P.208

