#include<stdio.h>

int main (){
   int first,second,third,max,mid,min;

   printf("Insert 3 values : \n");

   scanf("%d %d %d",&first,&second,&third);

   if(first>second && first>third && second>third){
            max=first;
            min=third;
            mid=second;
      }else if(first>second && first>third && second<third){
            max=first;
            min=second;
            mid=third;

      }else if(second>third && second>first && first>third){
            max=second;
            min=third;
            mid=first;
      }else if(second>third && second>first && third>first){
            max=second;
            min=first;
            mid=third;
      }else if(third>first && third>second && first>second){
            max=third;
            min=second;
            mid=first;
  
      }else{
            max=third;
            min=first;
            mid=second;
      }
            printf("Max is %d\n",max);
            printf("Mid is %d\n",mid);
            printf("Min is %d\n",min);
            
      return 0;
}

