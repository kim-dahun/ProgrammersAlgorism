import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Deque<int[]> que = new ArrayDeque<>();
        LinkedList<int[]> list = new LinkedList<>();
        for(int i = 0 ; i<priorities.length ; i++){
            
            que.add(new int[]{i,priorities[i]});
            list.add(new int[]{i,priorities[i]});
            
        }
        // priorities => 순차 뽑기 후 정렬.
        boolean chk = true;
        
        while(que.size()>0){
            
            int[] check = que.poll();
            
            for(int[] y : que){
                
                if(check[1]<y[1]){
                    
                    que.add(check);
                    chk = false;
                    break;
                    
                }
                
            }
            if(chk==true){
                
                answer++;
                if(check[0]==location){
                    System.out.println(check[1]);
                    return answer;
                    
                }
                
            }
            chk=true;
        }
        
        
        
        return answer;
    }
}