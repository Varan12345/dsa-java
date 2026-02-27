abstract class Animal {
    abstract void sound();
}
class cat extends Animal {
    void sound() {
        System.out.println("The cat meows.");
    }
} class dog extends Animal {
    void sound() {
        System.out.println("The dog barks.");
    }
} class cow extends Animal {
    void sound() {
        System.out.println("The cow moos.");
    }
} class lion extends Animal {
    void sound() {
        System.out.println("The lion roars.");
    }
}

public class abstract1 {
    public static void main(String[] args) {
        Animal c1=new cat();
        Animal d1=new dog();
        Animal cow1=new cow();
        Animal lion1=new lion();
        c1.sound();
        d1.sound();
        cow1.sound();
        lion1.sound();
    }
    
}
