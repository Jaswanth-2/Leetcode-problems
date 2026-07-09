class Solution {
    public char findTheDifference(String s, String t) {
        char c=0;
        for(char ca:s.toCharArray()) c^=ca;
        for(char cb:t.toCharArray()) c^=cb;
        return c;
    }
}
