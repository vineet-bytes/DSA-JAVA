public class SquareofSortedArray {
    public static int [] square(int []nums){
        int []ans=new int[nums.length];
        int i=0,j=nums.length-1,pos=j;
        while(i<=j){
            if(Math.abs(nums[i])<Math.abs(nums[j])){
                ans[pos]=nums[j]*nums[j];
                j--;
                pos--;
            }
            else{
                ans[pos]=nums[i]*nums[i];
                i++;
                pos--;
            }
        }return ans;
    }
}
