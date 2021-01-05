# Chapter 3: Identifying User Stories and Use Cases

#### User Story

- **User Story**: *A scenario describes users' goals when they use a system.*
- User story is a ***quick less-formal way*** of identifying ***functional requirements***.
- **Agile** Development Methodology ***uses user stories*** because they focus on ***simplicity, value added and user collaboration***. 
- Users and stakeholders identify these ***user stories***.
- A user story focuses on ***who, what and why*** for each function:
  “As a <role played>, I want to <goal> so that <reason>.”
  
  - Example: *For example, some user stories for a bank teller might be:
     “As a **<u>teller</u>**, I want **<u>to make a deposit</u>** to quickly **<u>serve more customers</u>**.”*
- The final part of a user story is called ***Acceptance Criteria***.
- **Acceptance Criteria**: *functionalities that must be present in the final system for the user to be satisfied*.
  - <u>Examples</u>:
    - *Customer lookup must be by name or by account number.*
    - *It would be nice to display photo and signature of customer.*

    - *Any check hold requirements must be indicated.*

    - *Current balance and new balance must be displayed.*
  - Usages:
    - ***Limits the controversy*** between users and developers later in the project.
    - When the user story is implemented and refined, the acceptance criteria are used for ***testing.***

- Sample Example of A User Story. 

  ![](C:\Users\omara\Pictures\User story sample.PNG)

### Use Case

- **Use Case**: *A scenario or an activity a system performs in response to a request by the user.*
- Use cases ***require much documentation***, they focus on detailed steps carried out the actors and the system.
- In order to identify and make a successful use case, you need to apply two techniques:

##### 1. User Goal Technique

- ***Definition***: *What goals or objectives must be completed by the system for a specific user type (actor).*

- ***Steps***:
- Identify the actors and classify them in their ***functional role*** (e.g., shipping, marketing, sales).
  
- Classify those actors again in their ***organizational level*** (e.g., operational, management, executive).
  - As an analyst, Interview each actor type to ***determine their specific goals.***
  - Create a list of preliminary uses cases for each actor type.
  - As an analyst, You have to ***resolve issues such as duplicates and inconsistencies*** of the use cases.
  - Identify which ***actors need the same use cases.***
  - ***Review*** the completed list with each type of user and then with interested
    stakeholders.


  Note: Read P.73 example*.

  ##### 2. Event decomposition technique

- ***Definition:*** *What business events the system must respond to.*
- **Event:** *An event occurs at a specific time and place, can be described, and should be remembered by the system*
- In this technique, An analyst directs his attention to the see the system as a ***black box***. This means that analyst don't see the underlying implementation, just ***input and output***.
- Consider you have an event, such as working with customers all day. What does that mean? This - ***working with customers*** - mean that the system can include <u>adding new customers</u>, <u>updating customer records</u>, deleting customers, <u>following up on late-paying customers</u>, or <u>contacting former customers</u>. Therefore, the word ***decomposition*** meant to extract all uses cases from an event. All the underlined sentences are use cases.

- But all of the above is too broad to be useful. In other words, to much to include a ***single use case***. So in order to obtain the appropriate level of detail, An analyst need to consider ***elementary business processes*** (***EBPs***).
- **EBP**: *the most fundamental task in a business process, which leaves the system and data in a quiescent state; usually performed by one person in response to a business event*.
- **Another Definition**: *A task that's performed by **one person in one place** in response to a business event to leave the system and its data in **a stable and consistent state**.* 
- For Example, **Fill shopping cart** is a response to the business event “Customer wants to shop.” There is **one person** filling the cart, and **there is measurable value** for the customer as items are added to the cart. When the customer stops adding items and moves to another task, the system **remembers the current cart** and is ready to switch to the new task.
  
- **<u>Types of Events</u>**:
  - ***External Events***: *an event occurs outside the system, usually initiated by external actor.* 
  - ***Temporal Events***:
  - ***Internal/State Events:***