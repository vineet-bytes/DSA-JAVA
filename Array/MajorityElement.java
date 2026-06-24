public class MajorityElement {
    public int majorityElement(int[] a) {
        int c=0;
        int ac=0;
        for(int i=0;i<a.length;i++){
            if(c==0){
                ac=a[i];
            }
            if(a[i]==ac){
                c++;
            }else{
                c--;
            }
            
        }return ac;
    }
}
