#include<stdio.h>
int main()
{
    int row=3;
    int col=7;
    char *str =(char [7]) {"ADARSH"};
   // char str[3]="ADA";
   str[2] = 'j';
   for(int i=0;i<7;i++)
    {
        
        //for(int j=0;j<7;j++)
        {
           printf("%c ",str[i]);
        }
       printf("\n");
    }
}