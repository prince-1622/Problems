class Solution {
    public int findPeakElement(int[] a) {
        int st = 0, end = a.length-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if((mid == 0 || a[mid] > a[mid-1]) && (mid == a.length-1 || a[mid] > a[mid+1])) 
                return mid;
            else if(a[mid] < a[mid+1])
                st = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}