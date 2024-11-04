import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        //Scanner sc = new Scanner(System.in);
        //int T =  sc.nextInt();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()); 
        int T = Integer.parseInt(st.nextToken());
        //int i1 = Integer.parseInt(st.nextToken());

        //System.out.println("T = "+T);

        int a = 0;
        int b = 0;
        String arr[] = new String[T];
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(bf.readLine());     
            

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            arr[i] = String.valueOf(a+b);
        }
        bf.close();

        System.out.print(String.join("\n", arr));
    }
}