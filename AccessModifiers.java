public class AccessModifiers {
    public static void main(String[] args) {
        Students s = new Students("ankit",21,9);
        // s.name="ankit";
        // s.age=21;
        // s.roll_no=9;
        // s.print();

    }
}

// default
/* 
class Students{
    String name;
    int age;
    int roll_no;
    void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll_no);
    }
}
*/

// private
// not available outside class
class Students{

    Students(String name,int age,int roll_no){
        this.name=name;
        this.age=age;
        this.roll_no=roll_no;
        System.out.println(name +" "+age+" "+roll_no);
    }
    private String name;
    private int age;
    private int roll_no;
    void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll_no);
    }
}