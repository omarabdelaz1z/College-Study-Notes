## Chapter 6: Foundations of Systems Design

### What is Systems Design

- ***Systems Analysis***: *those system development activities that enable a person to understand and specify what the new system should accomplish.*
- ***Systems Design***: *those system development activities that enable a person to describe in detail how the resulting information system will actually be implemented.*

- The sequence of the definitions implies that ***analysis precedes design.***
  - ***Analysis provides the starting point for design.***
  - ***Design provides the starting point for implementation.***
  -  ***Analysis and design document their results to coordinate the work of multiple people and to communicate with downstream activities.***

- What analyst do during analysis process:

  - Build models to understand business processes.
  - Decompose or breaking complex problems into small understandable pieces.
  - Build requirement models to organize problem domain knowledge.

  - Note: Analysis and modelling process require substantial user involvement to explain the requirements and to verify the models are accurate.

- What designers do during design process:

  - Convert gathered information (Input) into models to represent the solution system (Output).
  - Discover technical issues. such as database performance needs, security and encryption issues.

- For class diagrams, some content, such as classes, attributes, and relationships ***is defined during analysis.***

- Additional content, such as attribute data types, keys, indexes, and the class methods or functions, ***is added during design.***

  ![Requirements into Design](https://i.imgur.com/PY0uEFH.png)

  ### Systems Design Activities:

- ![System Design Activities](https://i.imgur.com/UoUomux.png)

1. ***Describe the Environments***

- The environment consists of two key elements:
  -  ***External systems***: Described by analysis activities.
  - ***Technology architecture***: the set of computing hardware, network hardware and topology, and  system software employed by an organization.
- The technology architecture supports all of an organization’s systems, so each of their designs is adapted to that architecture. That's why technology architecture is fixed.
- In some cases, a new system will require changes to existing technology architecture. In those cases, any changes to the technology architecture are considered and decided upon by the organization as a whole.

2. ***Design the Application Component***

- ***Application Component*** *is a well-defined unit of software that performs*
  *one or more specific tasks.*
  - Vary in size/scope, programming languages or can be buyable or offered via Web Services interface such as Google Maps or Federal Express.
  - In essence, application component design divides the functions of the system into smaller packages, each of which must be further specified in terms of software classes and methods.
  - The result of application component design is a set of models (diagrams), often supplemented with other documents that provide additional detail.

3. ***Design the User Interface***
   - The quality of the user interface can **make** or **break** a system after deployment.
   - A decade ago, user-interface design was concerned primarily with simplifying the presentation of information on desktop computer monitors and minimizing task-related keystrokes and mouse clicks.
   - In the modern world, designers must deal with multiple screens ranging from phones to large multimonitor displays. Multitouch screens, voice recognition, and built-in cameras that follow a user’s eye movements create new options and provide greater challenges for user-interface designers.
   - Many types of models and tools are used to create a user-interface design, including mock-ups, storyboards, graphical layouts, and prototyping with screen-modeling tools.
4. ***Design the Database***
   - Considering the data model and determine database structure.
   - The database can be flat-files, relational, non-relational (NoSQL), centralized, decentralized or distributed.
   - The internal properties of the database must also be designed, including such things as attribute types, default values, and access controls.
5. ***Design the Software Classes and Methods***
   - Describe in enough detail how the software programs work, so that programmers can write the code for the functions and methods.

### System Controls and Security

- ***Controls***: *Mechanisms and procedures built into a system to safeguard the information system.*

*Types of Controls*:

- ***Integrity Controls:*** *Directly related to Application's Data. Controls that reject invalid data inputs, prevent unauthorized data outputs, and protect data and programs against accidental or malicious tampering. These controls integrated into application programs and the database.*

  - ***Input Control***: *controls that prevent invalid or erroneous data from entering the system*

    - **Value Limit**: Ensure numerical data input is valid or not.
    - **Completeness**: Ensure all required data is present. *(e.g. when a shipping address is*
      *entered, the system might check whether enough information has been provided*
      *for successful delivery.)*
    - **Data Validation**: Ensure that data entry fields are correct (e.g. Grades should have a set of predefined grades such as A, B, C, D and F, and reject any other entries.) or Zip Code also vary from country to country.
    - **Field Combination:** review various combinations of data inputs. Such as accept the terms of using an application.

  - ***Output Control:*** controls that ensure output arrives at the proper destination and is accurate, current, and complete.

    - Physical access controls to printers.
    - Discarded output control.
    - Access controls to programs that display or print.
    - Formatting and labeling of printed outputs.
    - Labeling of electronic outputs.
      

  - ***Backup and recovery:*** Protect software and data from hardware failure or malicious destruction.

  - ***Fraud Prevention.*** : In order to do a fraud, there must exist opportunity, motivation and rationalization.

    - **Opportunity**: Ability to commit a fraud such as generate false vendor payments due to unrestricted access to of a payable system.

    - **Motivation:** A desire for the results of the fraud.

    - **Rationalization:** An excuse for committing the fraud. For example, an employee might falsify
      financial reports to stave off bankruptcy, thus enabling fellow workers to keep their jobs.

    - Fraud cannot be controlled but Opportunity can be.

      <img src="https://i.imgur.com/2pw4tPj.png" alt="Fraud Triangle" style="zoom:67%;" />

    - Fraud risks and prevention techniques

      <img src="https://i.imgur.com/ZfqZA63.png" alt="Fraud risks and prevention techniques" style="zoom:80%;" />



- ***Security Controls***: related to controlling the underlying structure of the operating system and the network. The primary focus is on external threats

- **Security controls have two further objectives:**

  1. Maintain a stable, functioning operating environment for users and application
     systems (usually 24 hours a day, 7 days a week).

  2. Protect information and transactions during transmission across insecure
     environments such as public wireless networks and the Internet.

- ***Access Controls.***
  - **Authentication**: is the process of identifying users who request access to sensitive resources.
  - **Multifactor authentication** uses multiple methods for increased reliability such as two-step factor authentication.
  - **Authorization**: is the process of allowing or restricting a specific authenticated user’s access.
  - **Access Control List**: A list of users that attached to a specific resource and have access with it.

- **Categories of system users**: 
  - **Unauthorized Users**: people who aren’t allowed access to any part or function of the system.
  - **Registered/Authorized Users**: people who are authorized to access the system.
  - **Privileged users**: Managers or System Administrators that who have access to the source code, executable program, and database structure of the system.



***Check P.176- P.179 and slides.***

- ***Data Encryption.***
  - Symmetric Key Encryption
  - Asymmetric Key Encryption
- ***Digital Signature and certificates.***
- ***Secure Transactions.***
  - SSL 
  - TLS
  - IPSec
  - HTTPS