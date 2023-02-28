class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double re =0; 
    
        if((0<num1&&num1<=100) || (0<num2&&num2<=100))
        {
            re = ((double)num1/(double)num2)*1000;
            answer = (int)re;
          
        }
        
        return answer;
    }
}