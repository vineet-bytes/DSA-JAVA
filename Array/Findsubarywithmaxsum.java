public class Findsubarywithmaxsum {
    //Kadane's Algorithm : Maximum Subarray Sum in an Array
    public static int sumofsubarray(int []a){
        long s=0;
        long m=Long.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            s+=a[i];
            if(s>m){
                m=s;
            }
            if(s<0){
                s=0;
            }
        }
        return (int)m;
    }
}
