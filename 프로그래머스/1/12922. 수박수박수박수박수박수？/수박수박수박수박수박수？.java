class Solution {
    public String solution(int n) {
        StringBuilder ans = new StringBuilder("");
        // 수박수박수박....
        for(int i=1; i<=n; i++){
            if(i % 2 == 1){
                ans.append("수");
            }
            else{
                ans.append("박");
            }
        }
        
        return ans.toString();
    }
}