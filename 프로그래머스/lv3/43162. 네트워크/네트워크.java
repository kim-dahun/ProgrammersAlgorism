class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] check = new int[n];
        for(int i = 0 ;i<computers.length; i++){
            
            if(check[i]==0){
                
                dfs(i, check, computers);
                answer++;
            }
            
        }
        
        return answer;
    }
    
    public void dfs(int start, int[] check, int[][] computers){
        
        for(int i = 0; i<computers[start].length; i++ ){
            if(i!=start && check[i]==0 && computers[start][i]==1){
                check[i]=1;
                dfs(i,check,computers);
                
            }
        }
        
    }
    
}