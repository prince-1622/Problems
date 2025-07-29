class Solution {
    public int mySqrt(int x) {
        //brute force approach
        // int i = 1;
        // while(i*i <= x){
        //     i++;
        // }
        // return i-1;
        if (x==0 || x==1)
            return x;
        int st = 1, end = x;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(mid*mid == x)
                return mid;
            else if((long)mid*mid > (long)x)
                end = mid - 1;
            else
                st = mid + 1;
        }
        return Math.round(end);
    }
}