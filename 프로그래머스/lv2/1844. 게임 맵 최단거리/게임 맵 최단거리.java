import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        
        // 방문 경로를 담을 큐 선언
        
        Queue<int[]> que = new LinkedList<>();
        
        // 움직인 횟수와 방문 여부를 체크할 check 배열 선언
        int h = maps.length;
        int w = maps[0].length;
        int[][] check = new int[maps.length][maps[0].length];
        
        // 시작점인 0,0 은 반드시 방문하므로 움직인 횟수 추가
        
        check[0][0] = 1;
        
        // 큐에 0,0 좌표 방문했다고 담기
        
        que.add(new int[]{0,0});
        
        // 반복문을 통해 상하좌우 이동해서 목적지로 도달(최초 도착 경로 = 최단 경로)
        
        while(que.size()>0){
            
            int[] xy = que.poll();
            
            int x = xy[0];
            int y = xy[1];
            
            if(x==h-1 && y==w-1){
                
                return check[x][y];
                
            }
            
            if(x<h-1 && maps[x+1][y]==1 && check[x+1][y]==0){
                que.add(new int[]{x+1,y});
                check[x+1][y] = check[x][y]+1;
                
            }
            
            if(x>0 && maps[x-1][y]==1 && check[x-1][y]==0){
                que.add(new int[]{x-1,y});
                check[x-1][y] = check[x][y]+1;
                
            }
            
            if(y>0 && maps[x][y-1]==1 && check[x][y-1]==0){
                que.add(new int[]{x,y-1});
                check[x][y-1] = check[x][y]+1;
                
            }
            
            if(y<w-1 && maps[x][y+1]==1 && check[x][y+1]==0){
                que.add(new int[]{x,y+1});
                check[x][y+1] = check[x][y]+1;
                
            }
            
            
        }
        
        
        
        return -1;
    }
    
    
    
}


// 초기에 dfs 재귀 호출로 풀어보려고 한 시도 ( 효율성이 실패 )

// class Solution {
//     public int solution(int[][] maps) {
        
//         this.answer = maps.length*maps[0].length+1;
        
        
//         findRoot(maps,0,0,1);
//         if(answer==maps.length*maps[0].length+1){
            
//             answer = -1;
            
//         }
        
//         return this.answer;
//     }
    
    
    
//     private int answer = 0;
    
//     private boolean arrive = false;
    
//     public void findRoot(int[][] maps, int y, int x, int count){
            
        
//             if(x==maps.length-1 && y==maps[0].length-1 && answer>count){
                
                
//                 this.answer = count;
//                 arrive = true;
                
//             }
        
            
//             if(maps[x][y]==1 || arrive == false){
                
//                 maps[x][y]=0;
//                 if(y<maps[0].length-1 && maps[x][y+1]==1){
                    
//                     findRoot(maps,y+1,x,count+1);
                    
//                 } 
                
//                 if(x<maps.length-1 && maps[x+1][y]==1) {
                    
//                     findRoot(maps,y,x+1,count+1);
                    
//                 }
                
//                 if(x>0 && maps[x-1][y]==1){
                    
//                     findRoot(maps,y,x-1,count+1);
                    
//                 }
                    
                    
                
//                 maps[x][y]=1;
                
//             } else {
                
//                 return;
                
//             }
                
//     }
        
//     }
    