class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //Bruteforce approach

        // int[] arr = new int[n+m];
        // for(int i = 0; i<m; i++){
        //     arr[i] = nums1[i];
        // }
        // for(int i = 0; i<n; i++){
        //     arr[m+i] = nums2[i];
        // }
        // Arrays.sort(arr);
        // for(int k = 0;k<arr.length;k++){
        //     nums1[k] = arr[k];
        // }

        //without extra space

        int i = m-1;
        int j = n-1;
        int k = n+m-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
              nums1[k] = nums1[i];

              i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}