class Solution {
    public int largestAltitude(int[] gain) {
        // int test[]=new int[gain.length+1];
        // test[0]=0;
        // for(int i=1;i<test.length;i++){
        //     test[i]=test[i-1]+gain[i-1];
        //     System.out.println(test[i]);
        // }  

        // Arrays.sort(test);
        // return test[test.length-1];

        int current=0;
        int maxalt=0;
        for(int i:gain){
            current=current+i;
            maxalt=Math.max(current,maxalt);
        }
        return maxalt;

    }
}
