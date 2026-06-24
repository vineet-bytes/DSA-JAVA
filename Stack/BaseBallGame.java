import java.util.Stack;

public class BaseBallGame {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(!operations[i].equals("C")&&
               !operations[i].equals("D")&&
               !operations[i].equals("+")){
                int num = Integer.parseInt(operations[i]);
                stack.push(num);
            }else if(operations[i].equals("C")){
                stack.pop();
            }else if(operations[i].equals("D")){
                stack.push(stack.peek()*2);
            }else{
                int t=stack.pop();
                int t2=stack.peek();
                stack.push(t);
                stack.push(t+t2);
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }

}
