#include<stdio.h>
int main()
{
  int i,n,s,t=0;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
  scanf("%d",&s);
  for(i=0;i<n;i++)
    if(s==arr[i])
    {
      printf("%d",i+1);
      t=1;
      break;
    }
  if(t==0)
    printf("%d isn't present in the array.",s);
  return 0;
}