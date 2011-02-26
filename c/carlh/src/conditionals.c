#include <stdio.h>
int main(void) {
	short int x;
	short int y;
	char input[10];
	printf("Enter X coordinate: ");
	gets(input);
	x = atoi(input);
	printf("Enter Y coordinate: ");
	gets(input);
	y = atoi(input);

	if (x == 0 && y == 0) {
		printf("That shit is on the origin, bitch.\n");
	}
	else if (x>0 && y>0) {
		printf("That shit is in quadrant one, bitch.\n");
	}
	else if (x<0 && y>0) {
		printf("That shit is in quadrant two, bitch.\n");
	}
	else if (x<0 && y<0) {
		printf("That shit is in quadrant three, bitch.\n");
	}
	else {
		printf("That shit is in quadrant four, bitch.\n");
	}

	return 0;
}
