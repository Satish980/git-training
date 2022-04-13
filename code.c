#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
#include <ctype.h>

int main(){
    char str1[100];
    int i,s=0;
    scanf("%s",str1);

    for(i=0;i<strlen(str1);i++)
        if (isdigit(str1[i]))
            s+=str1[i]-'0';

    printf("%d",s);
    return 0;
}