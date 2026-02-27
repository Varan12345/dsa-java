
class Student{
    int price ;
    String name;
    String title;
    String author;
public Student(int price,String name,String title,String author){
    this.price=price;
    this.name=name;
    this.title=title;
    this.author=author;
}
    void details(){
        
         System.out.println(price-price*0.1 +"   "+ name+ "   ");
         System.out.println(title+"    "+author);
    }
}
public class book {
    public static void main(String[] args) {
        Student str1=new Student(99,"himanshu","right person","kk");
        str1.details();
       
    }
}
