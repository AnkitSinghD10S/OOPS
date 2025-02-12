public class OverLoadingandOverridding{


    // overloading
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }

    public String sum(String a, String b){
        return a+b;
    }


    public static void main(String[] args) {
        OverLoadingandOverridding o = new OverLoadingandOverridding();
    //    System.out.println(
    //        o.sum(10, 0)
    //    );
    //    System.out.println(
    //        o.sum(19,9,1)
    //    );
    //    System.out.println(
    //        o.sum("ankit","singh")
    //    );

        SBI bank1 = new SBI();
        PNB bank2 = new PNB();
        bank1.RateOfInterset();
        bank2.RateOfInterset();
        Bank bank = new Bank();
        bank.RateOfInterset();
    }
}
// Overriding

class Bank{
    public void RateOfInterset(){
        System.out.println("rate of interest is 5%");
    }
}

class SBI extends Bank{
    @Override
    public void RateOfInterset(){
        System.out.println("Rate of interest is 6%");
    }
}
class PNB extends Bank{
    @Override
    public void RateOfInterset(){
        System.out.println("Rate of interest is 7%");
    }
    
}
