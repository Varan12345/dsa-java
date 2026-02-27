import java.util.HashMap;

public class targetsum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=6;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int c=target-arr[i];
            if(map.containsKey(c)){
                System.out.println(map.get(c)+" "+i);
            }
            map.put(arr[i],i);
        }
    }
}
