 public class NameHorizontal{
public String displayS(int row,int size){
        String pattern = "";
        
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
     return pattern;
  }
  public String displayH(int row,int size){
          String pattern = "";
      
         for(int col=1; col<2*size; col++){
            if((col==1)||(col==2*size-1)||(row==size)){
                   pattern +="*";
                }else{
                  pattern +=" ";
                }
            }
     return pattern;
  }
 public String displayR(int row,int size){
     String pattern ="";
     
       if(row<=size){
      for(int col=1; col<2*size; col++){
        if(((row==1)&&(col==2*size-1))||((row==size)&&(col==2*size-1))){
           pattern +=" ";
      }else if((row==1)||(row==size)||(col==1)||(col==2*size-1)){
           pattern +="*";
         }else{
           pattern +=" ";
        }
      }
    }else{
           pattern +="*";
    
      for(int space=1; space<=row-2; space++){
           pattern +=" ";
       }
           pattern+="*";
       for(int space=1; space<2*size-row; space++){
          pattern+=" ";
          }
      }
    return pattern;
 }


  public String displayU(int row,int  size){
    String pattern = "";
  
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
    return pattern;
}
 public  String displayT(int row,int size){
          String pattern = "";
     
         for(int col=1; col<2*size; col++){
             if((row==1)||(col==size)){
                pattern +="*";
             }else{
                pattern +=" ";
              }
          }
           
    return pattern;
  }
  public  String displayI(int row,int size){
          String pattern = "";
     
         for(int col=1; col<2*size; col++){
             if((row==1)||(col==size)||(row==2*size-1)){
                pattern +="*";
             }else{
                pattern +=" ";
              }
          }
      
    return pattern;
  }


  public static void main(String[]args){
   NameHorizontal shruti = new NameHorizontal();
     int size = 3;
      for(int row=1; row<2*size; row++){
       System.out.print(shruti.displayS(row,size)+" "+shruti.displayH(row,size)+" "+shruti.displayR(row,size)+" "+shruti.displayU(row,size)+" "+shruti.displayT(row,size)+" "+shruti.displayI(row,size)+" "+"\n");
       }
    
}
