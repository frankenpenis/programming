#include <stdio.h>
int main(void){
	char *pointer;
	pointer  = "derp derp derp";
	unsigned short int one = 1;
	signed short int negone = -1;
	char myChar = 'a';
	float onepointone = 1.1;
	float negonepointone = -1.1;

	printf("Variable Name: myString\nVariable content: %s ", pointer);
	printf("%d %d %f %f %c\n", one, negone, onepointone, negonepointone, myChar);
}
