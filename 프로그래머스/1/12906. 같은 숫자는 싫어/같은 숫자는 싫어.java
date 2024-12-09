import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answerList = new ArrayList<>();

        //int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                answerList.add(arr[i]);
                //j++;
            }

        }

        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}