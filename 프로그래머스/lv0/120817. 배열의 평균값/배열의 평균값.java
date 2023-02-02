class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int temp = 0;
        double total =0;
            
        
        // 배열의 길이만큼 싸이클 
            for(int i=0; i<numbers.length;i++)
            {
                // 옮겨담음 
                temp = numbers[i];
                total += temp;
              
            }
        
        answer = total/numbers.length;
        
        return answer;
    }
}