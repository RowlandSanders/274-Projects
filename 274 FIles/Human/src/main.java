import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static int rows;
    public static int count;
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.printf("%s%n%s","Welcome to the Human Pyramid.","How tall is your pyramid? (Enter the number of rows): ");
        rows = scan.nextInt();

        for(int i  = 1; i<rows+1; i++){
            for(int r=0; r<rows+1-i;r++){
                System.out.print("  ");
            }
            for(int k =1; k<=i; k++){
                System.out.printf("%4d", (int)WeightOnBack(i,k));
            }
            System.out.println();
            
        }
    }

    public static double WeightOnBack(int row, int col) {
        count++;
        if (row == 1 && col == 1) {
            return 0.0;
        } else if (col == 1) {
            return (75 + WeightOnBack(row - 1, col) / 2);
        } else if (col == row) {
            return (75 + WeightOnBack(row - 1, col - 1) / 2);
        } else {
            return (150 + WeightOnBack(row - 1, col - 1)) / 2 + ((150 + WeightOnBack(row - 1, col)) / 2);
        }
    }


}