class emloyee{
    void work(){
        System.out.println("i am employee");
    }
}
class manager extends emloyee{
    void attendMeeting(){
        System.out.println("i am manager");
    }
}


public class single_level1 {
    public static void main(String[] args) {
        manager e1=new manager();
        e1.work();
       e1.attendMeeting();
    }
}
