#include<stdio.h>
int main()
{
  char s[50],c=0,i=0;
  scanf("%[^\n]s",s);
  while(s[i]!='\0')
  {c++;
    i+=1;
  }
  printf("%d",c);
  return 0;
}