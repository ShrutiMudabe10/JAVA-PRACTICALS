public class NameVertical{
public String displayS(int size){
        String pattern = "";
         for(int row=1; row<2*size; row++){
         for(int col=1; col<2*size; col++){
            if((row<=size)&&((row==1)||(row==size)||(col==1))){
                if(((row==1)&&(col==1))||((row==size)&&(col==2*size-1))){
                   pattern +=" ";
                   }else{
                pattern +="*";
                }
             }else if((row>size)&&((col==2*size-1)||(row==2*size-1))){
                 if((row==2*size-1)&&(col==2*size-1)){
                      pattern +=" ";
                 }else{
                 pattern +="*";
                 }
             }else{
               pattern +=" ";
             }
         }
           pattern +="\n";
    }
      pattern +="\n";
      return pattern;
  }
  public String displayH(int size){
          String pattern = "";
       for(int row=1; row<2*size; row++){
         for(int col=1; col<2*size; col++){
            if((col==1)||(col==2*size-1)||(row==size)){
                   pattern +="*";
                }else{
                  pattern +=" ";
                }
            }pattern +="\n";
        }
        pattern +="\n";
        return pattern;
  }
 public String displayR(int size){
         String pattern ="";
     for(int line=1;line<=size; line++){
            pattern +="*";
         if((line==1)||(line==size)){
            for(int star=1; star<=size; star++){
                 pattern +="*";
             }
         }
         int spaces = ((line==1)||(line==size)) ? 1:size;
           for(int space=1;space<=spaces; space++){
              pattern +=" ";
         }
        if(spaces==size){
              pattern +="*";
           }  pattern +="\n";
      }
      for(int line=1; line<size; line++){
              pattern +="*";
          for(int space=1; space<=line; space++){
               pattern +=" ";
        }
              pattern +="*\n";
     }
     pattern +="\n";
     return pattern;
 }


  public String displayU(int  size){
    String pattern = "";
   for(int row=1; row<2*size; row++){
     for(int col=1; col<2*size; col++){
     if((col==1)||(col==2*size-1)||(row==2*size-1)){
         if(((col==1)&&(row==2*size-1))||((row==2*size-1)&&(col==2*size-1))){
            pattern +=" ";
           }else{
         pattern +="*";
         }
         }else{
        pattern +=" ";
         }
        }
        pattern +="\n";
    }
    pattern +="\n";
    return pattern;
}
 public  String displayT(int size){
          String pattern = "";
      for(int row=1; row<2*size; row++){
         for(int col=1; col<2*size; col++){
             if((row==1)||(col==size)){
                pattern +="*";
             }else{
                pattern +=" ";
              }
          }
            pattern +="\n";
      }
      pattern +="\n";
    return pattern;
  }
  public  String displayI(int size){
          String pattern = "";
      for(int row=1; row<2*size; row++){
         for(int col=1; col<2*size; col++){
             if((row==1)||(col==size)||(row==2*size-1)){
                pattern +="*";
             }else{
                pattern +=" ";
              }
          }
            pattern +="\n";
      }
      pattern +="\n";
    return pattern;
  }


  public static void main(String[]args){
   NameVertical shruti = new NameVertical();
     int size = 3;
     if(size>=3){
    System.out.print(shruti.displayS(size)+shruti.displayH(size)+shruti.displayR(size)+shruti.displayU(size)+shruti.displayT(size)+shruti.displayI(size));
     }else{
     System.out.println("SHRUTI");
     }
    }
}
