class Solution {
    public int solution(int sticker[]) {
        int answer = 0;

        int[] cut = new int[sticker.length];
        
        int[] dp = new int[sticker.length];
        
        
        // dfs(cut, sticker, 0,0);
        if(sticker.length==1){
            
            return sticker[0];
            
        } else if(sticker.length==2){
            
            return sticker[0] > sticker[1] ? sticker[0] : sticker[1];
            
        }
        dp[0]=sticker[0];
        dp[1]=sticker[1]>sticker[0]?sticker[1]:sticker[0];
        int stock = sticker[sticker.length-1];
        sticker[sticker.length-1]=0;
        for(int i = 0 ; i<sticker.length-2; i++){
            
            dp[i+2] = dp[i+1] > sticker[i+2]+dp[i] ? dp[i+1] : sticker[i+2]+dp[i];
            
        }
        
        if(max<dp[sticker.length-1]){
            max=dp[sticker.length-1];
        }
        
        
        sticker[sticker.length-1]=stock;
        sticker[0]=0;
        dp = new int[sticker.length];
        dp[1]=sticker[1];
        dp[2]=sticker[2]>sticker[1] ? sticker[2] : sticker[1];
        
        for(int i = 1 ;i<sticker.length-2; i++){
            
            dp[i+2]= dp[i+1] > sticker[i+2]+dp[i] ? dp[i+1] : sticker[i+2]+dp[i];
            
        }
        
        if(max<dp[sticker.length-1]){
            max=dp[sticker.length-1];
        }
        
        answer = max;
        
        return answer;
    }
    
    private int max = 0;
    
//     public void dfs(int[] check, int[] sticker, int count, int idx){
        
//         for(int i = idx; i<sticker.length; i++){
            
//             if(check[i]==0){
                
//                 int a = i<1 ? sticker.length-1 : i-1;
//                 int b = i>sticker.length-2 ? 0 : i+1;
                
//                 check[a]+=1;
//                 check[b]+=1;
//                 check[i]+=1;
//                 dfs(check,sticker,count+sticker[i],idx+1);
//                 check[a]-=1;
//                 check[b]-=1;
//                 check[i]-=1;
//                 // System.out.println(count);
                
//             }
            
//         }
        
//         if(max<count){
            
//             max = count;
            
//         }
        
        
//     }
    
}