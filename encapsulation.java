class ATM{
    private int paisa;

    public ATM(int r) {
        this .paisa = r;
    } 
     public int gatter (int a){
        return paisa-a;
     }
    }

public class encapsulation {
    public static void main(String[] args) {
        ATM a1=new ATM(1000);
        System.out.println(a1.gatter(100));
    }
}
