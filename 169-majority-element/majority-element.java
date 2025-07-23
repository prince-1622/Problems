class Solution {
    public int majorityElement(int[] arr) {
        int count = 0;
        int cand = -1;
        for(int nums:arr){
            if(count == 0){
                count++;
                cand = nums;
            } 
            else if(nums == cand)
                count++;
            else count--;
        }
        count = 0;
        for(int nums: arr){
            if(nums == cand)
                count++;
        }
        if(count > arr.length/2)
            return cand;
        else return -1;
    }
}