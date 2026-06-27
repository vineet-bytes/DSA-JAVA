public class XorQuestion {
    public static int Findthenumberthatappearsonce(int []a) {
        int xor=0;
        for(int i=0;i<a.length;i++){
            xor^=a[i];
        }
        return xor;
    }
}
