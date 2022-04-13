# write a python code to find two longest non intersecting subsequences of given string which are anagrams to each other.
# n = int(input())
s = str(input())
l1 = []
for j in range(len(s)):
    for k in range(j+1,len(s)+1):
        if sorted(s[j:k]) not in l1:
            l1.append(sorted(s[j:k]))
print(len(l1))  
