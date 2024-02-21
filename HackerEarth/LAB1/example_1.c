#include <stdio.h>
#include <stdlib.h>

int main() {
    int num;
    scanf("%d", &num);

    int *arr = (int *)malloc(num * sizeof(int));

    for (int i = 0; i < num; i++) {
        scanf("%d", &arr[i]);
    }

    int *countMap = (int *)calloc(num + 1, sizeof(int));

    int maxCount = 0, distinctCount = 0;

    for (int i = 0; i < num; i++) {
        int key = arr[i];

        if (countMap[key] == 0) {
            distinctCount++;
        }

        countMap[key]++;

        if (countMap[key] > maxCount) {
            maxCount = countMap[key];
        }
    }

    free(arr);
    free(countMap);

    printf("%d\n", maxCount);
    printf("%d\n", distinctCount);

    return 0;
}
