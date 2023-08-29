import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        s = s.replace("{{","");
        s = s.replace("}}","");
        s = s.replace("},{","/");
        String[] s1 = s.split("/");
        
        Arrays.sort(s1,new Comparator<String>(){
            public int compare(String o1, String o2){
                
                return Integer.compare(o1.length(), o2.length());
            }
        });
        int[] answer = new int[s1.length];
        Set<String> set = new LinkedHashSet<>();
        for(int i = 0 ; i<s1.length; i++){
            
            if(i==0){
                
                set.add(s1[i]);
                continue;
            }
            String[] s2 = s1[i].split(",");
            for(int j = 0 ; j<s2.length ; j++){
                
                set.add(s2[j]);
                
            }
            
        }
        int count = 0;
        for(String x : set){
            
            answer[count] = Integer.parseInt(x);
            count++;
        }
        
        return answer;
    }
}