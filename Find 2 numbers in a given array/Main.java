#include<stdio.h>
int main()
{
  	int n,i,w=-1,y=-1,x,z,a,b;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
      scanf("%d",&arr[i]);
   scanf("%d%d",&a,&b);
   for(i=0;i<n;i++)
   {
     if(arr[i]==a)
     {
       w=i;
       x=1;
     }
     if(arr[i]==b)
     {
       y=i;
       z=1;
     }
     if(z==1 && x==1)
       break;
   }
  printf("Element 1 index = %d\n",w);
  printf("Element 2 index = %d",y);
  
}