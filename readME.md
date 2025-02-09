# Inheritance








# Interface 
An interface is a set of abstract methods you would want your class to implement. These methods are public and abstract by default(you don't have to explicitly use the "abstract" keyword), and any class implementing your interface will need to implementations of those methods.
 It is used to achive abstraction and multiple inheritance

    - An interface can be used when we want to achieve 100% abstraction. On the
    other hand, abstract classes can be used to achieve anything between 0—100%
    abstraction.    
    An interface cannot have constructors because we cannot create objects of an
    interface.
    If you want a class to achieve multiple inheritances, there is only one way:
    interfaces.
    If an interface is made private, or if the methods in it are made private or
    protected, then a compilation error will be thrown.





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