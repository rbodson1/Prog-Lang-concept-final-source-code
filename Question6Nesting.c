#include<stdio.h>

int main (){
   int first,second,third,max,mid,min;

   printf("Insert 3 values : \n");

   scanf("%d %d %d",&first,&second,&third);

     
if(first>second){
  if(first>third){
    if(second>third){
       max=first;
       min=third;
       mid=second;
}else{
      max=first;
      min=second;
      mid=third;
}
}else{
      max=third;
      min=second;
      mid=first;
}
  
}else{
if(second<third){
     max=third;
     min=first;
     mid=second;
}else{
if(first<third){
     max=second;
     min=first;
     mid=third;  
}else{
     max=second;
     min=third;
     mid=first;
    }
  }

  
 }
            printf("Max is %d\n",max);
            printf("Mid is %d\n",mid);
            printf("Min is %d\n",min);
            
      return 0;
}

