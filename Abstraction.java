public class Abstraction {
    
    public static void main(String[] args){
        Tata nexo = new Tata();
        nexo.fuelvalue();
        nexo.color();
    }

}

abstract class car{

    abstract public void fuelvalue();

    

    public void color(){
        System.out.println("black");
    }
}

class Tata extends car{
    @Override
    public void fuelvalue() {
        System.out.println("40000");
    }
}