import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        
        List<String[]> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        
        for(int i = 0 ; i<record.length; i++){
            
            String[] s1 = record[i].split(" ");
            
            
            
                if(!s1[0].equals("Leave")){
                    
                    map.put(s1[1],s1[2]);
                    
                    
                }
                
                if(!s1[0].equals("Change")){
                    
                    list.add(s1);
                    
                }
            
            
        }
        
        answer = new String[list.size()];
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i<answer.length ; i++){
            
            String[] s1 = list.get(i);
            
            switch(s1[0]){
                    
                case "Enter":
                    str.append(map.get(s1[1])+"님이 들어왔습니다.");
                    break;
                case "Leave":
                    str.append(map.get(s1[1])+"님이 나갔습니다.");
                    break;
            
            }
            str.append("/");
        }
        
        answer = str.toString().split("/");
        
        
        
        return answer;
    }
}