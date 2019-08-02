#include <stdio.h>
int main() {
	char c;
    scanf("%c",&c);
    if(c>=97 && c<=122)
      c=(c-97)+65;
    else if(c>=65 && c<=90)
      c=(c-65)+97;
    printf("%c",c);
	return 0;
}