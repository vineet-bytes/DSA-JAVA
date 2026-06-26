import java.util.*;

class NextGreaterElementI{
    public int[] nextGreaterElement(int[] a, int[] b) {
        HashMap<Integer,Integer>map=new HashMap<>();
        Stack<Integer>stack=new Stack<>();
        for(int i=b.length;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()<=b[i]){
                stack.pop();
            }
            if(stack.isEmpty()&&stack.peek()<=b[i]){
                map.put(b[i],-1);
            } 
            else{
                map.put(b[i],stack.peek());
            }
            stack.push(b[i]);
        }
        for(int i=0;i<a.length;i++){
            a[i]=map.get(a[i]);
        }
        return a;
    }

}