#include<stdio.h>
int main()
{
  int t;
  float r,si,p;
  scanf("%f%d%f",&p,&t,&r);
  si=(float)(p*r*t)/100;
  printf("%f",si);
  return 0;
}