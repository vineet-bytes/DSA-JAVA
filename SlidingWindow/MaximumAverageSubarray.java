public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int s=0;
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        int mx=s;
        for(int i=k;i<nums.length;i++){
            s=s+nums[i]-nums[i-k];
            mx=Math.max(mx, s);
        }
        return (double)mx/k;
    }
}
