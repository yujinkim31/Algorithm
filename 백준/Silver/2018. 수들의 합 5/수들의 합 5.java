import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int startIndex = 1;
        int endIndex = 1;
        int sum = 1;
        int n = sc.nextInt();
        while(endIndex != n) {
            if(sum == n){
                count++ ; 
                endIndex++ ; 
                sum = sum + endIndex;
            } else if(sum > n) {
                sum = sum - startIndex;
                startIndex++ ; 
            } else {
                endIndex++ ; 
                sum = sum + endIndex;
            }
            
        }
        System.out.print(count);
        
    }
}