import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = 0, m = 0, t = 0;
        h = sc.nextInt();
        m = sc.nextInt();
        if(h>=0){
            h = h*60;
            t = h + m;
            t = t - 45;
            if(t<0) {
                t = t + 24*60;
            } else t = t;
        }
        System.out.println((t/60)+" "+(t%60));
        
    }
}