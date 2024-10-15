import java.util.*;
class Main {
    public static void main(String[] args){
        int n = 0;        
        int max = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max) 
                max = arr[i];
        }
        
        for(int i = 0; i < n ; i++){
            sum = sum + arr[i];    
        }
        System.out.println((sum * 100.0 / max) / n);
        
        
        
    }
}