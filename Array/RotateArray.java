public class RotateArray {
    public static void rotate(int []a,int k){
        int n=a.length-1;
        k=k%(n+1);
        if(n>1){
            rev(0,n,a);
            rev(0,k-1,a);
            rev(k, n, a);
        }
    }
    public static void rev(int i,int j,int a[]){
        while(i<j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
    }
}
