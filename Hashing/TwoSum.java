import java.util.*;
public class TwoSum {
    public static int [] Two_Sum(int []a,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int c=target-a[i];
            if(map.containsKey(c)){
                return new int[]{map.get(c),i};
            }
            map.put(a[i],i);
        }
        return new int [] {-1,-1};
    }
}
