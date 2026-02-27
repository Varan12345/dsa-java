import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        System.out.println(map);
        System.out.println(map.get("Two"));
        map.remove("One");
        System.out.println(map);
        System.out.println(map.containsKey("Three"));
        System.out.println(map.containsValue(2));
    }
}
