class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        //체력에 맞게 개미들을 데리고 가야된다 
        
        
        for(int i=1; i<=hp;i++)
        {
            if(i%5 ==0)
            {
                answer++;
            }
            
            
            
        }
        
        
        return answer+(hp%5)/3+(hp%5)%3;
    }
}