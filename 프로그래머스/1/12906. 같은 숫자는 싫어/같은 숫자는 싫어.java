import java.util.*;

public class Solution {
//     public int[] solution(int []arr) {
//         int[] answer = {};
        
//         // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//         System.out.println("Hello Java");

//         return answer;
//     }
    public static Object[] solution(int[] arr) {

        //ArrayList<Integer> answer = new ArrayList<>();

        //Stack<Integer> st = new Stack<>();
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(arr[0]);
        for (int i = 1; i < arr.length; i++) {

            if (d.peekLast() != arr[i]) {
                d.addLast(arr[i]);
            }
        }

        // while (d.size() > 0) {
        //     System.out.println(d.pollFirst() + "    " + d.peekFirst());
        // }

        // return new int[] { -1 };

        return d.toArray();
    }
}