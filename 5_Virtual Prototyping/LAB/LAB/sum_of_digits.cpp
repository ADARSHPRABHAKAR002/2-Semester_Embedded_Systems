#include<iostream>
using namespace std;
int main()
{
    int num,sum=0,var;
    cin>>num;
    var=num;

    while(var!=0)
    {
        sum=sum+var%10;
        var=var/10;
    }

    cout<<"sum of digit of "<<num<<" is : "<<sum<<endl;



}