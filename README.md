QUESTION 4
(a) Difference between a for loop and a while loop in Java 
For Loop
While Loop
Used when the number of iterations is known.
Used when the number of iterations is not known beforehand.
Initialization, condition, and update are written in one statement.
Initialization and update are written separately.
More compact and easier for counting loops.
More flexible for condition-based repetition.

(b) Single-Dimensional Array
Stores one type of data in a linear structure.
Example: Daily rainfall readings for 30 days.
double[] rainfall = new double[30];
rainfall[0] → Day 1 rainfall
rainfall[29] → Day 30 rainfall
Multi-Dimensional Array
Stores data in rows and columns.
Example: Rainfall and soil moisture for 30 days.
double[][] sensorData = new double[30][2];
Where:
sensorData [i] [0] = Rainfall
sensorData [i] [1] = Soil Moisture
Example:

Day     Rainfall        Soil Moisture
  1	20	55
  2	15	48
A multi-dimensional array is useful when storing several related measurements together.

(c) 
 
(d)
 

QUESTION NUMBER ONE
(a) Relationships in the UML Diagram 
Interface Realization (implements)
Account implements the Statement interface.
Relationship: Realization
Inheritance (Generalization)
SavingsAccount extends Account.
CurrentAccount extends Account.
Relationship: Generalization/Inheritance
Aggregation
Customer has Account objects.
Shown by the hollow diamond at the Customer end.
Relationship: Aggregation ("has-a" relationship)
Multiplicity between Customer and Account
Near Account: 0..
Near Customer: 1
Meaning:
One customer can own zero or many accounts.
Each account belongs to one customer.












(b)Account.java
 





(c ) SavingsAccount.java
 









CurrentAccount.java
 

(d)Customer Class
 









Test program
 

QUESTION FIVE
a) 
A constructor is a special method used to create and initialize an object. It runs when an object is created using new.
Example:
 Usage:
Customer c = new Customer("Annitah");
Here, the constructor sets the customer’s name when the object is created.
Java does not use destructors like C++. In C++, destructors are used to clean up objects manually when they are no longer needed. Instead, Java uses garbage collection, where the JVM automatically removes objects from memory when they are no longer reachable.
Example:
Customer c = new Customer("Annitah");
c = null;
After c = null, the object may later be removed by the garbage collector. The programmer does not directly destroy it.
So, a constructor is used when an object is created, while garbage collection handles cleanup after an object is no longer used.
b)
The deep inheritance design becomes problematic because each new channel combination needs a new class. For example:
SmsNotifier
EmailNotifier
SmsEmailNotifier
SmsPushNotifier
EmailPushWhatsAppNotifier
SmsEmailPushWhatsAppNotifier
This quickly becomes hard to maintain. If management adds another channel such as Telegram, many new combination classes may be needed. Also, the requirement says channels and rules must change without recompiling, but inheritance fixes behavior in source code.
A better design is to use composition and polymorphism.
 This design is better because a single notification can be sent through many channels at once. The selected channels can be read from configuration, so rules can change without creating new inheritance classes.
c)
 This class uses the Singleton pattern because:
1.	The constructor is private, so other classes cannot create new objects using new GatewayConfig().
2.	The static field instance stores the single shared object.
3.	The static method getInstance() lazily creates the object only when it is first needed.
It is not always necessary to make the class final, but it is recommended. If the class is not final, another class could extend it and possibly interfere with the Singleton idea. Making it final prevents inheritance and protects the design more strongly.
Example:
public final class GatewayConfig {
    // singleton code
}

d)
Generic Class and Immutability
Changing a record-list class into a generic class like TxnList<T> can break immutability because T may be a mutable object.
Example:
TxnList<Customer> list;
Even if the list itself cannot add or remove items, the Customer objects inside it might still be changed:
customer.setName("New Name");
So the list appears immutable, but its contents can still be modified from outside.
One remedy is to make defensive copies of mutable objects when adding them and when returning them. Another option is to restrict T to immutable types or store only objects that do not provide mutating methods. For example, the class can return an unmodifiable view and avoid exposing its internal list directly:
return Collections.unmodifiableList(items);
This helps protect the list structure, although the safest solution also requires the elements themselves to be immutable or defensively copied.
# 3rd-EXAMS
Containing cods for my project
