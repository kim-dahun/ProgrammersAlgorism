import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        
        Arrays.sort(routes, (x1,x2) -> {
            
            return x1[1]-x2[1];
            
        });
        
        List<int[]> list = new ArrayList<>();
        list.add(routes[0]);
        for(int i = 1 ; i<routes.length; i++){
            boolean check = false;
            for(int[] x : list){
                
                if(x[1]>=routes[i][0]){
                    check = true;
                    break;
                }
                
            }
            
            if(check==false){
                answer++;
                list.add(routes[i]);
            }
            
        }
        
        return answer;
    }
}