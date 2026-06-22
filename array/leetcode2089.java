class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        // List<Integer> li = new ArrayList<>();
        // int n = nums.length;
        // Arrays.sort(nums);
        // for(int i = 0; i < n; i++){
        //     if(nums[i] == target)li.add(i);
        // }
        // return li;


        int count = 0, lessthan = 0;
        for (int n : nums) {
            if (n == target) count++;
            if (n < target) lessthan++;
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(lessthan++);
        }
        return result;
    }
}
