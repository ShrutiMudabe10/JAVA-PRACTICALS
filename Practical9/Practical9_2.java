public class Practical9_2 {
  
    public static void main(String[] args){
        int size = 0;
        if(args.length > 0){
            size = Integer.parseInt(args[0]);
        }

        String [] str = new String[size];

        for(Integer i=0; i<size; i++){
            Integer val = (int) (System.nanoTime() % 51); 
            str[i] = val.toString();
        }

        double totalStringTime = 0;
        double totalStringBuilderTime = 0;
        double totalStringBufferTime = 0;

        for(int i=0; i<str.length; i++){

             long startTime = System.nanoTime();
             String str1 = "898";
               str1 += str[i];
             long endTime = System.nanoTime();
             totalStringTime += (endTime - startTime);

             startTime = System.nanoTime();
             StringBuilder str2 = new StringBuilder("898");
              str2.append(str[i]);
             endTime = System.nanoTime();
             totalStringBuilderTime += (endTime - startTime);

             startTime = System.nanoTime();
             StringBuffer str3 = new StringBuffer("898");
             str3.append(str[i]);
             endTime = System.nanoTime();
             totalStringBufferTime += (endTime - startTime);
        }

        double stringAverageTime = totalStringTime / size;
        double stringBuilderAverageTime = totalStringBuilderTime / size;
        double stringBufferAverageTime = totalStringBufferTime / size;

        System.out.print("Random Strings: ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println("\n");

        
        System.out.println("Average time for String: " + stringAverageTime + " ns");
        System.out.println("Average time for StringBuilder: " + stringBuilderAverageTime + " ns");
        System.out.println("Average time for StringBuffer: " + stringBufferAverageTime + " ns");

        if(stringAverageTime < stringBuilderAverageTime  && stringAverageTime < stringBufferAverageTime ){
            System.out.println("String Performs Better StringBuffer and StringBuilder");
        }
        else if(stringBufferAverageTime< stringAverageTime && stringBufferAverageTime < stringBuilderAverageTime ){
            System.out.println("StringBuffer Performs Better than String and StringBuilder");
        }
        else if(stringBuilderAverageTime< stringAverageTime && stringBuilderAverageTime < stringBufferAverageTime){
            System.out.println("StringBuilder Performs Better than String and StringBuffer");
        }

    }
}
