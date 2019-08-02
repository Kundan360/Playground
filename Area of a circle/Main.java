#include<stdio.h>
#define pi 3.14 
int main()
{
  int d;
  float area,radius;
  scanf("%d",&d);
  radius=(float)d/2;
  area=(float)pi*radius*radius;
  printf("%.2f",area);
  return 0;
}