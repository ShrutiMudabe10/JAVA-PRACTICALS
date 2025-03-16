import java.util.*;
import java.io.*;

public class Game{
    private int k ;
    private int size;
    private String level;
      String[][] grid;
      int [][] arr;
     
    
     Game(int size,String level){
     this.level = level;
      this.size = size;
     this.grid = new String[size*2+1][size*2+1];
     this.arr = new int[size][size];
     this.setLevel();
     this.generateNumbers();
     this.gridgenerator();
     }
public  void setLevel(){
   if(level.equalsIgnoreCase("easy")){
     this.k = 0;
   }else if(level.equalsIgnoreCase("medium")){
   this.k = size/3+size;
   }else if(level.equalsIgnoreCase("difficult")){
    this.k = (size*size)/3+size;
   }
}

private boolean isUsedBefore(int row,int col,int num){
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

public void generateNumbers(){
   Random random = new Random(); 
    StringBuilder sb = new StringBuilder();
     for(int i=0;i<size;i++){
       for(int j=0;j<size;j++){
          if(j==0 || sb.length()==0){
           for(int k=0;k<size;k++){
             sb.append(k+1);
           }
         }else{
           int idx = random.nextInt(sb.length()-1);
           String ch = sb.charAt(idx)+"";
            if(!isUsedBefore(i,j,Integer.parseInt(ch))){
          arr[i][j] = Integer.parseInt(ch);
           sb.deleteCharAt(idx);
           }
         }
       }
     }
    this.removeDigits();   
}
private void removeDigits() {
        Random random = new Random();
        while (k > 0) {
            // Pick a random cell
            int cellId = random.nextInt(size*size);

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
      
    }
// to display final sudoku puzzle
public  void displayGrid(){

    for(int row=0; row<grid.length; row++){
        for(int col=0; col<grid[0].length;col++){
            if(String.format("%3d",0).equals(grid[row][col])){
             System.out.print("   ");
             }else{
           System.out.print(grid[row][col]);
            }
          }
        System.out.println();
    }
}
// for generating the grid 
public void gridgenerator(){
         
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
                 grid[row][col]=String.format("%3d",arr[row/2][col/2]);
           
                 }
              }
           }
        }
        displayGrid();
 }
 public void setElement(int num,int i,int j){
     
         arr[i][j] = num;
         this.gridgenerator();

 }
 public String checkSolution(){
    for(int i=0; i<size;i++){
      for(int j=0;j<size;j++){
          if(isUsedBefore(i,j,arr[i][j])){
            return "Oops! Invalid solution.try again!!";
          }
      }
    }
    return "Great! Solution is valid.";
 }
 
 public static void main(String[] args) throws IOException{
      int size = Integer.parseInt(args[0]);
      String level = args[1];
      Game g1 = new Game(size,level);
       int arr[][] = g1.arr;
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     
      //taking input from user for solution.  
     for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        if(arr[i][j] == 0){
         System.out.print("enter element for ("+i+","+j+") between(1-"+size+"):");
          int num = Integer.parseInt(reader.readLine());
          g1.setElement(num,i,j);
         
        }
      }
   }
     System.out.println(g1.checkSolution());
   }
 }
