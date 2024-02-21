#include<stdio.h>
#include<stdlib.h>
int main()
{
    int num;
    scanf("%d",&num);
    long long arr[num];
    for(int i=0;i<num;i++){scanf("%d",&arr[i]);}
    int key,count,max,result=0;

    for(int i=0;i<num;i++)
    {
        if(arr[i]==0)continue;
        else{key=arr[i];}
        count=0;

        for(int j=i;j<num;j++)
        {
            if(key==arr[j])arr[i]=++count;
            if((key==arr[j]) && (i!=j))arr[j]=0;
        }   
        if(i==0)max=arr[i];
        if(arr[i]>max){max=arr[i];result=0;}
        if(max==arr[i]){result++;}

    }
    for(int i=0;i<num;i++)
    {
        printf("%d",arr[i]);
    }
    printf("%d\n",max);
    printf("%d\n",result);
}