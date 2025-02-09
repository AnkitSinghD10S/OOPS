public class SuperKeyWord {
 public static void main(String[] args) {
    Dog dog = new Dog();
    dog.printColor();
 }   
}

class Ani{
    String color="white";
    Ani(){
        System.out.println("Constructor of parent class Ani");
    }
}

class Dog extends Ani{
    String color="black";
    Dog(){
        super();
    }
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}