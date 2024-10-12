import java.util.*;
class Main {
    public static void main(String[] args) {
        int a=0, b=0;
        Scanner sc = new Scanner(System.in);
        int result = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>0){
            if(b<10) {
                result = a+b;
            }
        }
            
        
        System.out.println(result);
    }   
    
}