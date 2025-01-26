public class Practical6{
 public  void pattern1(int size){
 
       for(int line=1; line<2*size; line++){
            int spaces = line>size ? line-size : size-line ;
         for(int space=1; space<=spaces; space++){
             System.out.print(" ");
            }
          if(line<=size){
               for(int plus=1; plus<=line; plus++){
                   System.out.print("+ ");
             }
              
           }else{
                for(int star=1; star<=2*size-line; star++){
                  System.out.print("* ");
            }
              
          }System.out.println();
     }

 }
 public void pattern2(int size){
   for(int line=1; line<2*size; line++){
      int spaces = line>size ? line-size : size-line;
      for(int space=1; space<=spaces; space++){
        System.out.print(" ");
        }
        int pluses = line>size ? 3*size-2*line+2 : 2*line-1;
        for(int plus=1; plus<=pluses; plus++){
        System.out.print("+");
        }
      System.out.println();
      }
}
 public void pattern3(int size){
   for(int line=1; line<=2*size; line++){
          int spaces = line>size ? line-size-1: size-line;
       for(int space=1; space<=spaces; space++){
              System.out.print("   ");
        }
       int stars = line<=size ? 2*line-1 :2*(2*size-line)+1;
                  
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
   int size = 3;
  
  test.pattern1(size);
  test.pattern2(size);
  test.pattern3(size);
  }
}
