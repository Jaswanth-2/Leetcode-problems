class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result =new ArrayList<>();
        Arrays.sort(nums);
        int current_element=nums[0];
        for(int i=0;i<nums.length;i++){
            if(current_element < nums[i]){
                result.add(current_element);
                i--;
            }
            current_element++;
        }
        return result;
    }
}
