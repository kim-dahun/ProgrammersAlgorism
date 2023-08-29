class Solution {
    
    private int max = 0;
    
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        int count = 0;
        
        int[] check = new int[dungeons.length];
        
        findAnswer(check,dungeons,k,0);
        
        answer=max;
        
        return answer;
    }
    
    // 피로도, 던전길이, 방문여부, 던전입장횟수를 인수로 받아, 처리하는 메서드
    public void findAnswer(int[] check, int[][] dungeons, int k, int count){
        
        for(int i = 0 ; i<dungeons.length; i++){
            
            if(check[i]==0 && k>=dungeons[i][0]){ // 방문하지 않았고, 피로도가 입장가능 피로도 이상인 경우만 동작
                
                check[i]=1; // 방문처리
                
                
                findAnswer(check,dungeons,k-dungeons[i][1],count+1); // 다음 던전 탐색 재귀 메서드 호출
                check[i]=0; // 다시 첫 노드부터 탐색시작
            }
            
            // 탐색 완료 후 최댓값 갱신
            if(max < count){
                
                max = count;
                
            }
            
            
        }
        
    }
}