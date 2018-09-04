class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        // add nums2 into nums1
        for(int i=m;i<m+n;i++) {
            nums1[i]=nums2[index];
            index++;
        }
        
        for(int k=0;k<nums1.length-1;k++) {
            for(int j=k+1;j<nums1.length;j++){
                if(nums1[k]>nums1[j]) {
                    int temp = nums1[j];
                    nums1[j]=nums1[k];
                    nums1[k]=temp;
                }
            }
        } 
    }
}