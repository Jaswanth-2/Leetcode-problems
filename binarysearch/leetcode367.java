class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)return true;
        long low=1,high=num/2;
        long mid;
        long square=1;
        
        while(low<=high){
            mid=low+(high-low)/2;
            square=mid*mid;
            if(square>num){
                high=mid-1;
            }
            else if(square==num){
                return true;
            }
            else {
                low=mid+1;
            }
        }
        return false;
    }
}
