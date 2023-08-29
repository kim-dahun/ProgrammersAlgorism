class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        // 되던게 왜 안되지?
        // 학교 좌표 m-1,n-1 집 좌표 0,0
        // 움직이는 건 오른쪽, 아래만 가능 y++ => 오른쪽, x++ => 아래쪽
        int[][] map = new int[n][m];
        
        for(int i = 0 ; i<puddles.length ; i++){
            
            map[puddles[i][1]-1][puddles[i][0]-1] = -1;
            
        }
        boolean checki = true;
        boolean checkj = true;
        for(int i = 0; i<n; i++){
            
            for(int j = 0 ; j<m ; j++){
                
                if(i==0 && j==0){
                    
                    continue;
                    
                }
                
                if(i==0){
                    
                    if(checki==true){
                    
                        if(map[i][j]==-1){
                            
                            
                            checki=false;
                        
                        } else {
                            
                            map[i][j]=1;
                            
                        }
                    } else {
                        
                        map[i][j]=-1;
                        
                    }
                    
                } else if(j==0){
                    
                    if(checkj==true){
                    
                        if(map[i][j]==-1){
                            
                            
                            checkj=false;
                        
                        } else{
                            
                            map[i][j]=1%1000000007;
                            
                        }
                        
                        
                    } else {
                        
                        map[i][j]=-1%1000000007;
                        
                    }
                    
                } else {
                    
                    if(map[i][j]==-1){
                        
                        continue;
                        
                    } else{
                        
                        int plusi = 0;
                        int plusj = 0;
                        
                        if(map[i-1][j]!=-1){
                            plusi = map[i-1][j];
                        } 
                        if(map[i][j-1]!=-1){
                            plusj = map[i][j-1];
                        }
                        
                        map[i][j]=(plusi+plusj)%1000000007;
                        
                        
                    }
                    
                }
                // System.out.println("i = " + i + " / j = " + j + " / val = " + map[i][j]);
            }
            
        }
        
        
              
        
        
        answer = map[n-1][m-1]%1000000007;
        
        
        
        
        return answer;
    }
}