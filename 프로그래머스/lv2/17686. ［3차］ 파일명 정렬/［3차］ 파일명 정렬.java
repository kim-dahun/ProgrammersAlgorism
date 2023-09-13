import java.util.*;

class Solution {
    
    String[] files = new String[20];
    
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        
        this.files = files;
        
        Arrays.sort(files, (o1,o2) -> {
            
            String[] s1 = comparing(o1);
            String[] s2 = comparing(o2);
            
            int result = s1[0].compareTo(s2[0]);
            
            if(result==0){
                
                int n1 = Integer.parseInt(s1[1]);
                int n2 = Integer.parseInt(s2[1]);
                
                result = Integer.compare(n1,n2);
                
            } 
            
            return result;
            
        });
        
        return this.files;
    }
    
    public String[] comparing(String words){
        int check = 0;
        String head = "";
        String number = "";
        boolean breaking = false;
        for(int i = 0 ; i<words.length(); i++){
            if(breaking == true){
                break;
            }
            
            String word = "" + words.charAt(i);
            switch(check){
                    
                case 0:
                    if(word.matches(".*[0-9].*")){
                        i--;
                        check++;
                        
                    } else {
                        head+=word;
                    }
                    break;
                case 1:
                    if(!word.matches(".*[0-9].*") || number.length()>4){
                        i--;
                        check++;
                    } else {
                        number += word;
                    }
                    break;
                case 2:
                    breaking = true;
                    break;
                    
            }
            
        }
        
        return new String[]{head.toLowerCase(), number};
        
    }
    
    
    
}