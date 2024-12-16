class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String result = "", result2 = "";
        for(int i= 0;i<num_list.length;i++) {
            if(num_list[i]%2==1) {
                result = result + Integer.toString(num_list[i]);
            } else result2 = result2 + Integer.toString(num_list[i]);
        }
        answer = answer + Integer.parseInt(result) + Integer.parseInt(result2);
        return answer;
    }
}