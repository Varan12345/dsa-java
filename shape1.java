abstract class shape{
    abstract void Area(int a,int b);
    
}
class circle extends shape{
    void Area(int a,int b){
        System.out.println("Area of circle is: "+(3.14*a*a));
    }
}
class rectangle extends shape{
    void Area(int a,int b){
        System.out.println("Area of rectangle is: "+(a*b));
    }
} 


public class shape1 {
    public static void main(String[] args) {
        shape s1=new circle();
        s1.Area(10,20);
        shape s2=new rectangle();
        s2.Area(10,20);
    }
}
