class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int count = 1;
        for(int i = 0 ; i<prices.length ; i++){
            
            for(int j = i+1 ; j<prices.length-1 ; j++){
                
                if(prices[i]<=prices[j]){
                    
                    count++;
                    
                } else {
                    
                    break;
                    
                }
                
            }
            answer[i]=count;
            
            count = 1;
        }
        answer[answer.length-1]=0;
        return answer;
    }
}