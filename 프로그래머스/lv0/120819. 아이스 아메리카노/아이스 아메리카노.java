class Solution {
    public int[] solution(int money) {
        final int americano =5500;
        int[] answer = {};
        int cup =0;
        
        
        //money 가지고있는돈 
        //answer {아메리카노 잔수 ,남는돈} 
        //5500이 아메리카노 한잔 -> 현재돈에서 살수 있는 잔의 수 
       
        cup = money/americano;
        
        answer = new int[]{cup,money-(americano*cup)};
        return answer;
    }
}