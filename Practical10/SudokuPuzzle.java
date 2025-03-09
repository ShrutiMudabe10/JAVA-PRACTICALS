import java.util.Random;
public class Game{

public static boolean isUsedBefore(int[][] arr,int row,int col,int num){
for(int i=0;i<row;i++){
   for(int j=0;j<col;j++){
     if(arr[row][j] == num){
       return true;
       }else if( arr[i][col] == num){
       return true;
       }
    }
  }
  return false;
}

public static int[][] generateNumbers(int size){
      int[][] arr = new int[size][size];
     
      for(int i=0;i<size;i++){
       int num = i+1 ;
      for(int j=0;j<size;j++){
          if(!isUsedBefore(arr,i,j,num % size)){
            arr[i][j] = (num  % size) ;
              num++; 
            }
        }
    }
    return arr;    
}


 static int[][] removeDigits(int [][] arr, int k,int size) {
        Random rand = new Random();
        while (k > 0) {
            // Pick a random cell
            int cellId = rand.nextInt(size*size);

            // Get the row index
            int i = cellId / size;

            // Get the column index
            int j = cellId % size;

            // Remove the digit if the cell is not already empty
            if (arr[i][j] != 0 ) {
                // Empty the cell
                arr[i][j] = 0;
                k--;
            }
        }
        return arr;
    }
// to display final sudoku puzzle
public static void displayGrid(String[][] grid){

    for(int row=0; row<grid.length; row++){
        for(int col=0; col<grid[0].length;col++){
            if(" 0 ".equals(grid[row][col])){
             System.out.print("   ");
             }else{
           System.out.print(grid[row][col]);
            }
          }
        System.out.println();
    }
}
// for generating the grid 
public static String[][] gridgenerator(int size,int[][] arr){
         
          String[][] grid = new String[size*2+1][size*2+1];
          
          for(int row=0; row<=2*size;row++){
           int i=row;
     for(int col=0; col<=2*size;col++){
          if(row%2==0){
               if(col%2==0){
               grid[row][col]="+";
              }else{
            grid[row][col]="---";
           }
          }else{ 
              if(col%2==0){
               grid[row][col]="|";
              }else{
            grid[row][col]=" "+String.valueOf(arr[row/2][col/2])+ " ";
           
           }
         }
      }
   }
  return grid;
}
 public static void main(String[] args){
      int size = Integer.parseInt(args[0]);
       int arr[][] = generateNumbers(size);
        int k = size*size/3;
      int ans[][] = removeDigits(arr,k,size);
       String[][] grid = gridgenerator(size,ans);
        displayGrid(grid);
   }
 }

