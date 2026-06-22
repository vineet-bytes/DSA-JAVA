import java.util.HashSet;

public class IntersectionofTwoArrays {
     public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        HashSet <Integer>l = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                l.add(nums2[i]);
            }
        }
        int []ans=new int[l.size()];
        int i=0;
        for(int num : l){
            ans[i]=num;
            i++;
        }
        return ans;

    }
}
