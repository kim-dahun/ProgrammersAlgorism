class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int bvalue = sides[0] > sides[1] ? sides[0] : sides[1];
        int svalue = sides[0] < sides[1] ? sides[0] : sides[1];
        int sumvalue = bvalue+svalue;
        
        for(int i = bvalue+1 ; i<sumvalue; i++){
            
            answer++;
            
        }
        
        for(int i = bvalue-svalue+1 ; i<=bvalue; i++){
            
            answer++;
            
        }
        
        return answer;
    }
}