interface Animal{
    void run();
}
class Dog implements Animal{
    public void run(){
        System.out.println("Dog is running");
    }
}
class Cat implements Animal{
    public void run(){
        System.out.println("Cat is running");
    }
}
public class interface1 {
    public static void main(String[] args) {
        Animal d1=new Dog();
        Animal c1=new Cat();
        d1.run();
        c1.run();
    }
}