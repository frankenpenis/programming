#include <stdio.h>
int main(void) {
	char string[] = "Hello, Reddit!";
	char *pointer = string;
	printf("Original string array: %s", string);

	*pointer = 'H';
	pointer = pointer + 1;

	*pointer = 'E';
	pointer = pointer + 1;

	*pointer = 'L';
	pointer = pointer + 1;

	*pointer = 'L';
	pointer = pointer + 1;

	*pointer = 'O';
	printf("\nAfter: %s\n", string);

	return 0;
}
