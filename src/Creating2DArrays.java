import java.util.Scanner;

public class Creating2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nums = {{9,7,1,2},{4,8,3,-4},{-1,6,5,9}};
        ArrayMethods.printArray(nums);

            int[][] randoms = new int[8][5];
            for(int i = 0; i < randoms.length; i++){
                for(int j = 0; j < randoms[i].length; j++){
                    randoms[i][j] = (int) (Math.random() * 100) + 1;
                }
                System.out.println();
            }
            ArrayMethods.printArray(randoms);
            System.out.println("Enter number of rows");
            int rows = sc.nextInt();
            System.out.println("Enter number of columns");
            int columns = sc.nextInt();
            String[][] arr = new String[rows][columns];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("Enter " + i + " row " + j + " column " + j + " value");
                arr[i][j] = sc.nextLine();
            }
            System.out.println();
        }
        ArrayMethods.printArray(arr);


        }
    }

