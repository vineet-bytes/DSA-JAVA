public class MinimumKBlackBlocks {
    public int minimumRecolors(String blocks, int k) {
        int w=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                w++;
            }
        }
        int a=w;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i)=='W'){
                w++;
            }
            if(blocks.charAt(i-k)=='W'){
                w--;
            }
            a=Math.min(a,w);
        }return a;

    }
    
}
