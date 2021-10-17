//Source : https://www.instagram.com/p/CVFwronDkVt/

#include <stdio.h>
#include <string.h>
#include <math.h>

int main(int argc, char *argv[])
{
	char arr[][6] = {"abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"};
	char sentence[200];
	int j = 0,  k = 0, row, col, ind, xdist, ydist;
	fgets(sentence, 200, stdin);
	for(int i = 0; i < strlen(sentence) - 1; i++)
	{
		ind = sentence[i] % 97;
		row = ind / 5;
		col = ind % 5;
		ydist = abs(j - row);
		xdist = abs(k - col);
		if(j < row)
		{
			while(ydist--)
			{
				j++;
				printf("D");
			}
		}
		else if(j > row)
		{
			while(ydist--)
			{
				j--;
				printf("U");
			}
		}
		if(k < col)
		{
			while(xdist--)
			{
				k++;
				printf("R");
			}
		}
		else if(k > col)
		{
			while(xdist--)
			{
				k--;
				printf("L");
			}
		}
		printf("!");
	}
	printf("\n");
}
