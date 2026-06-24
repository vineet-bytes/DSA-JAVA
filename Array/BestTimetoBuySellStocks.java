public class BestTimetoBuySellStocks {
    public static int stock(int []a) {
        int b=a[0];
        int p=0;
        for(int i=0;i<a.length;i++){
            int c=a[i]-b;
            p=Math.max(c, p);
            b=Math.min(a[i], b);
        }
        return p;
    }
    
}
