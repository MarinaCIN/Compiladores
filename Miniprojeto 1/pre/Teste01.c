#include <stdio.h>
#define DEBUG

int main( ) {
    printf("Arquivo de teste 01.\n");
    printf("Quadrado(2) = %d.\n", (2 * 2));
    #ifdef DEBUG
    printf("Quadrado(3) = %d.\n", (3 * 3));
    #endif
    printf("Quadrado(4) = %d.\n", (4 * 4));
    #ifdef TEST
    printf("Quadrado(5) = %d.\n", (5 * 5));
    #endif

    return 0;
}