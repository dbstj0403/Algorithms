class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] items = polynomial.split("\\+");
        int[] nums = new int[2];
        
        for(String item : items){
            item = item.trim();

            if(item.contains("x")){
                item = item.replace("x", "").trim();
                int n = item.equals("") ? 1 : Integer.parseInt(item);

                nums[0] += n;
            }
            else{
                int n = Integer.parseInt(item);
                nums[1] += n;
            }
        }
        
        // 결과 문자열 생성
        if(nums[0] != 0 && nums[1] != 0){
            answer = (nums[0] == 1 ? "" : nums[0]) + "x + " + nums[1];
        }
        else if(nums[0] != 0){
            answer = (nums[0] == 1 ? "" : nums[0]) + "x";
        }
        else{
            answer = String.valueOf(nums[1]);
        }
        
        return answer;
    }
}