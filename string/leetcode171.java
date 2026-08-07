class Solution {
    public int titleToNumber(String columnTitle) {
        int result =0;
        for(char s:columnTitle.toCharArray()){
            int d=s - 'A' +1;
            result=result * 26 +d;
        }
        return result;
    }
}
