import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());
        
        long[] s = new long[n+1];
        st = new StringTokenizer(bf.readLine());
        for(int i = 1 ; i <= n ; i++) {
            s[i] = s[i-1] + Integer.parseInt(st.nextToken());
        }
        for(int q = 0 ; q < quizNo ; q++){
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(s[j]-s[i-1]);
            
        }
        
    }
}