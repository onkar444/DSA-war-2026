class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int maxfreq =0;
        int sarr[] = new int[26];
        int left = 0;
        for(int right = 0;right<s.length();right++){
            sarr[s.charAt(right)-'A']++;
            maxfreq = Math.max(maxfreq, sarr[s.charAt(right)-'A']);

            while((right-left+1)-maxfreq > k){
                sarr[s.charAt(left)-'A']--;
                left++;
            }

            maxLen=Math.max(maxLen,(right-left+1));
        }
        return maxLen;
    }
}
