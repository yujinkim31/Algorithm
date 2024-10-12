import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0, b=0;
        double result = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        if(0<a) {
            if(b<10){
                result = a/b;
            }
        }
        System.out.println(result);
    }
}