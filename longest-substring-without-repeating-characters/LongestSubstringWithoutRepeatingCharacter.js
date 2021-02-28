
const test = {
    longestSubstring(string)
    {
        let left = 0
        let right = 0
        let countSet = new Set()
        let longest = 0

        while (left < string.length & right < string.length) {
            if (!countSet.has(string.charAt(right))) {
                countSet.add(string.charAt(right++));
                longest = Math.max(longest, right - left);
            } else {
                countSet.delete(string.charAt(left++));
            }
        }
        return longest;
    }
}

console.log(test.longestSubstring("pwwkew"));