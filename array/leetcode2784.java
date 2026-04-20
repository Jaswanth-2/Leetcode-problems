class Solution {
    public boolean isGood(int[] nums) {
        int n=0;
        for (int num:nums){
            n=Math.max(num,n);
        }
        if(nums.length != n+1){
            return false;
        }
        int res[]=new int[n+1];
        for(int num:nums){
            if(num<1 || num>n){
                return false;
            }
            res[num]++;
        }
        for(int i=1;i<res.length-1;i++){
            if(res[i]!=1){
                return false;
            }
        }
        if(res[n]==2){
            return true;
        }
        return false;
    }
}
