#include<stdio.h>
#include<string.h>
int main()
{
  int i,j,l;
  char str[100];
  scanf("%[^\n]s", str);
  l=strlen(str);
  for(i=0;i<l;i++)
  {
    if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' ||  str[i]=='U' )
    {
      for(j=i;j<l;j++)
      str[j]=str[j+1];
      l--;
      i--;
    } 
  }
  
  printf("%s",str);
  return 0;
}