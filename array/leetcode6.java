class Solution {
    public String convert(String s, int numRows) {
        
        int row=0;
        int col=0;
        int current=0;
        char zig[][]=new char[numRows][s.length()];

        if(numRows == 1 || s.length() <= numRows){
            return s;
        }

        while(current<s.length()){
            while(row<numRows && current<s.length()){
                zig[row][col]=s.charAt(current);
                row++;
                current++;
            }
            row=Math.max(0,row-2);
            col++;
            while(row > 0 && current<s.length() ){
                zig[row][col]=s.charAt(current);
                current++;
                row--;
                col++;
            }
            col++;
        }
        String result="";
        for(int i=0;i<numRows;i++){
            for(int j=0;j<s.length();j++){
                if (zig[i][j] != '\0'){
                result += zig[i][j];}
            }
        }
        return result;
    }
}
