class tempreturee {
    private int c;

    public tempreturee(int c) {
        this.c = c;
}

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
public class tempreture2 {
    public static void main(String[] args) {
        tempreturee t1=new tempreturee(100);
        t1.setC(100);
        int c=t1.getC();
        int f=(c*9/5)+32;
        System.out.println("tempreture in fahrenheit is: "+f);
        System.out,System.out.println();
    }
}
