# Design Pattern

> It is a description or template for how to solve a problem that can be used in many different situations.
Design patterns are formalized best practices that the programmer can use to solve common problems when designing an application or system.

## Introduction


#### < Design Principle >
1. Program to an interface, ont an implémentation.
:Clients refer to an interface and are independent of an implementation.
      * Cleanly separate interface and implementation.




2. Favor object composition  over class inheritance.

* Changing Behavior-Making a system independent of changing requirements.
  
  * Run-time flexibility via object composition
      
      * Strategy:Using different algorithms.
      
      * State:Changing the behavior of an object when its internal state changes.
      
      * Decorator: Adding responsibilities to an object dynamically.
      
      * Proxy: Controlling the way an object is accessed
  
  * Compile-time flexibility via class inheritance
      
      * Template Method: Defining a behavior.





* Changing object creation-Making a system independent of how its objects are created.

  * Run-time flexibility via object composition
	    
      * Abstract factory : Creating different families of objects.
      
	   * Builder: Creating different representations of a complex object.
	    
      * Prototype: Creating new objects by cloning prototype objects.

  * Compile-time Flexibility via class inheritance
	    
      * Factory Method: Creating an object



  * Singleton: Ensuring that a class has only one instance.



* Object structures-Working with complex object structures efficiently

  * Composite: Representing part-whole hierarchies as tree structures.
  
  * Iterator: Accessing the elements of an object structure.
  
  * Visitor: Defining new operations for the classes of an object structure
  
  * Flyweight:Supporting large numbers of fine-grained objects efficiently



* Object Collaboration-Avoiding tight coupling between interacting objects.

  * Observer: Defining a one-to-many dependency between objects.
  
  * Mediator: Avoiding tight coupling between a set of interacting objects.
  
  * Chain of responsibility: Avoiding tight coupling the sender of a request to its receiver.
  
  * Command: Avoiding tight coupling the sender of a request to its receiver.



* Changing Interfaces Independently
  
  * Adapter: Providing a different interface to an object.
  
  * Bridge:Decoupling an abstraction from its implementation.
  
  * Facade:Providing a simple interface to a complex subsystem.



* Storing and Restoring object state
  
  * Memento: Storing and restoring an object’s internal state without violating encapsulation.



* Interpreter/DomainSpecific Languages
  
  * Interpreter: Interpreting sentences in a simple language.

------
REFERENCE >
GoF_Design_Patterns_Reference



