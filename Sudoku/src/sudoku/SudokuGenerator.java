package sudoku;

import java.util.*;

public class SudokuGenerator {

    private final int SIZE;
    public int[][] board;
    private String level;
    private int cellsToRemove;

    public SudokuGenerator(int SIZE,String level) {
        this.SIZE = SIZE;
        this.level = level;
        board = new int[SIZE][SIZE];
        generatePuzzle();
    }

    public void generatePuzzle() {
        fillBoard();
         setSpaces();
        removeCells();
    }

    private void fillBoard() {
        fillRowWise(0, 0);
    }

    private boolean fillRowWise(int row, int col) {
        if (row == SIZE)
            return true;
        if (col == SIZE)
            return fillRowWise(row + 1, 0);

        List<Integer> numbers = getShuffledNumbers();
        for (int num : numbers) {
            if (isSafe(row, col, num)) {
                board[row][col] = num;
                if (fillRowWise(row, col + 1))
                    return true;
                board[row][col] = 0;
            }
        }
        return false;
    }

    private boolean isSafe(int row, int col, int num) {
        for (int x = 0; x < SIZE; x++) {
            if (board[row][x] == num || board[x][col] == num)
                return false;
        }
        return true;
    }

    private List<Integer> getShuffledNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= SIZE; i++)
            numbers.add(i);
        Collections.shuffle(numbers);
        return numbers;
    }
    private void setSpaces(){
        if(level.equals("Low")){
            cellsToRemove  = SIZE*SIZE/3;
        }else if(level.equals("Medium")){
            cellsToRemove  = SIZE*SIZE/3+SIZE;
            
        }else if(level.equals("Hard")){
            cellsToRemove  = SIZE*SIZE-1;
        }
    }

    private void removeCells() {
      
        Random rand = new Random();
        while (cellsToRemove > 0) {
            int i = rand.nextInt(SIZE);
            int j = rand.nextInt(SIZE);
            if (board[i][j] != 0) {
                board[i][j] = 0;
                cellsToRemove--;
            }
        }
    }

    public void printBoard() {
        for (int r = 0; r < SIZE; r++) {
            for (int d = 0; d < SIZE; d++) {
                System.out.print(board[r][d] == 0 ? ". " : board[r][d] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SudokuGenerator game = new SudokuGenerator(9,"Low"); 
        game.printBoard();
    }
}
