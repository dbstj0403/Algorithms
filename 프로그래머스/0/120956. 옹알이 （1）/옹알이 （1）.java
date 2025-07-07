class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String word : babbling){
            String replaced = word.replace("aya", "-");
            replaced = replaced.replace("ye", "-");
            replaced = replaced.replace("woo", "-");
            replaced = replaced.replace("ma", "-");
          
            if(replaced.replaceAll("-", "").isEmpty()){
                answer++;
            }
        }
        
        return answer;
    }
}