
#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
bool isP(int n){
    int k = math.sqrt(n);
    return (k*k == n);
}
int numFibanocci(int array_length,int *arr){

    int i,c=0;
    for(i=0;i<array_length;i++){
        int k = arr[i];
        if(isP(k*k*5 + 4) || isP(k*k*5 - 4)){
            c++;
        }
    }
    return c;
}
int main(){
    int arr[5];
    arr = {1,2,3,5,8};
    numFibanocci(5,arr);
}