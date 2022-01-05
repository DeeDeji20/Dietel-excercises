package africa.semicolon.chapterSeven.practice;

import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        int[][] grid = readASolution();
        System.out.println(isValid(grid) ? "valid solution" : "Invalid solution");
    }

    private static boolean isValid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid)) return false;
            }
        }
        return true;
    }

    private static boolean isValid(int i, int j, int[][] grid) {
        for (int column = 0; column < 9; column++) {
            if (column!= j && grid[i][column] == grid[i][j]) return false;
        }

        for (int row = 0; row < 9; row++) {
            if (row != i && grid[row][j] == grid[i][j]) return false;
        }
        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++){
            for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++){
                if (row != i && col != j && grid[row][col] == grid[i][j]) return false;
            }
        }
           return true;
    }

    private static int[][] readASolution() {
        int[][] grid = new int[9][9];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sudoku puzzle solution: ");

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = scan.nextInt();
            }
        }
        return grid;
    }
}