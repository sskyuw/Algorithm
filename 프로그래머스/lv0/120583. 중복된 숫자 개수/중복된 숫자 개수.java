class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
    
    
        for(int i=0; i<array.length;i++)
        {
            if(array[i] == n)
            {
                //array[i]와 n이같을때 추가 
                answer++;
            }
            
        }
            return answer;
        }
}