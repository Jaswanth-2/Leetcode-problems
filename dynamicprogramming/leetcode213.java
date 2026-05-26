class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if (nums.length==2) return Math.max(nums[0],nums[1]);

        int x=dynamo(0,nums.length-1,nums);
        int y=dynamo(1,nums.length,nums);

        return Math.max(x,y);
    }
    private int dynamo(int start, int end, int[] num){
        int [] dp=new int[end];
        dp[start]=num[start];
        dp[start+1]=Math.max(num[start],num[start+1]);
        for(int i=2;i<end;i++){
            dp[i]=Math.max(dp[i-2]+num[i],dp[i-1]);
        }
        return dp[dp.length-1];
    }
}
