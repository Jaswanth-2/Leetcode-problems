class Solution {
    public long sumAndMultiply(int n) {
        int a=0;
        int b=0;
        for(char c:String.valueOf(n).toCharArray()){
            if(c != '0'){
                a=a*10+(c - '0');
                b=b+(c -'0');
            }
        }

        return (long) a*b;
    }
}
