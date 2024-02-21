#include<iostream>
#include<cstring>
using namespace std;
int len_str(const char *ptr)
{
    int len=0;
    while(*ptr!='\0')
    {
        len++;
        ptr++;
    }
    return len;
}
int main()
{
    /*char str[100];
    cin.getline(str,100);
    */

    const char *str="Hello World!";

    cout<<"Length of the string entered is :"<<len_str(str)<<endl;


}