# [Adaptive Library Management System]
## Dr. Magda Tsintsadze
### Quy Nguyen - Dhruv Shah
### SDSU Global: CS635 FALL 2024
### Sept. 29, 2024


#### **Design Documentation**
Originally we thought the project was going to be a simple Adaptive Library Management System. Our design is modeled
as close as we could to the MVC design which incorporates several design patterns in itself. This made the most sense
because we had a user console that is our viewer or presentation to the user, a controller that would respond to user
inputs, and the model our application object (the class models and interactions with the library database). 

Class and interface relationships.
We wanted to be able to have a Transactions interface that would be implemented by the User, LibraryItem, and Loan classes
because they all share the same behavior of adding, removing, and searching requests to database.

Interfaces:
Our approach for intercommunication between the user and the database would be mediated by a controller. We applied the
command design pattern to the AdministratorInterface. We also wanted to include the Adaptor design pattern to be able
to send User, LibraryItem, or Loan objects directly and have the Adaptor translate it into the data needed for the
database interface.

We decided on using abstract classes for people and library items. This would allow us to show an example of class
hierarchy by being able to create derived classes that inherit attributes from the abstract class. The abstract class
is never instantiated.

<img title="User Class Diagram" alt="Current Class Diagram" width="926" src="reportImages/User.png">

Our decision to have a libraryItem as an abstract class as well is because there are many library items in a library
such as books, magazines, journals, film, and the list goes on. They all have one thing in common, and it is an id
associated with the item. From the abstract class we can expand it with subclasses that could have attributes specific
to the item type.

<img title="LibraryItem Class Diagram" alt="Current Class Diagram" width="1250" src="reportImages/LibraryItem.png">


<img title="AdminInterface" alt="Current Class Diagram" width="1678" src="reportImages/AdministratorInterface.jpg">

<img title="Adapter" alt="Current Class Diagram" width="2012" src="reportImages/DBConsoleAdapter.png">

