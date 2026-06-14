class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        int difference=0;
        int maxdiff=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            difference=nums[i+1]-nums[i];
            maxdiff=Math.max(difference,maxdiff);
        }
        return maxdiff;
    }
}
