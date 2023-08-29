class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int tangle = brown+yellow;
        int browncatch = 0;
        int yellowcatch = 0;
        for(int i = 1 ; i<=tangle; i++){
            
            if(tangle%i==0){
                
                int[][] ans = new int[i][tangle/i];
                
                for(int j = 0 ; j<ans.length; j++){
                    
                    for(int k = 0 ; k<ans[j].length ; k++){
                        
                        if(j!=0 && j!=ans.length-1 && k!=0 && k!=ans[j].length-1){
                            
                            yellowcatch++;
                            
                        } else {
                            
                            browncatch++;
                            
                        }
                        
                    }
                    
                }
                
                if(yellowcatch==yellow && browncatch==brown){
                    
                    answer[0]=i;
                    answer[1]=tangle/i;
                }
                yellowcatch=0;
                browncatch=0;
            }
            
        }
        return answer;
    }
}