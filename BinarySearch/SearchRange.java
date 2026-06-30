public class SearchRange {
    public static int [] search(int []a,int target){
        int i=0,j=a.length-1;
        while (i<=j) {
            int m=i+(j-i)/2;
            if(a[m]==target){
                int r=m;
                while (r+1<a.length&&a[r+1]==target) {
                    r++;
                }
                int l=m;
                while (l-1>=0&&a[l-1]==target) {
                    l--;
                }
                return new int[] {l,r};
            }
            else if(a[m]<target){
                i=m+1;
            }
            else{
                j=m-1;
            }
        }
        return new int[] {-1,-1};
    }
}
