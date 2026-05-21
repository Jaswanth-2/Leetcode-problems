class Solution {
    public int longestOnes(int[] nums, int k) {

        int left=0;
        int finalLength=0;
        int countZeros=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countZeros++ ;
            }
            while(countZeros>k){
                if(nums[left]==0){
                    countZeros--;
                }
                left++;
            }
            finalLength=Math.max(finalLength,i-left+1);
        }
    return finalLength;
    }
}
