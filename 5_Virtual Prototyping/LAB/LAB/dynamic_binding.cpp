/*Dynamic binding, also known as late binding or runtime polymorphism, is a mechanism in C++ where the actual
function call is resolved at runtime rather than at compile time. This allows for the selection of the appropriate
function implementation based on the actual type of the object being referred to through a base class pointer or
reference. Dynamic binding is achieved through the use of virtual functions. When a function is declared as virtual
in a base class, it allows derived classes to override that function with their own implementation. During runtime,
the appropriate version of the function is selected based on the actual object type, enabling polymorphic behavior.*/

#include <iostream>

// Base class
class Base {
public:
    // Virtual function
    virtual void print() const {
        std::cout << "Printing from Base class" << std::endl;
    }
};

// Derived class
class Derived : public Base {
public:
    // Override the print function
    void print() const override {
        std::cout << "Printing from Derived class" << std::endl;
    }
};

int main() {
    // Create objects of derived classes
    Base *basePtr;
    Base baseObj;
    Derived derivedObj;

    // Point to base class object
    basePtr = &baseObj;
    // Call print function, dynamically bound to Base class implementation
    basePtr->print();

    // Point to derived class object
    basePtr = &derivedObj;
    // Call print function, dynamically bound to Derived class implementation
    basePtr->print();

    return 0;
}
