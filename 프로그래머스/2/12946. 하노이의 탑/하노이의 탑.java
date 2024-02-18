import java.util.*;

class Solution {
    
    List<int[]> movingHistory = new ArrayList<>();
    
    public int[][] solution(int n) { // 2,3,4,5,6,7,8,9,10... 크기 오름차순으로 1번 기둥에 꼽혀있음.
        int[][] answer = {}; // 
        
        moveRing(1,3,2,n);
        
        answer = new int[movingHistory.size()][2];
        
        for(int i = 0 ; i<movingHistory.size(); i++){
            
            for(int j = 0 ; j<2 ; j++){
                answer[i][j] = movingHistory.get(i)[j];
            }
            
        }
        
        return answer;
    }
    
    public void moveRing(int start, int end, int mid, int n){
        
        if(n==1){
            int[] hist = new int[2];
            hist[0] = start;
            hist[1] = end;
            movingHistory.add(hist);
            return;
        }
        
        moveRing(start,mid,end,n-1);
        int[] movRing = new int[2];
        movRing[0] = start;
        movRing[1] = end;
        movingHistory.add(movRing);
        
        moveRing(mid,end,start,n-1);
        
    }
}