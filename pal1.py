k = input()
for i in range(len(k)):
    k[i], k[-i-1] = k[-i-1], k[i]
print(k)