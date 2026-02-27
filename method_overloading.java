class Main{
    void add(){
        System.out.println("this is method with no argument");
    }
    void add(int a){
        System.out.println("this is method with 1argument");
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
}
public class method_overloading {
    public static void main(String[] args) {
       Main m1=new Main();
       m1.add();
       m1.add(10);
       m1.add(10,20);  
    }
}
