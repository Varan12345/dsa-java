//mutilevel inheritance
class Animals{
    void eat(){
        System.out.println("This is parent class");
    }
}
class dog extends Animals{
    void bark(){
        System.out.println("This is child class");
    }
}
class Puppies extends dog{
    void weep(){
        System.out.println("This is grand child class");
    }
}

public class single_inhertance {

    public static void main(String[] args) {
        dog d1=new dog();
        d1.eat();   
        d1.bark();
        Puppies p1=new Puppies();   
        p1.eat();
        p1.bark();
        p1.weep();
    }
}
