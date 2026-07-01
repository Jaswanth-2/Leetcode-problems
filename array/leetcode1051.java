class Solution {
    public int heightChecker(int[] heights) {
        int[] store=new int[heights.length];
        int count=0;
        for(int i=0;i<heights.length;i++){
            store[i]=heights[i];
        }
        Arrays.sort(store);
        for(int i=0;i<store.length;i++){
            if(store[i]!=heights[i]) count++;
        }
        return count;
        }
}
