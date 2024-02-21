#include <iostream>
using namespace std;
// Function to swap values using pointers
void swap(int *ptr1, int *ptr2) {
    int temp = *ptr1;
    *ptr1 = *ptr2;
    *ptr2 = temp;
}

int main() {
    int a = 5, b = 10;

    cout<< "Before swapping:\n";
    cout<< "a = " << a << ", b = " << b << std::endl;

    // Pointers to variables a and b
    int *ptrA = &a;
    int *ptrB = &b;

    // Call the swap function passing pointers
    swap(ptrA, ptrB);

    cout<< "After swapping:\n";
    cout<< "a = " << a << ", b = " << b << std::endl;

    return 0;
}
