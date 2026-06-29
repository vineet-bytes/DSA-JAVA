public class RearrangeElebySign {
    public static int [] Rearrange(int []a){
        int n=a.length;
        int temp[]=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                temp[neg]=a[i];
                neg+=2;
            }
            else{
                temp[pos]=a[i];
                pos+=2;
            }
        }
        return temp;
    }
}
