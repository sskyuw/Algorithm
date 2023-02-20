class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        //제한사항
        if((0<=num1&&100>=num1)|| (0<=num2&&100>=num2))
        {
            answer = num1*num2;
        }
        
        else 
        {
            System.out.println("제한사항에 해당되지 않습니다.");
        }
        
        return answer;
    }
}