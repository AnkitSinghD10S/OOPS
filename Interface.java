public class Interface {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal lion = new Lion();
        lion.run();
        tiger.run();
    }
}


class Lion implements Animal{
    public void run(){
        System.out.println("Lion is running");
    }
}

class Tiger implements Animal{
    public void run(){
        System.out.println("Tiger is running ");
    }
}

interface Animal{
    public void run();
}



