
from sys import stdin
t = int(input())
for i in range(t):
    m = int(input())
    if m%3 == 0 or m%7==0:
        print("YES")
    else:
        f=0
        for j in range(40):
            x = m-3*j
            if x%7==0 and x>0:
                print("YES")
                f=1
                break
        if(f==0):
            print("NO")


