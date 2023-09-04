import java.util.*;

class Solution {
    public int[] solution(String msg) {
        int[] answer = {};
        Map<String,Integer> map = new HashMap<>();
        
        for(int i = 65 ; i<=90; i++){
            
            String a = "" + (char) i;
            
            map.put(a,i-64);
            
        }
        
        List<Integer> list = new ArrayList<>();
        char[] c1 = msg.toCharArray();
        
        for(int i = 0 ; i<c1.length ; i++){
            
            String check = "" + c1[i];
            String check2 = check;
            boolean check3 = false;
            for(int j = i+1 ; j<c1.length ; j++){
                
                check2 = check;
                check = check + c1[j];
                
                if(map.get(check)==null){
                    check3 = true;
                    map.put(check,map.size()+1);
                    break;
                    
                }
                
            }
            if(check3 == false){
                list.add(map.get(check));
                i = i+check.length()-1;
            } else {
                list.add(map.get(check2));
                i = i+check2.length()-1;
            }
            
        }
        
        answer = new int[list.size()];
        
        for(int i = 0 ; i<answer.length; i++){
            
            answer[i] = list.get(i);
            
        }
        
        return answer;
    }
}