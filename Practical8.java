 public class Practical8{
 void pattern1(int line, int size){
       if(line<=size){
           printStars(line,1);
          System.out.println();
        pattern1(line+1,size);
        }
        printStars(line,1);
      System.out.println();
}
void printStars(int line,int star){
     if(star<=line){
           System.out.print("*");
           printStars(line,star+1);
     }
}
void printSlash(int line,int slash,int size){
      
       if(slash<=line){
           if(line== size+1 ){
        System.out.print("+");
         }else{
            System.out.print("/");
            }
            printSlash(line,slash+1,size);
        }
    }
void pattern2(int line,int size){
      if(line<=size){
           printSpaces(line,size+1-line);
          printStars(line,1);
          System.out.println();
          pattern2(line+1,size);
         }
       printSpaces(line,size+1-line);
     printSlash(line,1,size);
       System.out.println();
   }
void printSpaces(int line,int space){
      if(space>=1){
         System.out.print(" ");
         printSpaces(line,space-1);
       }
 }
void pattern3(int line,int size){
       if(line<size){
         printSpaces(line,size+1-line);
           printStar(line,1);
        System.out.println();
        pattern3(line+1,size);
          }
        printSpaces(line,size+1-line);
        printStar(line,1);
       System.out.println();
       
       if(line<=1){
           printPls(line,size);
          }
 }
  
void printStar(int line,int star){
       if(star<=2*line-1){
           System.out.print("*");
           printStar(line,star+1);
      }
  }
void printPls(int line,int size){
        if(line<2*size){
           printSpace(size,size);
           System.out.println("+");
           printPls(line+1,size);
       }
   }
void printSpace(int space,int  size){
      if(space>=1){
          System.out.print(" ");
            printSpace(space-1,size);
        }
  }

public static void main(String[] args){
    Practical8 test = new Practical8();
       int size = 5;
       test.pattern1(1,size);
       test.pattern2(1,size);
       test.pattern3(1,size);
      }
}

   

   

   

   
