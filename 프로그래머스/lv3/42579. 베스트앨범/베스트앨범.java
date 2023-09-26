import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        Map<String, Integer> summap = new HashMap<>();
        
        List<int[]> results = new LinkedList<>();
        for(int i = 0 ; i<genres.length; i++){
            
            if(summap.get(genres[i])==null){
                summap.put(genres[i],plays[i]);
            } else {
                summap.put(genres[i],summap.get(genres[i])+plays[i]);
            }
            
        }
        
        for(int i = 0 ;i<genres.length; i++){
            
            // 0idx = 고유번호, 1idx = 총재생수, 2idx = 해당 고유번호의 재생수
            int[] sums = new int[]{i,summap.get(genres[i]),plays[i]};
            results.add(sums);
            
        }
        
        Collections.sort(results,(o1,o2)->{
            
            return o2[1]-o1[1];
            
        });
        
        
        
        Collections.sort(results,(o1,o2)->{
            
            if(o2[1]==o1[1]){
                
                if(o2[2]==o1[2]){
                    
                    return o1[0]-o2[0];
                    
                } else {
                    
                    return o2[2]-o1[2];
                    
                }
                
            } else {
                
                return o2[1]-o1[1];
                
            }
            
            
        });
        List<Integer> lists = new ArrayList<>();
        for(int i = 0 ; i<results.size(); i++){
            
            String a = genres[results.get(i)[0]];
            
            if(b.equals("")){
                b = a;
            }
            
            if(b.equals(a)){
                if(count<2){
                count++;
                lists.add(results.get(i)[0]);
                }
            } else {
                b = a;
                lists.add(results.get(i)[0]);
                count = 1;
                

            }
            
            
        }
        
        answer = new int[lists.size()];
        
        for(int i = 0 ; i<lists.size(); i++){
            
            answer[i] = lists.get(i);
            
        }
        
        
        return answer;
    }
    private int count = 0;
    private String b = "";
}