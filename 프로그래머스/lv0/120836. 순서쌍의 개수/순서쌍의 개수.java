class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
        for(int i=1;i<=n;i++) //n의 수만큼 반복 
        {
         
            // 곱이 20이 될때 
            if(n%i==0)
            {
                answer++;
            }
            
                
            
        }
        
        return answer;
    }
}