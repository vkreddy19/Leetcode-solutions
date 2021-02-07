class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m==0){
            for(int i=0; i<nums2.length; i++)
                nums1[i] = nums2[i];
            return;
        }
        int num1Pointer = 0;
        for(int i = 0;i<n;i++){
            while(num1Pointer<m+i && nums1[num1Pointer] <= nums2[i]){
                num1Pointer++;
            }
            for(int j=m+i; j>num1Pointer; j--){
                nums1[j] = nums1[j-1];
            }
            if(num1Pointer<nums1.length)
                nums1[num1Pointer] = nums2[i];

        }
    }
}
