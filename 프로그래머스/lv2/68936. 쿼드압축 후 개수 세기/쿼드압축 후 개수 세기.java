import java.util.*;

class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        
        int divide = arr.length / 2;
        
        map.put(0,0);
        map.put(1,0);
        int check = arr[0][0];
        map.put(check,map.get(check)+1);
        boolean allcheck = false;
        for(int i = 0; i<arr.length; i++){
            
            for(int j = 0; j<arr.length; j++){
                
                if(check!=arr[i][j]){
                    allcheck=true;
                    map.put(check,0);
                    break;
                }
                
            }
            
        }
        
        if(allcheck==false){
            return new int[]{map.get(0),map.get(1)};
        }
        
        dfs(0,0,divide,divide,arr,divide);
        dfs(divide,0,divide*2,divide,arr,divide);
        dfs(0,divide,divide,divide*2,arr,divide);
        dfs(divide,divide,divide*2,divide*2,arr,divide);
        
        answer[0]=map.get(0);
        answer[1]=map.get(1);
        
        return answer;
    }
    
    Map<Integer,Integer> map = new HashMap<>();
    
    public void dfs(int x, int y, int xl, int yl, int[][] arr, int divide){
        if(divide<2){
            return;
        }
        int values = arr[x][y];
        boolean start = false;
        for(int i = x; i<xl;i++){
            
            for(int j = y; j<yl ; j++){
                
                if(values!=arr[i][j]){
                    start = true;
                    break;
                    
                }
                
            }
            
        }
        
        if(start==false){
            map.put(values,map.get(values)+1);
            return;
        } else {
            divide/=2;
            if(divide>=2){
                dfs(x,y,xl-divide,yl-divide,arr,divide);    
                dfs(x,y+divide,xl-divide,yl,arr,divide);
                dfs(x+divide,y,xl,yl-divide,arr,divide);
                dfs(x+divide,y+divide,xl,yl,arr,divide);
            } else {
                
                for(int i = x; i<xl;i++){
            
                    for(int j = y; j<yl ; j++){
                
                        map.put(arr[i][j],map.get(arr[i][j])+1);        
                
                    }
            
                }
                
            }
            
            return;
        }
        
        
        
    }
    
}