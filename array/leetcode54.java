class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         ArrayList<Integer> a=new ArrayList<>();
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1;
        while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            a.add(matrix[top][i]);
        }top++;
        if(top<=bottom){
        for(int i=top;i<=bottom;i++){
            a.add(matrix[i][right]);
        }right--;}



        if(bottom>=top && left<=right)
        
        
        {
        for(int i=right;i>=left;i--){
            a.add(matrix[bottom][i]);
        }bottom--;}


        if(left<=right && top<=bottom){

            
        for(int i=bottom;i>=top;i--){
            a.add(matrix[i][left]);
        }left++;
        }
        }
       
        
    return a;
    }
}
