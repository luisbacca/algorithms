    public int lengthOfLongestSubstring(String s){
        int left = 0;
        int right = 0;
        int longSoFar = 0;
        Set<Character> countChar = new HashSet<>();
        while (left < s.length() && right < s.length()){
            if(!countChar.contains(s.charAt(right))){
                countChar.add(s.charAt(right++));
                longSoFar = Math.max(longSoFar, right - left);
            }else{
                countChar.remove(s.charAt(left++));
            }
        }
        return longSoFar;
    }
