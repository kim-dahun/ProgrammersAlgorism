class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean check = false;
        for(int i = 1; i<arr.length ; i++){
            
            for(int j = arr[i] ; j<=arr[i]*arr[i-1] ; j++){
                
                if(j%arr[i]==0 && j%arr[i-1]==0){
                    arr[i]=j;
                    
                    break;
                }
                
            }
            
        }
        
        return arr[arr.length-1];
    }
}