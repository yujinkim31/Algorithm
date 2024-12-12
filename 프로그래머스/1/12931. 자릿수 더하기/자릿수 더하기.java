import java.util.*;

public class Solution {
    public int solution(int N) {
        int answer = 0;
        String result = Integer.toString(N);
        String newResult = "";
        
        for(int i = 0;i < result.length() ; i++){
            newResult = result.substring(i,i+1);
            answer = answer + Integer.parseInt(newResult);
        }
        
        
        //while(newResult.length>0){
            
        //}

        

        return answer;
    }
}