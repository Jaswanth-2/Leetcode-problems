class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
    
        int suffixmin[]=new int[n];
        suffixmin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixmin[i]=Math.min(nums[i],suffixmin[i+1]);
        } 
        int preffixmax=nums[0];
        for(int i=0;i<n;i++){
            preffixmax=Math.max(nums[i],preffixmax);
            if(preffixmax-suffixmin[i] <= k) return i;
        }
        return -1;

    }
}
