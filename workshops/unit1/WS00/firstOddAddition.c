#include <stdio.h>
#include <stdlib.h>

/*
 *
 */
int main(int argc, char** argv) {

    for (int i = 1; i < 10; i++)
        printf("Hello World %d \n", i);

    int sum;
    sum = 0;

    for (int i = 1; i <= 99; i += 2) {
        sum = sum + i;
    }
    printf("The sum of the first 50 Odd numbers is \n--> %d", sum);

}
