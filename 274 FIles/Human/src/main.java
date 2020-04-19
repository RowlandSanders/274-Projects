import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String input;
        Scanner in = new Scanner(System.in);

        do {
            int max;
            ArrayList<Integer> x = new ArrayList<>();

            System.out.print("\nHow tall is your pyramid? (Enter number of rows): ");
            max = in.nextInt();

            System.out.println("");
            System.out.println("Here is the graph of your pyramid showing the weight each person is holding:");
            System.out.println("");

            for (int row = 1; row <= max; row++) {
                for (int col = 1; col <= row; col++) {
                    x.add((int) weightOnBack(row, col));
                }
            }

            display(max, x);
            System.out.println();

            System.out.print("Do you want to run again? (y/n) ");
            input = in.next();

        }while(input.compareToIgnoreCase("n") != 0 && input.compareToIgnoreCase("y") != 1);
    }

    public static double weightOnBack(int rows, int columns){
        if(rows == 1 && columns == 1){
            return 0;
        }

        else if(columns == 1){
            return(75 + weightOnBack(rows - 1, columns)/2);
        }

        else if (columns == rows){
            return(75 + weightOnBack(rows - 1, columns - 1)/2);
        }

        else{
            return (150 + weightOnBack(rows - 1, columns - 1))/2 + ((150 + weightOnBack(rows - 1, columns))/2);
        }

    }

    public static void display(int row, ArrayList<Integer> aL){

        int index = 0;
        for(int i=1; i <= row; i++){
            for(int j=0; j < (row-i) ; j++){
                System.out.print("   ");
            }

            for(int j=0; j < i; j++){
                System.out.printf("(%4d)", aL.get(index++));
            }

            System.out.println(" ");
        }
    }
}
