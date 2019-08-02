#include<stdio.h>
#include<string.h>
int main()
{
 int i,l,c=1;
  char s[100];
  scanf("%[^\n]s",s);
  l=strlen(s);
  
  for(i=0;i<l;i++)
  {
    if(l>20)
    {
      printf("Invalid Input");
      break;
    }
    while(s[i]==s[i+1])
    {
      c++;
      i++;
    }
  printf("%c%d",s[i],c);
    c=1;
  
  }
  return 0;
}