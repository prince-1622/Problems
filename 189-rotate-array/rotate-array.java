class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int j=0;
        int [] arr1 = new int[n];
        for(int i=(n-k);i<n;i++){
            arr1[j++]=nums[i];
        }
         for(int i=0;i<(n-k);i++){
            arr1[j++]=nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = arr1[i];
        }
    }
}