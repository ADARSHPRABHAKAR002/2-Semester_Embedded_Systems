#include <iostream>

// Function to calculate the sum of two integers
int sum(int a, int b) {
    return a + b;
}

// Overloaded function to calculate the sum of two doubles
double sum(double a, double b) {
    return a + b;
}

// Overloaded function to concatenate two strings
std::string sum(const std::string& str1, const std::string& str2) {
    return str1 + str2;
}

int main() {
    // Call the sum function with different parameter types
    std::cout << "Sum of integers: " << sum(5, 10) << std::endl;
    std::cout << "Sum of doubles: " << sum(3.5, 2.7) << std::endl;
    std::cout << "Concatenated strings: " << sum("Hello, ", "World!") << std::endl;

    return 0;
}
/*We have three functions named sum, each with a different parameter list:

int sum(int a, int b) - Takes two integers and returns their sum.
double sum(double a, double b) - Takes two doubles and returns their sum.
std::string sum(const std::string& str1, const std::string& str2) - Takes two std::string objects and returns their concatenation.
We call the sum function with different types of arguments in the main() function:

First, we call sum with two integers.
Then, we call sum with two doubles.
Finally, we call sum with two strings.*/