import java.util.*;
public class ValidParentheses {
    public static boolean is(String s){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='['||c=='('||c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                char t=st.pop();
                if(t=='{'&&c!='}') return false;
                if(t=='('&&c!=')') return false;
                if(t=='['&&c!=']') return false;
            }
        }return st.isEmpty();
    }
}
