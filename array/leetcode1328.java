class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1){
            return "";
        }
        int len=palindrome.length();
        int size=len/2;
        char ch[]=palindrome.toCharArray();
        for(int i=0;i<size;i++){
            if(ch[i] != 'a'){
                ch[i]='a';
              return String.valueOf(ch);
            }
        }
        ch[len-1]='b';
        return String.valueOf(ch);
    }
}
