import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(1);
        for(int i = 2; i<=n; i++){
            int a = list.get(i-2);
            int b = list.get(i-1);
            list.add((a+b)%1234567);
        }
        
        answer = list.getLast();
        
        return answer;
    }
    
    
    
}