import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int count = 0;
        String[] s2 = skill.split(""); // skill 잘라서 원소 배열
        LinkedList<String> list = new LinkedList<>();
        for(int i = 0 ; i<skill_trees.length; i++){
            String[] s1 = skill_trees[i].split(""); // 스킬트리 잘라서 원소배열
            for(int j =0; j<s1.length ; j++){
                
                for(int k = 0 ; k<s2.length ; k++){
                    
                    if(s1[j].equals(s2[k])){
                        
                        list.add(s1[j]);
                        
                    }
                    
                }
                
                
            }
            
            if(list.size()!=0){
            if(list.getFirst().equals(s2[0])){
                for(int j = 0; j<list.size() ; j++){
                    
                    if(list.get(j).equals(s2[j])){
                        count++;
                        
                    }
                    
                }
            } else {
                
            }
            
            } else {
                
                
                
            }    
                
            if(count==list.size()){
                answer++;
                
            }
            list = new LinkedList<>();
            count=0;
        }
        
        return answer;
    }
}