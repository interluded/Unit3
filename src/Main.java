public class Main {
    public static void main(String[] args) {
      int [][] grid = new int[3][4];

        grid[0][0] = 13;
        grid[0][1] = 5;
        grid[0][2] = 7;
        grid[0][3] = 3;

        grid[1][0] = 10;
        grid[1][1] = 3;
        grid[1][2] = 1;
        grid[1][3] = 6;

        grid[2][0] = 2;
        grid[2][1] = 8;
        grid[2][2] = 5;
        grid[2][3] = 9;

        // initilizerList
        int[][] grid2 = {{13,5,7,9},{10,3,1,6},{2,8,5,9}};
        ArrayMethods.printArray(grid2);
        ArrayMethods.printArray(grid);
    }
}