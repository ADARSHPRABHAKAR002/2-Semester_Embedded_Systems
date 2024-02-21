#include<iostream>
using namespace std;
int main()
{
    int num;
    cout<<"Ennter the array size: "<<endl;
    cin>>num;
    int arr[num];
    for(int i=0;i<num;i++)
    {
        cin>>arr[i];
        
    }
    int temp=0;
    for(int i=0,j=num-1;i<num/2,j>num/2;i++,j--)
    {
        
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    for(int i=0;i<num;i++)
    {
        cout<<arr[i]<<" ";
        
    }
    return 0;



}