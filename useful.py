# write a python code to find two longest non intersecting subsequences of given string which are anagrams to each other.
# input : n = 11
# s = "maharashtra"
# output : 4
# 

n = int(input())
s = str(input())
l1 = []
for j in range(len(s)):
    for k in range(j+1,len(s)+1):
        if sorted(s[j:k]) not in l1:
            l1.append(sorted(s[j:k]))
print(len(l1))  



# n = int(input())
# k = int(input())
# c,s,i = 0,0,1
# while i>=0:
#     j = str(i)
#     g = 0
#     for x in j: 
#         g += int(x)
#     if g<=k: 
#         c += 1
#         s += i
#     if c==n: break
#     i += 1
# print(s)

