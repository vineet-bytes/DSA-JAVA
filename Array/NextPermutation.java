public class NextPermutation {
    public static void nextpermutation(int []a){
        int n=a.length;
        int l=-1;
        for(int i=n-2;i>=0;i--){
            if (a[i]<a[i+1]) {
                l=i;
                break;
            }
        }
        if(l==-1){
            reverse(a, 0, n-1);
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(a[i]>a[l]){
                int t=a[i];
                a[i]=a[l];
                a[l]=t;
                break;
            }
        }
        reverse(a, l+1, n-1);
    }
    public static void reverse(int [] a,int i, int j){
        while (i<j) {
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            j--;
            i++;
        }
    }
}
