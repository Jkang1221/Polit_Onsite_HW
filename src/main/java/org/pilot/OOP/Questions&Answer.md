### 1.What is Object in Java and why we need object?
Object is an instance of class with attributes and methods.
We need objects to model real-world entities, organize code, and enable reuse and encapsulation.

### 2.What is Inheritance and how many types of inheritance are supported by Java?
Create a new object based on existing ones, inheriting its methods and properties.
Two, implements and extends,

### 3. What is the diamond problem in Java? And how can we resolve the problem?
   The diamond problem in Java refers to a situation where a class inherits from two interfaces that have methods with the same signature. This creates ambiguity as the compiler cannot determine which method to execute.
   To resolve this, Java requires the class to explicitly override the conflicting method, providing a specific implementation.


### 4.What is Interface and what is abstract class? What are the differences between them?
Abstract class:
- It is a class and can only extend one.
- Has regular methods and abstract methods
- Represents what it is
Interface:
- It can implement multiple.
- Only has abstract methods
- Represents what it can do


### 5.What is Polymorphism? And how Java implements it?
Overload and override.
Overload: In the same class, two or more methods have the same method name, but have different inputs including numbers of input and types of input.
Override: A class has the same methods as its super class, but has its own implementation.

### 6.What is the differences between overriding and overloading?
Overload and override.
Overload: In the same class, two or more methods have the same method name, but have different inputs including numbers of input and types of input.


### 7.What is Encapsulation? How Java implements it? And why we need encapsulation?
It is a principle of object oriented program that involves bundling methods and data into a single unit called a class and controlling access through modifiers

We can use access modifiers or provide public setter, getter method to implement it.

Make sure sensitive data is hidden from users.


### 8.What is the difference between abstraction and encapsulation?
abstraction hides complexity by focusing on what needs to be done, while encapsulation hides the internal state and requires all interaction to be done through an object's methods.


### 9.What is toString() and why we need it?
toString() in Java is a method that returns a string representation of an object, useful for debugging and logging.
It can be overridden to provide a more meaningful description of an object's state.


### 10.Can we use this keyword in constructor and why? 
It is used to refer to the current object instance
to differentiate between instance variables and parameters 
when they have the same name, and to invoke another constructor 
within the same class.