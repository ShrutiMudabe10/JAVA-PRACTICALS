
public class Pract4{
 //getByte
public static int getByte(int num){
    int ans;
    if(num<0 && num>=-128){
        return  num;
        }else{
        int temp = num/128;
        if(temp%2 == 0){
         ans = num%128;
         }else if(temp<0){
         ans = num%128 + 128;
         }else{
         ans = num%128 - 128;
         }
      }
      
      return ans;
}
//getShort
public static int getShort(int num){
        int ans;
        if(num<0 && num>=-32768){
            return num;
       }else{
            int temp = num/32768;
            if(temp%2 == 0){
                ans = num%32768;
            }else if(temp <0){
                ans = num%32768 + 32768;
           }else{
                ans = num%32768 - 32768;
           }
       }
       return ans;
   }
   // getNumber
   public static int getNumber(int num,String type){
   int ans ;
     
  if(type.equalsIgnoreCase("byte")){
          ans = getByte(num);
     }
     
  else if(type.equalsIgnoreCase("short")){
     ans = getShort(num);
     }
     else{
     return -1;
     }
return ans;
 }
 
 public static String toXXSystem(String num ,String system){
    char ch = num.charAt(0);
    char ch1 = num.charAt(1);
    String ans = "";
    
    if(ch =='0' && (ch1 =='b' || ch1 =='B')){
       
      ans = binaryToSystem(num.substring(2,num.length()),system);
    
    }else if(ch =='0' &&(ch1 =='x' || ch1 =='X')){
    
      ans = hexaToSystem(num.substring(2,num.length()),system);
    
    }else if(ch == '0'){
    
       ans = octalToSystem(num,system);
    }else{
        ans = deciToSystem(num,system);
     } 
    
   return ans;  
}
 // Binary to different Systems
public static String binaryToSystem(String num , String system){
       String Num = binaryToDeciSystem(num);
        String ans = "";
        if(system =="d" || system =="D"){
           return Num;
           }else if(system =="o" || system =="O"){
             ans = deciToOctalSystem(Num);
             }else if(system =="h" || system =="H"){
              ans = deciToHexaSystem(Num);
              }else if(system =="b" || system =="B"){
               ans = num;
               }else{
               return "-1";
               }
      return ans;
       }
       // Octal to different Systems
       public static String octalToSystem(String num , String system){
       String Num = octalToDeciSystem(num);
        String ans = "";
        if(system =="d" || system =="D"){
           return Num;
           }else if(system =="o" || system =="O"){
             ans = deciToOctalSystem(Num);
             }else if(system =="h" || system =="H"){
              ans = deciToHexaSystem(Num);
              }else if(system =="b" || system =="B"){
                 ans = num;
               }else {
               return "-1";
               }
      return ans;
       }
       // Decimal to different System
       public static String deciToSystem(String num,String system){
        
            String ans = "";
             if(system =="d" || system =="D"){
                 return num;
             }else if(system =="o" || system =="O"){
                 ans = deciToOctalSystem(num);
             }else if(system =="h" || system =="H"){
                 ans = deciToHexaSystem(num);
              }else if(system =="b" || system =="B") {
                 ans = deciToBinarySystem(num);
               }else{
                  return "-1";
               }
      return ans;
       }
     // hexadecimal to different systems  
    public static String hexaToSystem(String num, String system){
      String Num = hexaToDeciSystem(num);
      
        String ans = "";
        if(system =="d" || system =="D"){
           return Num;
           }else if(system =="o" || system =="O"){
             ans = deciToOctalSystem(Num);
             }else if(system =="h" || system =="H"){
              ans = deciToHexaSystem(Num);
              }else if(system =="b" || system =="B"){
               ans = deciToBinarySystem(Num);
              }else {
               return "-1";
               }
      return ans;
  }
      
       
   //Binary to decimal conversion    
  public static String binaryToDeciSystem(String num){
     int rem = 0 ,i=0; 
     int deciNum = 0;
      int n = Integer.parseInt(num);
    
 
      while(n>0){
       rem = n%10;
       deciNum += (int)(rem * Math.pow(2,i));
       n = n/10;
       i++;
       }
       
    return Integer.toString(deciNum);
 }
  // decimal to binary conversion
  public static String deciToBinarySystem(String num){
       int rem = 0,i=0; 
       String binNum = "", Num = "";
      
       int n = Integer.parseInt(num);
       
       while(n>0){
       rem = n % 2;
        Num += rem;
       n = n/ 2;
      
       }
       for(i=Num.length()-1 ; i>=0; i--){
          binNum += Num.charAt(i);
          }
    return binNum;
 }
 // decimal to Octal conversion
 public static String deciToOctalSystem(String num){
      
       int rem = 0,i=0; 
       String octNum = "" , Num = "";
        
       int n =  Integer.parseInt(num);
        while(n>0){
            rem = n%8;
            Num += rem;
            n = n/8;
          
        }
        for(i=Num.length()-1 ; i>=0; i--){
          octNum += Num.charAt(i);
          }

    return octNum;
    }
    
    // octal to Decimal conversion
    public static String octalToDeciSystem(String num){
      
      int rem = 0, i=0; 
      int deciNum = 0;
      
       int n =  Integer.parseInt(num);
       while(n>0){
            rem = n%10;
            deciNum += (int)(rem*Math.pow(8,i));
            n = n/10;
            i++;
          
        }
       

    return Integer.toString(deciNum);
    }
    // decimal to hexadecimal conversion
    public static String deciToHexaSystem(String num){
       int rem = 0 , i =0;
       int n = Integer.parseInt(num);
       String Num = "" , hexNum = "";
       
       
       while(n > 0){
       rem = n % 16;
       if(rem ==10){
          Num += "a";
        }else if(rem ==11){
          Num +="b";
        }else if(rem==12){
          Num +="c";
        }else if(rem==13){
          Num +="d";
        }else if(rem==14){
          Num +="e";
        }else if(rem==15){
          Num +="f";
        }else{
          Num += rem;
         }
           n = n/16;
           
         }
         for( i = Num.length()-1 ; i>=0; i--){
          hexNum += Num.charAt(i);
          }
      return hexNum;
  }
  // hexadecimal to decimal conversion
  public static String hexaToDeciSystem(String num){
      int rem = 0,i=0,deciNum =0;
      
      String Num ="";
      
      for(i = 0 ; i< num.length(); i++){
         char ch = num.charAt(i);
         
         if(ch =='a'){
          Num += "10";
          }else if(ch =='b'){
          Num +="11";
          }else if(ch =='c'){
          Num +="12";
          }else if(ch =='d'){
          Num +="13";
          }else if(ch =='e'){
          Num +="14";
          }else if(ch =='f'){
          Num +="15";
          }else {
           Num +=ch;
           }
      }
           i = 0;
           int n = Integer.parseInt(Num);
           while(n > 0){
           rem = n % 100;
           deciNum += (int)(rem* Math.pow(16,i));
           if(rem <=9){
           n = n/10;
           }else{
            n = n /100;
            }
           i++;
           }
      return Integer.toString(deciNum);
  }
           
   public static void main(String[] args){
         //System.out.println(getByte(128));
         //System.out.println(getShort(32769));
         System.out.println(getNumber(-128,"bYte"));
         System.out.println(deciToOctalSystem("15"));
         System.out.println(toXXSystem("0Xa0","D"));
        

  }
}
