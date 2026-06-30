class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        float answer=0;
        int [] arr=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        float b=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else{
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length){
            arr[k++]=nums1[i++];
        }
        while(j<nums2.length){
            arr[k++]=nums2[j++];
        }
        int a=arr.length/2;

        if(arr.length%2==0){
           
           answer=(arr[a]+arr[a-1])/2.f;
           
        }
        else{
            answer=arr[a];
        }
        return answer;
    }
}
