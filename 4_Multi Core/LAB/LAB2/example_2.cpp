#include <iostream>
#include <unordered_set>

int main() {
    // Declare a 64-bit integer data type
    using Int64 = long long;

    // Read the number of songs
    Int64 n;
    std::cin >> n;

    // Read the singer of each song and store it in an unordered set
    std::unordered_set<Int64> singers;
    for (Int64 i = 0; i < n; ++i) {
        Int64 singer;
        std::cin >> singer;
        singers.insert(singer);
    }

    // Output the number of distinct singers
    std::cout << singers.size() << std::endl;

    return 0;
}
