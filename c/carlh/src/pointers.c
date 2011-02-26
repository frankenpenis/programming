#include <stdio.h>
int main(void) {
	int number = 5;
	int *pointer = &number;
	printf("ptr: %d *ptr: %d\n&number: %d number = %d\n", pointer, *pointer, &number, number);
	return 0;
}
