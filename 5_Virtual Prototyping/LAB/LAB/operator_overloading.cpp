/*Operator overloading is a feature in C++ that allows operators to be redefined or extended for user-defined
data types. This means that operators such as +, -, *, /, etc., can be used with objects of custom classes,
and their behavior can be defined by the programmer.

To overload the + operator for the implementation of complex numbers, you can define a class for complex numbers
and provide an appropriate definition for the + operator. Here's an example:
*/

#include<iostream>
using namespace std;

class sum
{
    public:
    int real;
    int img;

    sum(int r=0,int i=0):real(r),img(i){}

    sum operator+(sum &other)
    {
        return sum(real+other.real,img+other.img);
    }
    void display()  {
        if (img < 0)
            std::cout << real << " - " << -img << "i" << std::endl;
        else
            std::cout << real << " + " << img << "i" << std::endl;
    }   
};

int main()
{
    sum s1(3,5);
    sum s2(8,6);

    sum s=s1+s2;

    s.display();
}