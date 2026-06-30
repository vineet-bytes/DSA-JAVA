import java.util.*;

public class LadersinArray {
    public static int [] lader(int a[]){
        List<Integer>ll=new ArrayList<>();
        int m=Integer.MIN_VALUE;;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]>m){
                ll.add(a[i]);
                m=a[i];
            }
        }
        int o[]=new int[ll.size()];
        for(int i=0;i<ll.size();i++){
            o[i]=ll.get(i);
        }
        return o;
    }
}
