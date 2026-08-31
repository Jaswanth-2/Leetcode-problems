class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        int l = Math.min(minIndex, maxIndex);
        int r = Math.max(minIndex, maxIndex);

        return Math.min(
            Math.min(r + 1, n - l),
            l + 1 + n - r
        );
    }
}
