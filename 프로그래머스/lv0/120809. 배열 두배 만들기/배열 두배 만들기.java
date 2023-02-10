class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        
        
        for(int i=0; i<numbers.length; i++)
        {
            // numbers 길이만큼 반복 
            
            //answer = new int[] {numbers[i]++};
           
			answer[i] = numbers[i]*2;
            
           
           // 길이 자동생성 
           
            
            // 여기서 길이에 또 저장하고 다음반복해야됨 
         
            
        }
        
        return answer;
    }
}