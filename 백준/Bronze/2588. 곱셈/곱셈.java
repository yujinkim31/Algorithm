import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "", b = "";
        String[] first = new String[3];
        String[] second = new String[3];

        a = sc.next();
        b = sc.next();
        
        for(int i = 0;i<3;i++) {
            first[i] = a.substring(i,i+1);
            second[i] = b.substring(i,i+1);
        }
        
        System.out.println(Integer.parseInt(a)*Integer.parseInt(second[2]));
        System.out.println(Integer.parseInt(a)*Integer.parseInt(second[1]));
        System.out.println(Integer.parseInt(a)*Integer.parseInt(second[0]));
        System.out.println(Integer.parseInt(a)*Integer.parseInt(b));
        
    }
}