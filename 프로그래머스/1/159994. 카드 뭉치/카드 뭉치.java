class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 카드 뭉치 두 개를 선물로 받음
        // 원하는 문장 goal을 만들수 있는가 없는가 판단하기 (순서 바꾸기 불가함)
        int len = goal.length;
        int card1Len = cards1.length;
        int card2Len = cards2.length;
        int card1Index = 0; // 현재 가장 위에 나와있는 카드 인덱스
        int card2Index = 0; 
        String answer = "Yes";
        for(int i=0; i<len; i++){
            if(card1Len > card1Index && goal[i].equals(cards1[card1Index])){
                card1Index++;
                continue;
            }
            else if(card2Len > card2Index && goal[i].equals(cards2[card2Index])){
                card2Index++;
                continue;
            }
            else{
                return "No";
            }
        }
      
        return answer;
    }
}