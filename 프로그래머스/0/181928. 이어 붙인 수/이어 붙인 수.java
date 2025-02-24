class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String str1 = "";
        String str2 = "";
        
        for(int i=0; i<num_list.length; i++){
            int a = num_list[i];
            
            if(a % 2 == 1){
                String.valueOf(a);
                str1 += a;
            }
            else {
                String.valueOf(a);
                str2 += a;
            }
        }
        
        int istr1, istr2;
        istr1 = Integer.valueOf(str1);
        istr2 = Integer.valueOf(str2);
        
        answer = istr1 + istr2;
        return answer;
    }
}