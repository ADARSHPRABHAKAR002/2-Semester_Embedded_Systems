#include<iostream>
using namespace std;
int main()
{
    int num,max=0;
    cout<<"Ennter the array size: "<<endl;
    cin>>num;
    int arr[num];
    for(int i=0;i<num;i++)
    {
        cin>>arr[i] ;
        if(i==0)max=arr[i];
        if(arr[i]>max)max=arr[i];
    }
    cout<<"max element in the given array is :"<<max<<endl;
    return 0;



}