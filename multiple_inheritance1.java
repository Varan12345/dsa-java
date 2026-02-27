interface A{
    void run();
}
interface B{
    void run();
}
class c implements A,B{
    public void run(){
        System.out.println("Running");
    }
    public void fun1(int a){
        System.out.println("Running fun1 with value: "+a);
    }
}


public class multiple_inheritance1 {
    public static void main(String[] args) {
        c obj=new c();
        obj.run();
        obj.fun1(5);
    }

    
}
