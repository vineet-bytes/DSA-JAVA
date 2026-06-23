public class MaximumNumberofVowels {
    private boolean isVowel(char c){
        return c=='a'||c=='i'||c=='e'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        int c=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                c++;
            }
        }
        int m=c;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                c++;
            }
            if(isVowel(s.charAt(i-k))){
                c--;
            }
            m=Math.max(m, c);
        }
        return m;
    }
}
