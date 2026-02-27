class Animals {
    void eat(){
        System.out.println("This is parent class");
    }   
}
class dog extends Animals{
    void bark(){
        System.out.println("This is child class");
    }
}
class cat extends Animals{
    void meow(){
        System.out.println("meow meow");
    }
}


public class hierarchial_inhertance {
    public static void main(String[] args) {

        dog d1=new dog();
        d1.eat();
        d1.bark();
        cat c1=new cat();
        c1.meow();
    }
}
