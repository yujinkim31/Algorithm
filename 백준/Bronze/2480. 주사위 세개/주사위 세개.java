import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[3];
        A[0] = Integer.parseInt(sc.next());
        A[1] = Integer.parseInt(sc.next());
        A[2] = Integer.parseInt(sc.next());

        Arrays.sort(A);

        if(A[0]==A[1] && A[1]==A[2]){
            System.out.println(10000+A[0]*1000);
        } else if (A[0]==A[1] || A[1]==A[2]) {
            int a = A[0]==A[1] ? A[0] : A[1];
            System.out.println(1000+a*100);
        } else {
            System.out.println(A[2]*100);
        }
        
    }
}