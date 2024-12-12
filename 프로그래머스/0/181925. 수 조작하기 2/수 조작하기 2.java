class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i= 0;i<numLog.length-1;i++) {
            int between = numLog[i+1]-numLog[i];
            
            switch (between) {
                case 1: answer = answer + "w";
                break;
                case -1: answer = answer + "s";
                break;
                case 10 : answer = answer + "d";
                break;
                case -10 : answer = answer + "a";
                break;
            }
        }
        
        
        return answer;
    }
}