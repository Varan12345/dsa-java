class Rectangle1 {
    private int length;
    private int breadth;

    public Rectangle1(int l, int b) {
        length = l;
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }
    public int perimeter() {
        return 2*(length+breadth);
    }
}

public class rectangle {
    public static void main(String[] args) {
       Rectangle1 r1=new Rectangle1(10,20);
       System.out.println("Area of rectangle is: "+r1.area());
       System.out.println("Perimeter of rectangle is: "+r1.perimeter());


       System.out.println("");



    }
}
