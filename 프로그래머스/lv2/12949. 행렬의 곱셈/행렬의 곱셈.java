class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        // 이 문제를 풀기 위해서는 기본적인 선형대수에 대한 지식이 필요할 것입니다.

        // A는 mn 행렬, B는 nk 행렬이라고 가정합니다. A의 열의 수와 B의 행의 수가 같을 때만 두 행렬을 곱할 수 있습니다.
        // 그러면 일반적으로 행렬 A와 행렬 B를 곱한 행렬 C=AB는 m*k 행렬이 되고 C의 i행 j열의 원소를 다음과 같이 구합니다.

        // C[i][j] = A[i][1]B[1][j] + A[i][2]B[2][j] + ... + A[i][n]*B[n][j]

        for(int i = 0 ; i<answer.length; i++){
            
            for(int j = 0 ; j<answer[i].length ; j++){
                
                for(int k = 0 ; k<arr2.length; k++){
                    
                    answer[i][j] += (arr1[i][k] * arr2[k][j]);
                    
                }
                
            }
            
        }
        
        
        return answer;
    }
}