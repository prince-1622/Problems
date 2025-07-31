class Solution {
    public int lengthOfLongestSubstring(String str) {
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int res = 0;
        int left = 0, right = 0;
        for(right=0; right<str.length(); right++){
            char currChar = str.charAt(right);
            if(charIndex[currChar] >= left)
                left = charIndex[currChar] + 1;
            charIndex[currChar] = right;
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}