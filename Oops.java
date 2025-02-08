class Oops{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="ankit";
        System.out.println(s1.name);
        s1.name ="dheeraj";
        System.out.println(s1.name);
        s1.print();
        
    }
}

class Student{
    String name="raj";
    String address;
    int age;
    
    public void print(){
        System.out.println(name);
    }
}