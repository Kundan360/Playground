#include<stdio.h>
int main()
{
  int y;
  scanf("%d",&y);
  if(y%4==0)
    printf("Leap year");
  else
     printf("Not Leap year");
  return 0;
}