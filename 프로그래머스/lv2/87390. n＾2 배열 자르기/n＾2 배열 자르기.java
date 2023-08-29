class Solution {
    public int[] solution(int n, long left, long right) {
         
        
        
        long length = right-left+1;
        int anscount = 0;
        int[] answer = new int[(int)length];
        
        
        if(left==right){
            answer = new int[] {};
            return answer;
        } 
        
        for(long i = left; i <= right ; i++ ){
            long x = i/((long)n);
            long y = i%((long)n);
            if(x>y){
                answer[anscount]=(int)x+1;
            } else if (x<y) {
                answer[anscount]=(int)y+1;
            } else if (x == y){
                answer[anscount]=(int)x+1;
            }
            anscount++;
        }
        
        // for(int i = 0 ; i < n ; i++){ 
            
//             for(int j = 0; j < n ; j++){
                
                
                
//                 if(nc>=left && nc<=right){
//                     if(j>i){ // 피라미드 형 배열 숫자 기입
//                     answer[anscount]=j+1;
//                      } else if (j<i){
//                     answer[anscount]=i+1;
//                     } else if (j==i){
//                     answer[anscount]=i+1;
//                     }
                    
                    
                    
//                     anscount++;
//                     if(anscount==answer.length){
//                         return answer;
//                     }
//                 }
                
                
                
//                 nc++;
//             }
            
//         }
        
        
       
        
        
        
        
        return answer;
    }
}