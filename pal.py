# Palindrome by swapping only one character in a string

def isPalindromePossible(input):
    length = len(input)
    diffCount = 0
    i = 0
    diff = [['0'] * 2] * 2
    while i < length // 2:
        if input[i] != input[length - i - 1]:
            if diffCount == 2:
                return False
 
            diff[diffCount][0] = input[i]

            diff[diffCount][1] = input[length - i - 1]
            diffCount += 1
        i += 1
 
    if diffCount == 0:
        return True
 
    elif diffCount == 1:
        midChar = input[i]

        if length % 2 != 0 and (diff[0][0] == midChar
                                or diff[0][1] == midChar):
            return True
 

    elif diffCount == 2:
        if (diff[0][0] == diff[1][0] and diff[0][1] == diff[1][1]) or (
                diff[0][0] == diff[1][1] and diff[0][1] == diff[1][0]):
            return True
    return False

k = input()
input()
print(k)
print(isPalindromePossible(k))
