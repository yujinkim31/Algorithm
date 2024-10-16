import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = 0, m = 0, pm = 0;
        h = sc.nextInt();
        m = sc.nextInt();
        pm = sc.nextInt();
        
        int resulthour = 0, resultmin = 0;
        resulthour = ((h*60)+m+pm)/60;
        resultmin = ((h*60)+m+pm)%60;
        if(resulthour>=24) resulthour = resulthour - 24;
        System.out.println(resulthour+" "+resultmin);
        
        
        
    }
}