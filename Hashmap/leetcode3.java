class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> map=new HashSet<>();
        int result=0;
        int length=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(map.contains(c)){
                map.remove(s.charAt(length));
                length++;
            }
            map.add(c);
            result=Math.max(result,i-length+1);
            System.out.println("len"+result+" l" +length);

        }
        return result;
    }
}
