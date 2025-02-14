# Inheritance

      - Inheritance is an important pillar of OOP(Object-Oriented Programming). It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class. In Java, Inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class. In addition, you can add new fields and methods to your current class as well.  

### Hierarchical Inheritance

    When more than one class is inherited from a single base class, we call it Hierarchical Inheritance. The child classes inherit the features of the parent class. It allows code reusability and improves the readability of code.

## Super keyword

> use of super key word

      - To invoke parent class variable.
      - To invoke parent class method.
      - To invoke parent class constructor.

# Interface

      - An interface is a set of abstract methods you would want your class to implement. These methods are public and abstract by default(you don't have to explicitly use the "abstract" keyword), and any class implementing your interface will need to implementations of those methods.

      - It is used to achive abstraction and multiple inheritance

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

    - its is called static binding or early binding

> condition for overloading

-   methods should be of same name.
-   different number of arguments.
-   smae number of argument but different data types .

## Method Overriding

    Overriding in Java occurs when a subclass implements a method which is already defined in the superclass or Base Class. The method in the subclass must have the same signature as in the superclass. It allows the subclass to modify the inherited methods.Use override word to indicate that method is overriden.

    - Its is also called dynamic binding or late binding.

> Rules for Java Method Overriding

-   The Overriding and Access Modifier
-   Override methods can not be overridden (method decleared with final keyword)
-   Static methods can not be overridden
-   Private methods can not be overridden
-   Method must have the same return type

## Polymorphism

    The word ‘polymorphism’ means ‘having many forms’. In Java, polymorphism refers to the ability of a message to be displayed in more than one form. This concept is a key feature of Object-Oriented Programming and it allows objects to behave differently based on their specific class type.

-   Types of polymorphism
    -   Compile-Time Polymorphism (Method overloading)
    -   Runtime Polymorphism (Method Overriding)

> Advantages of Polymorphism

-   Increases code reusability by allowing objects of different classes to be treated as objects of a common class.
-   Improves readability and maintainability of code by reducing the amount of code that needs to be written and maintained.
-   Supports dynamic binding, enabling the correct method to be called at runtime, based on the actual class of the object.
-   Enables objects to be treated as a single type, making it easier to write generic code that can handle objects of different types.

> Disadvantages of Polymorphism

-   Can make it more difficult to understand the behavior of an object, especially if the code is complex.
-   This may lead to performance issues, as polymorphic behavior may require additional computations at runtime.

# Access Modifiers

## Public

      - It allows to access the methods or varibles everywhere in the package and also in other packages .

## Private

      - It only allow the method or varible to be available in the declared class only .

## Proteced

      - It allows to access method and variables in the same package and in the class of another package that has extended the class to access the variables .

## Default

      -It does out allow the classes fo another package to access methods and  variables and only allows the classes of same package to acces them .

# Encapsulation

    -It is a fundamental principle of object-oriented programming that involves bundling data (fields) and methods that operate on that data within a single unit, typically a class.

      - This mechanism allows for data hiding, where the internal state of an object is protected from direct access by external classes, ensuring that data can only be accessed or modified through public methods known as getters and setters.

# Abstraction

      - Data abstraction is the process of hiding certain details and showing only essential information to the user.

      - Abstraction can be achieved with either abstract classes or interfaces.
