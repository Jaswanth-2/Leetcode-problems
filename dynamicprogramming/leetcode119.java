class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result=new ArrayList<>();
        for(int row=0;row<=rowIndex;row++){
            List<Integer> position=new ArrayList<>();
            for(int col=0;col<=row;col++){
                if(col==0 || col == row){
                    position.add(1);
                }
                else{
                    position.add(result.get(row-1).get(col-1)+result.get(row-1).get(col));
                }
            }
            result.add(position);
        }
        return result.get(result.size()-1); 
    }
}
