import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String longString = "";
        String newS = "long ";
        for (int i = 0; i < (N/4); i++) {
            longString = longString.concat(newS);
        }
        System.out.println(longString+"int");
    }
}