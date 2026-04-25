class Animal {
    void sound() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks.");
        System.out.print("the dog")
    }
}
    class Cat extends Animal {
        void sound() {
            System.out.println("The cat meows.");
        }
    
}

public class overridding {
    public static void main(String[] args) {
        Animal d1=new Dog();
        d1.sound();
        Animal c1=new Cat();
        c1.sound();
}
}