
def lengthOfLongestSubstring(str):
    left = 0

    map = {}

    maxVal = 0

    for i in range(0, len(str)):

        if(str[i] not in map or map[str[i]] == 0):
            map[str[i]] = 1
        else:
            map[str[i]] = map[str[i]] + 1

        while(map[str[i]] > 1):
            map[str[left]] = map[str[left]] - 1
            left += 1

        maxVal = max(maxVal, i - left + 1)

        print('left=${} right=${}'.format(left, i))
        print(map)
        print('\n')





    return maxVal

input1 = "abcabcbb"
print(lengthOfLongestSubstring(input1))