#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c,d,r1,r2,x,real,ima;
  scanf("%f%f%f",&a,&b,&c);
  d=(b*b)-(4*a*c);
  if(d>0)  {
  x=sqrt(d);
    r1=(-b+x)/(2*a);
    r2=(-b-x)/(2*a);
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
          }
  if(d==0)
  {
    x=sqrt(d);
    r1=r2=(-b+x)/(2*a);
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
    
  }
  if(d<0)
  {
    x=sqrt(-d);
    real=-b/(2*a);
    ima=x/(2*a);
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",real,ima,real,ima);
    
  }
  return 0;
}