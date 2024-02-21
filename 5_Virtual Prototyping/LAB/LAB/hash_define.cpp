/*The #define directive in C and C++ is a preprocessor directive that defines a macro.
When the preprocessor encounters a #define directive, it replaces occurrences of the
defined identifier (macro) with the specified replacement text before the code is compiled.*/

#include <iostream>

// Define a macro for the value of pi
#define PI 3.14159

int main() {
    // Using the defined macro to calculate the area of a circle
    double radius = 5.0;
    double area = PI * radius * radius;

    std::cout << "Area of the circle with radius " << radius << " is: " << area << std::endl;

    return 0;
}
