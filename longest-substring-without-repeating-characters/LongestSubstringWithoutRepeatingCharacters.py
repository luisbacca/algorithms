def longestSubStringWithoutRepeatingCharacters(string):
    left = 0
    right = 0
    countset = set()
    longest = 0
    while left < len(string) and right < len(string):
        if not string[right] in countset:
            countset.add(string[right])
            right = right + 1
            longest = max(longest, right - left)
        else:
            countset.remove(string[left])
            left = left + 1
    return longest

result = longestSubStringWithoutRepeatingCharacters("pwwkew")
print(result)

