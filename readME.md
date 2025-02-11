# Inheritance

### Hierarchical Inheritance

    When more than one class is inherited from a single base class, we call it Hierarchical Inheritance. The child classes inherit the features of the parent class. It allows code reusability and improves the readability of code.


   ## Super keyword
   > use of super key word

      - To invoke parent class variable.
      - To invoke parent class method. 
      - To invoke parent class constructor.





# Interface 
An interface is a set of abstract methods you would want your class to implement. These methods are public and abstract by default(you don't have to explicitly use the "abstract" keyword), and any class implementing your interface will need to implementations of those methods.
 It is used to achive abstraction and multiple inheritance

    - An interface can be used when we want to achieve 100% abstraction. On the
    other hand, abstract classes can be used to achieve anything between 0—100%
    abstraction.    
    - An interface cannot have constructors because we cannot create objects of an
    interface.
    - If you want a class to achieve multiple inheritances, there is only one way:interfaces.
    - If an interface is made private, or if the methods in it are made private or protected, then a compilation error will be thrown.





 > Advantages of interfaces in Java
 
 • Interfaces can be used to enforce a contract- that is, provide a specification
 that classes must implement certain methods if they want to use that interface
 
 • Interfaces are used to achieve multiple inheritance
 
 • Interfaces can be used to achieve loose coupling - With interfaces, we can ensure
 that changes in one class do not affect other classes.
 

> Disadvantages of interfaces in Java

• Interfaces expose their member variables since they must be public.

• Since an interface can be thought of as a contract implemented by multiple
classes, in certain cases, modifying the interface could lead to unpredictable
behavior for the classes implementing them.


## Method Overloading
    Method overloading is a feature in programming languages like Java and C++ that allows defining multiple methods with the same name but different parameters within the same class

> condition for overloading
   
   - methods should be of same name.
   - different number of arguments.
   - smae number of argument but different data types .
   
