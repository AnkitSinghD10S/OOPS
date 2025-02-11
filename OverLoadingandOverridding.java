public class OverLoadingandOverridding {

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
       System.out.println(
           o.sum(10, 0)
       );
       System.out.println(
           o.sum(19,9,1)
       );
       System.out.println(
           o.sum("ankit","singh")
       );

        
    }
}
