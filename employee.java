
public class employee{
     
    String name;
    int id;
    int salary;
public employee(int salary,String name,int id){
    this.salary=salary;
    this.name=name;
    this.id=id;
    
}
    void details(){
        
         System.out.println(salary+salary*0.5 +"   "+ name+ "   ");
         System.out.println(id+" ");
    }


    public static void main(String[] args) {
        employee str1=new employee(10000,"himanshu",123);
        str1.details();
       
    }

}