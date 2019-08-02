#include<stdio.h>
#define pi 3.14 
int main()
{
  float k,a,arc;
  scanf("%f%f",&k,&a);
  arc=2*pi*k*(a/360);
  printf("%.2f",arc);
  return 0;
}