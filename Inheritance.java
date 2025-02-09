public class Inheritance {
    public static void main(String[] args) {
        InnerInheritance  o1 = new InnerInheritance ();
        o1.name ="ankit";
        o1.salary=100000000;
        // System.out.println(o1.age);
        // System.out.println(o1.name);
        // System.out.println(o1.salary);
        o1.show();
        car c1 = new car();
        c1.color="red";
        c1.milegae=50;
        c1.name="b6e";
        c1.price=10000000;
        c1.sunroof=false;
        c1.display();

        C o2 = new C();
        o2.run();
    }    
}


// Multilevel inheritance
class InnerInheritance extends InnerInheritance_1{
    String name;
    int age=19;
    InnerInheritance(){
        System.out.println("parent of Inheritance");
    }
    
}

class InnerInheritance_1 extends InnerInheritance_2{
    InnerInheritance_1(){
        System.out.println("paraent of Innerinheritance");
        super.show();
    }
    void show(){
        System.out.println("midddle class");
    }
    int salary;
    int bankbalance;
}

class InnerInheritance_2{
    InnerInheritance_2(){
        System.out.println("parent of InnerInheritance_1");
        System.out.println(age);
    }
    void show(){
        System.out.println("hello world");
    }
    int age=11;
}



// Single level inheritance
class Vehicle{
    int price ;
    int milegae;
    String color;
}

class  car extends Vehicle{

    void display(){
        System.out.println(price +" "+ milegae+" "+color+" "+name +" "+sunroof);
    }


    String name ;
    boolean sunroof;
}


// Multiple Inheritance

interface a{
    public void run();
}
interface b{
    public void run();
}

class C implements a,b{
    public void  run(){
        System.out.println("C class run method");
    }
}