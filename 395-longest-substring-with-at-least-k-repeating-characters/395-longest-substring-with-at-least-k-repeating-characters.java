class Solution {
    public int longestSubstring(String S, int k) {
        int charFrequency[] = new int[26];
        char[] strArray = S.toCharArray();
        for(char ch: strArray){
            int index = ch -'a';
            charFrequency[index]++;
        }
        boolean valid = true;
        int start =0;
        int maxLen = 0;
        for(int index = 0;index < S.length();index++) {
            if(charFrequency[strArray[index] - 'a'] >0 && charFrequency[strArray[index] - 'a'] <k ){
                String subString = S.substring(start, index);
                maxLen  = Math.max(maxLen , longestSubstring(subString, k));
                start = index+1;
                valid = false;
            }
        }
        if(valid){
            return S.length();
        } else{
            return Math.max(maxLen, longestSubstring(S.substring(start), k));
        }
    }
}