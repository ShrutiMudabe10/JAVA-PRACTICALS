public class Practical6{
 public  void pattern1(int n){
 
       for(int line=1; line<2*n; line++){
            int spaces = line>n ? line-n : n-line ;
         for(int space=1; space<=spaces; space++){
             System.out.print(" ");
            }
          if(line<=n){
               for(int plus=1; plus<=line; plus++){
                   System.out.print("+ ");
             }
              
           }else{
                for(int star=1; star<=2*n-line; star++){
                  System.out.print("* ");
            }
              
          }System.out.println();
     }

 }
 public void pattern2(int n){
   for(int line=1; line<2*n; line++){
      int spaces = line>n ? line-n : n-line;
      for(int space=1; space<=spaces; space++){
        System.out.print(" ");
        }
        int pluses = line>n ? 3*n-2*line+2 : 2*line-1;
        for(int plus=1; plus<=pluses; plus++){
        System.out.print("+");
        }
      System.out.println();
      }
}
 public void pattern3(int n){
   for(int line=1; line<=2*n; line++){
          int spaces = line>n ? line-n-1: n-line;
       for(int space=1; space<=spaces; space++){
              System.out.print("   ");
        }
       int stars = line<=n ? 2*line-1 :2*(2*n-line)+1;
                  
          for(int star=1; star<=stars; star++){
           if((line+star)%2 ==0){
                System.out.print(" * ");
              }else{
                 System.out.print(" + ");
             }
         }System.out.println();
         
      }
   }

public static void main(String[]args){
   Practical6 test = new Practical6();
   int num = 3;
  
  test.pattern1(num);
  test.pattern2(num);
  test.pattern3(num);
  }
}
