class Solution {
    public int jump(int[] nums) {
        int farthest = 0; 
        int currentend = 0; 
        int count = 0;

        for(int i  = 0; i < nums.length - 1; i++){
            farthest = Math.max(farthest, i + nums[i]);

            if(i == currentend){
                count++;
                currentend = farthest;
            }
        }
        return count;
    }
}