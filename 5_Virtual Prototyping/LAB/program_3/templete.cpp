#include<iostream>
using namespace std;


template <typename T,int s>
class array {
    public:
    T *a;
    int size;
    array(T *b)
    {
        a = new T[s];
        size = s;
    }

};
int main() {
    uint32_t a[5] = {1,2,3,4,5};
 array <uint32_t, 5> data((uint32_t *){1,2,3,4,5}) ;
 
}
