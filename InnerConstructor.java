class Constructor{
    public static void main(String[] args) {
        InnerConstructor o1 = new InnerConstructor(10,"hello this is parameterized constructor");  
        InnerConstructor o2 = new InnerConstructor();  
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

