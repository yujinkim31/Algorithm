class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int length = num_str.length();
        String[] a = num_str.split("");
        for (int i = 0;i<length;i++) {
        answer = answer + Integer.parseInt(a[i]);
            
        }
        
        
        return answer;
    }
}