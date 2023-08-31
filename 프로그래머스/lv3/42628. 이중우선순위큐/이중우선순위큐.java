import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        LinkedList<Integer> list = new LinkedList<>();
        int max = 0;
        int min = 0;
        for(int i = 0 ; i<operations.length ; i++){
            
            String[] arr = operations[i].split(" ");
            
            if(arr[0].equals("I")){
                int element = Integer.parseInt(arr[1]);
                
                boolean check = false;
                for(int j = 0 ; j<list.size(); j++){
                    
                    if(list.get(j)<element){
                        
                        list.add(j,element);
                        check=true;
                        break;
                    }
                    
                }
                if(check==false){
                    
                    list.add(element);
                    
                }
                
            } else if(arr[0].equals("D")){
                
                if(list.size()!=0){
                    
                    if(arr[1].equals("1")){
                        
                        list.removeFirst();
                        
                    } else{
                        
                        list.removeLast();
                        
                    }
                    
                }
                
            }
            
        }
        
        if(list.size()==0){
            
            answer = new int[]{0,0};
            
        } else{
            
            answer = new int[]{list.getFirst(),list.getLast()};
            
        }
        
        return answer;
    }
}