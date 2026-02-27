class Animal {
    String color="white";
    }
class Dog extends Animal{
    String color="red";
    void display() {
        System.out.println(color);
        System.out.println(super.color);
    }
}



public class keyword {

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.display();
    }
}
