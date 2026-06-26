import java.util.*;

public class Dailytempraturecheck {
    public int[] dailyTemperatures(int[] temp) {
        int a[]=new int [temp.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            while(!stack.isEmpty()&&temp[stack.peek()]<=temp[i]){
                stack.pop();
            }
            if(stack.isEmpty()||temp[stack.peek()]<=temp[i]){
                a[i]=0;
            }
            else{     
                a[i]=stack.peek()-i;
            }stack.push(i);
        }return a;
    }
}
