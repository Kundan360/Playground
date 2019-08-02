#include<stdio.h>
#include<string.h>

int main()
{
  char s[100];
  int c=1,i,l;
  scanf("%[^\n]s",s);
  l=strlen(s);
  for(i=0;i<l;i++)
  {
    if(s[i]==' ')
      c++;
  }
  printf("%d",c);
  
  return 0;
}