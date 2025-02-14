public class Encapsulation {
    public static void main(String[] args) {
        student s1 = new student();
        s1.set_details("ankit", 21,190);
        System.out.println(s1.get_age());
        System.out.println(s1.get_name());
        System.out.println(s1.get_roll_no());
        String name = s1.get_name();
        name="dheeraj";
        System.out.println(name);
        System.out.println(s1.get_name());

    }
}

class student{
    private String name;
    private int age;
    private int roll_no;

    public String  get_name(){
        return name;
    }
    public int  get_age(){
        return age;
    }
    public int  get_roll_no(){
        return roll_no;
    }

    public void set_details(String name,int age,int roll_no){
        this.name=name;
        this.age=age;
        this.roll_no=roll_no;
    }
}