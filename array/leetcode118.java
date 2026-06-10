class Solution {
    public List<Integer> row(int row){
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int col = 1; col < row; col++){
            ans *= (row - col);
            ans /= col;
            ansRow.add(ans);
        }
        return ansRow;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            res.add(row(i));
        }
        return res;
        
    }
}
