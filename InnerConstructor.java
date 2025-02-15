class Constructor{
    public static void main(String[] args) {
        InnerConstructor o1 = new InnerConstructor(10,"hello this is parameterized constructor");
        System.out.println("Parameterized constructor created with message: " + o1.Message);
        InnerConstructor o2 = new InnerConstructor();
        System.out.println("Default constructor created with message: " + o2.Message);
    }

}

public class InnerConstructor {
    int val;
    String Message;

    // parameterized Constructor
    InnerConstructor(int val,String Message){
        this.val=val;
        this.Message=Message;
        System.out.println(Message);
    }

    InnerConstructor(){
        System.out.println("Hello world is this the default constructor");
    }
    
}

