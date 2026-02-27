import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        // System.out.println(list.get(0));
        // list .set(0, "Hi");
        // System.out.println(list.get(0));
        // list.remove(1);
        // System.out.println(list);   
        // System.out.println(list.size());
        // System.out.println(list.contains("Java"));
        // System.out.println(list.isEmpty());
    }

}
