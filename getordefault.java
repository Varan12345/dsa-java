import java.util.HashMap;
public class getordefault {
    public static void main(String[] args) {
    
       String str="hello" ;
    HashMap<Character,Integer> map=new  HashMap<>();
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        
        map.put (c,map.getOrDefault(c,0)+1);
    }
    System.out.println(map); 
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if(map.get(c)==1){
            System.out.println("First non repeating character is: "+c);
            break;
        }
    }
}
}