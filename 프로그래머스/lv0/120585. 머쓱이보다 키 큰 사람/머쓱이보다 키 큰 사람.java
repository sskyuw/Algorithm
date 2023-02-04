class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
     
        
        //키 배열 array ,  본인 키 height
        
        for(int i=0; i<array.length;i++) //키 배열동안 반복 
        {
            if(array[i]>height)
            {
                answer++;
            }
        }
        
           return answer;
    }
}