import java.util.*;
class Main {
    public static void main(String[] args) {
        int a=0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();        
        
        if(a<60){
            System.out.println("F");
        } else if(a<70) {
            System.out.println("D");
        } else if(a<80){
            System.out.println("C");
        } else if(a<90){
            System.out.println("B");
        } else if(a<=100){
            System.out.println("A");
        }
        
    }
}