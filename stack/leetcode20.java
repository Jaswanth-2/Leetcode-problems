import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character>stackes=new Stack<>();
        if(s.length()%2 !=0){
            return false;
        }
        for(char value:s.toCharArray()){
            if(value == '(' || value == '[' || value == '{'){
                stackes.push(value);
            }
            else{
                if(stackes.isEmpty()){
                    return false;
                }
                char lastvalue=stackes.pop();
                if(value==')' && lastvalue !='('|| value=='}' && lastvalue !='{'|| 
                value==']' && lastvalue !='[' ){
                    return false;
                }
            }
        }return stackes.isEmpty();
    }
}
