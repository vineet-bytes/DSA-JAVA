public class GuessHigherorLower {
    static int n=0;
    private int guess(int num){
        if(n!=0){
            return n;
        }
        else{
        n = (int)(Math.random() * 100) + 1; 
        return n;
        }           
    }
    public int guessNumber(int n) {
        int l=1;
        int r=n;
        while(l<=r){
            int m=l+(r-l)/2;
            if(guess(m)==0){
                return m;
            }
            else if(guess(m)==-1){
                r=m-1;
            }else{
                l=m+1;
            }
        }return -1;
    }    
}
