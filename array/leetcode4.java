class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result=0;
        int nums3[]=new int [nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                nums3[k]=nums1[i];
                i++;
                k++;
            }
            else{
                nums3[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<nums1.length){
            nums3[k]=nums1[i];
            i++;
            k++;
        }
         while(j<nums2.length){
            nums3[k]=nums2[j];
            j++;
            k++;
        }
        if(nums3.length % 2==0){
        result=(nums3[nums3.length/2]+nums3[(nums3.length/2)-1])/2.0;
        }
       // System.out.println(nums3[(nums3.length/2)-1]);
       // System.out.println("maja " +nums3[nums3.length/2]);
       // System.out.println(result);
        if(nums3.length%2==1){
            return nums3[nums3.length/2];
        }
       // System.out.println((nums3[nums3.length/2]+nums3[(nums3.length/2)-1])/2.00);
        return result;

    }
}
