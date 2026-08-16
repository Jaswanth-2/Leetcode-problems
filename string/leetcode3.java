class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int result=0;
        int len=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(len));
                len++;
            }
            set.add(c);
            result=Math.max(result,i-len+1);
        }
        return result;
    }
}
