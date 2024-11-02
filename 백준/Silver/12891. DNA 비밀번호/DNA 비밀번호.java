import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.StringTokenizer;
class Main {
    static int myArr[];
    static int checkArr[];
    static int checkSecret;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken()); // 전체 배열 길이
        int p = Integer.parseInt(st.nextToken()); // 비번 배열 길이
        int result = 0; // 답이 몇개 있는지?
        checkArr = new int[4]; // 일치하는지 검사하는동안 있는 배열
        myArr = new int[4];  // 내가 현재 있는 배열
        char A[] = new char[s]; // 전체 배열
        checkSecret = 0; // 전부 다 일치하면 4가 될 변수

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkSecret++;
            }
        }

        for (int i = 0; i < p; i++) { // 부분문자열 처음 받을때 세팅
            Add(A[i]);
        }
        if(checkSecret == 4) result++;

        // 슬라이딩윈도우 (p가 위에서 8일경우, 위 반복문은 7까지만 실행되고, 아래 반복문은 8부터, 즉 한칸 이동한 상태부터 동작하므로 슬라이딩윈도우인것임.)
        for (int i = p ; i < s ; i++) {
            int j = i - p; // 맨오른쪽이 i, 맨왼쪽이 j 범위를 유지하면서 한칸씩 이동
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4) result++;
        }
        System.out.println(result);
        br.close();


    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) checkSecret++;
                break;

        }
    }

    
}