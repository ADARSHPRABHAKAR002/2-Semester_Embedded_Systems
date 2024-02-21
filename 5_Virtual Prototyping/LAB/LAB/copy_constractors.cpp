/*A copy constructor is a special type of constructor in C++ which creates a new object as a copy
of an existing object. It is used to initialize a new object with the data of another object of the
same class. The copy constructor is invoked when a new object is created from an existing object, either
explicitly or implicitly.*/

#include <iostream>

// Class representing a simple rectangle
class Rectangle {
private:
    int length;
    int width;

public:
    // Default constructor
    Rectangle() : length(0), width(0) {}

    // Parameterized constructor
    Rectangle(int l, int w) : length(l), width(w) {}

    // Copy constructor
    Rectangle(const Rectangle &other) {
        length = other.length;
        width = other.width;
    }

    // Function to display the dimensions of the rectangle
    void display() const {
        std::cout << "Length: " << length << ", Width: " << width << std::endl;
    }
};

int main() {
    // Create a rectangle object
    Rectangle originalRect(5, 3);
    std::cout << "Original rectangle:" << std::endl;
    originalRect.display();

    // Create a new rectangle object using the copy constructor
    Rectangle copiedRect = originalRect;
    std::cout << "Copied rectangle:" << std::endl;
    copiedRect.display();

    return 0;
}
