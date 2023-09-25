import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] s1 = new String[numbers.length];
        
        for(int i = 0 ; i<numbers.length; i++){
            
            s1[i]=""+numbers[i];
            
        }
        
        Arrays.sort(s1, (x1,x2) -> {
            
            return (x2+x1).compareTo(x1+x2);
            
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<s1.length; i++){
            
            sb.append(s1[i]);
            
        }
        answer = sb.toString();
        
        if(answer.charAt(0)=='0'){
            return "0";
        }
        
        return answer;
    }
}