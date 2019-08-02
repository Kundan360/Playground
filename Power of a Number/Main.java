#include <stdio.h>
int main()
{
  	int a,b,c=1,i;
    scanf("%d%d",&a,&b);
    if(b<0)
      printf("Wrong input");
    else if(b==0)
      printf("1");
  else
  {
    for(i=0;i<b;i++)
    {
      c=a*c;
    }
    printf("%d",c);
  }
    return 0;
}