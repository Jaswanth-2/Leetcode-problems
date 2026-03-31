class Solution {
    public int strStr(String haystack, String needle) {
        int a=haystack.length();
        int b=needle.length();
        for(int i=0;i<a;i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(i+b <= a){
                if(haystack.substring(i,i+b).equals(needle))
                 return i;
                }
            }
        }
        return -1;
    }
}
