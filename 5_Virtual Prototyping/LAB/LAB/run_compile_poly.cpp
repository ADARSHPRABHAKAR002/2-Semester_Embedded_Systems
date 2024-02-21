/*Compile-Time Polymorphism (Static Polymorphism):

Compile-time polymorphism, also known as static polymorphism, occurs when the
decision about which function to call is made by the compiler at compile time.
This mechanism is achieved through function overloading and operator overloading.
Function overloading allows multiple functions with the same name but different
parameter lists to exist, and the appropriate function is determined based on the
arguments provided during the function call.
Operator overloading allows operators such as +, -, *, etc., to be redefined for
user-defined data types, and the appropriate operator function is determined at compile time.*/

/*#include <iostream>

// Function overloading
int sum(int a, int b) {
    return a + b;
}

double sum(double a, double b) {
    return a + b;
}

int main() {
    std::cout << "Sum of integers: " << sum(5, 10) << std::endl;
    std::cout << "Sum of doubles: " << sum(3.5, 2.7) << std::endl;
    return 0;
}*/


//run time polymorphism

/*Run-Time Polymorphism (Dynamic Polymorphism):

Run-time polymorphism, also known as dynamic polymorphism, occurs
when the decision about which function to call is made at runtime.
This mechanism is achieved through inheritance and virtual functions.
Virtual functions are functions in a base class that are declared with
the virtual keyword and are expected to be overridden in derived classes.
When a derived class object is accessed through a base class pointer or reference,
the appropriate version of the virtual function is determined based on the actual type of the object at runtime.*/

#include <iostream>

// Base class
class Shape {
public:
    // Virtual function
    virtual void draw() const {
        std::cout << "Drawing a shape" << std::endl;
    }
};

// Derived class
class Circle : public Shape {
public:
    // Override the virtual function
    void draw() const override {
        std::cout << "Drawing a circle" << std::endl;
    }
};

int main() {
    // Create objects of derived classes
    Circle circle;

    // Polymorphic behavior
    Shape* shapePtr = &circle;
    shapePtr->draw(); // Calls the draw function of Circle class

    return 0;
}
