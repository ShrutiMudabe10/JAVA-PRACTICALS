public class Practical5{
  int getFactorial1(int number){
   
   // using for loop
    int fact = 1;
    for(int i = number ; i>0 ;i--){
     fact *= i;
     }
       
  return fact;
     }
     
  int getFactorial2(int number){
   int fact = 1;
   
   // using while loop
    while(number >0){
     fact *= number;
     number--;
     }
  return fact;
  }
  //using recursion 
  int getFactorial3(int number){
     int fact = 1;
     if(number ==0){
         fact = 1;
       }else{
        fact = number* getFactorial3(number-1);
        }
       
     return fact;
  }
   int getFactorial4(int number){
      int fact = 1;
      if(number % 2 == 0){
        fact = getFactorial1(number);
        }else{
         fact = getFactorial3(number);
         }
  return fact;
  }
  
   //using while loop
   int getSum1(int[] numbers){
     int sum=0,idx = numbers.length-1;
     while(idx>=0){
      sum += numbers[idx];
      idx--;
      }
    return sum;
  }
  //using recursion
  int getSum2(int[] numbers,int idx){
     int sum = 0;
     if(idx >= numbers.length){
       return 0;
       }
       sum =numbers[idx] + getSum2(numbers,idx+1);
  return sum;
  }
  
    
  public static void main(String [] args){
       Practical5 test = new Practical5();
       int num = 5;
       int[] arr = {3,8,10};
     
       System.out.println(test.getFactorial1(num));
       System.out.println(test.getFactorial2(num));
       System.out.println(test.getFactorial3(num));
       System.out.println(test.getFactorial4(num));
       
       System.out.println(test.getSum1(arr));
       System.out.println(test.getSum2(arr,0));

  }
  
}
