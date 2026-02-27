class Person {
    void displayName() {
        System.out.println("Person Name: John Doe");
    }
}
class Student extends Person {
    void displayClass() {
        System.out.println("Student Grade: A");
    }
}
class Moniter extends Student {
    void checkDiscipline() {
        System.out.println("Role: Class Monitor");
    }
}


public class multi_level1 {
    public static void main(String[] args) {
       Moniter m1 = new Moniter();
       m1.displayName();    
         m1.displayClass(); 
         m1.checkDiscipline();
    }
}
