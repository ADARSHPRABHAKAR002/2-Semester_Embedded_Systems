#include<iostream>
using namespace std;

class shape
{
    public:
    virtual void clac_area()
    {
        cout<<"Calculate the base class area: "<<endl;
        
    }
    
};

class circle:public shape{
    public:
    void clac_area()
    {
        cout<<"Calculate the derived circle class: "<<endl;
        
    }
};

class rectangle:public shape{
    public:
    void clac_area()
    {
        cout<<"Calculat the derived rectangle class: "<<endl;
    }
};

int main()
{
    rectangle rec;
    circle cir;

    rec.clac_area();
    cir.clac_area();

    shape *sh;
    sh=&rec;
    shape *shh;
    shh=&cir;

    sh->clac_area();
    shh->clac_area();

}

/*Virtual functions are member functions in C++ that are declared 
within a base class and are meant to be overridden in derived classes.
They allow the behavior of a function to be determined by the type of object
that is invoking the function, rather than the type of the pointer or reference 
o that object. This is a fundamental feature of polymorphism in object-oriented programming.*/

/*The Animal class serves as the base class with a virtual function makeSound().
Two derived classes, Dog and Cat, override this function with their own implementations.
In the main function, objects of these derived classes are created, and pointers of type Animal are used to refer to them.
When the makeSound() function is called using these pointers, the appropriate overridden version of the function is invoked
based on the actual object type, demonstrating polymorphic behavior.*/