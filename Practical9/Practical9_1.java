public class Practical9_1 {

  // Iterative factorial method
    public static long getFactorial1(int number) {
        long ans = 1;
        for (int i = number; i > 0; i--) {
            ans *= i;
        }
        return ans;
    }

    // Recursive factorial method
    public static long getFactorial2(int number) {
        if (number == 0) {
            return 1;
        }
        return number * getFactorial2(number-1);
    }

    public static void main(String[] args) {
        int size = 0;
        if(args.length > 0){
            size = Integer.parseInt(args[0]);
        }
        int[] Elements = new int[size];

       
        for (int i = 0; i < size; i++) {
            Elements[i] = (int) (System.nanoTime() % 53); 
        }

        long totalIterationTime = 0;
        long totalRecursionTime = 0;

       
        for (int i = 0; i < Elements.length; i++) {
            int number = Elements[i];

            // time for iterative method
            long startTime = System.nanoTime();
            long TimeForloop = getFactorial1(number);
            long endTime = System.nanoTime();
            totalIterationTime += (endTime - startTime);

            //  time for recursive method
            startTime = System.nanoTime();
            long timeForRecursion = getFactorial2(number);
            endTime = System.nanoTime();
            totalRecursionTime += (endTime - startTime);
        }

        
        double averageIterationTime = totalIterationTime / (double) size;
        double averageRecursionTime = totalRecursionTime / (double) size;

        // Output results
        System.out.println("Random Numbers: ");
        for (int i = 0; i < Elements.length; i++) {
            System.out.print(Elements[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Average time by Iteration: " + averageIterationTime + " ns");
        System.out.println("Average time by Recursion: " + averageRecursionTime + " ns");

        if (averageIterationTime < averageRecursionTime) {
            System.out.println("Iterative method performs better.");
        } else if (averageIterationTime > averageRecursionTime) {
            System.out.println("Recursive method performs better.");
        } else {
            System.out.println("Both methods have same performance.");
        }
    }

  
}
