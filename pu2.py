# a = int(input())
b = [15,32,34]
# for i in range(a):
#     b.append(int(input()))

# c = int(input())
d = [25,43]
# for i in range(c):
#     d.append(int(input()))

e = b+d
e.sort()
co = 0
l = min(e)
mn = ' '
if(l in b):
    mn = 'a'
else:
    mn = 'b'

for i in range(len(e)):
    if(e[i]==l):
        co += 1
        if(mn=='a'):
            mn = 'b'
        else:
            mn = 'a'
    if(mn=='a' and e[i] not in b):
        l = e[i]
    elif(mn=='b' and e[i] not in d):
        l = e[i]

print(co)