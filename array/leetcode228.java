class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> store=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1]){
                i++;
            }
            if(nums[i]!=start){
                store.add(""+start+"->"+nums[i]);
            }
            else{
                store.add(""+start);
            }
        }
        return store;
    }
}
