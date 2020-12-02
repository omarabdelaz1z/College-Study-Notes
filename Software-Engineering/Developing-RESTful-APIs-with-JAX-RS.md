## Developing RESTful APIs with JAX-RS.

- *What is RESTful API*
- *RESTful API concepts*
- *How to implement it using JAX-RS*



- Web services: services exposed to the internet for programmatic access, So a programmer can write code to consume these services the API provides.
- These services are similar to web pages, when you access a web page, you can read and access the web page normally using HTML elements and so on such as HTML Forms and more.
- But in API, responses are not an HTML pages, However, they contains data in XML or JSON format.
- **REST** is acronym for **RE**presentational **S**tate **T**ransfer.
- RESTful are modern and lightweight and built upon concepts behind HTTP.
- Web Services Characteristics:

  - Exchange data happens over HTTP Protocol; The client sends HTTP Request and Server returns HTTP Response.

  - The client can have its own logic to represent the data.
  - Client can send any kind of HTTP methods such as POST, GET, etc..
  - No formal service definition for RESTful API.
  - RESTful has no specification, there no what's right and what's wrong.
- HTTP: Hyper Text Transfer Protocol, a way of exchange information aka hypertext.
- Hypertext is structured form of text that contains logical links (hyperlinks) to other text.
- HTTP concepts that inspire REST:

  - Resource based URIs
  - HTTP Methods:
    - GET: Get information from the server. - read-only methods 
    - POST: Submit Information to the server. - write method
    - PUT: Update information to the server. - //
    - DELETE: Remove a resource from the server. //

  - Metadata: extra information after receiving responses from the server. 
    - HTTP Status codes: 200, 404, etc..
  - Message headers: has two content types.
    - text/xml
    - application/json
- Consumers (developers) have to be aware of URIs.
- Best practices to use:
  - /profiles/{profileName} - RESTful resource based URI
  - URI contains nouns not verbs, profiles, messages, accounts and so on.
  - /messages/{message_id} - specific message - it's a type of instance URI
  - /messages - all messages - Collection resource URI
  - /messages/{message_id}/comments - all comments of message of message_id
  - /messages/{message_id}/comments/{comment_id} - specific comment of a message.
  - Query parameters for pagination in URIs
- PUT/GET/DELETE -> instance URI
- POST -> collection URI
- Collection URI Scenarios 
  - GET /messages
  - DELETE /messages/10/comments - delete all comments of message id 10
  - POST /messages/10/comments - creates a new comment for message 10.
  - PUT /messages/20/comments - replace all comments for message 20 with a new list of comments.
- Method Idempotence
  - Repeatable {GET-DELETE-PUT} - safely repeatable and idempotent
  - Non-Repeatable {POST} - cannot be repeated safely and non-idempotent
- Caching GET Responses.



- REST Responses can come in two formats, XML and JSON. JSON is preferable.
- Status Codes for CRUD operations 15:00 https://www.youtube.com/watch?v=ZyuPCYB-n5o
