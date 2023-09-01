import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Arrays.sort(phone_book);
        
        for(int i = 0 ; i<phone_book.length-1; i++){
            int len = phone_book[i].length() > phone_book[i+1].length() ? phone_book[i+1].length() : phone_book[i].length();
            String s1 = phone_book[i].substring(0,len);
            String s2 = phone_book[i+1].substring(0,len);
            
            if(s1.equals(s2)){
                
                return false;
                
            }
            
        }
        
        return true;
    }
}