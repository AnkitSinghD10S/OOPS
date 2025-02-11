public class HierarchicalInheritence {
    public static void main(String[] args) {
        b o1 = new b();
        o1.showA();
        ca o2 = new ca();
        o2.showA();
    }   
}

class a{
    public void showA(){
        System.out.println("class a");
    }
}
class b extends a{
    public void showB(){
        System.out.println("class b");
    }
}
class ca extends a{
    public void showC(){
        System.out.println("class c");
    }
}