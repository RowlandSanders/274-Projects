import java.util.Random;
import java.util.Scanner;
/*
Rowland Sanders
CECS 274-05
Project 3: LinkedList
3/17/2020
 */

public class Pro3 {

    public static void main(String[] args) {
        Random rand = new Random();
        LinkedList myList = new LinkedList();
        for(int i = 0;i<100;i++){
            myList.addMain(word());
        }
        System.out.println();
        myList.display();
        System.out.println(" ");
        System.out.println();
        System.out.print("(A)dd");
        System.out.print(",(D)elete");
        System.out.print(",(F)ind");
        System.out.println(",(Q)uit List Size:"+(myList.getSize()-1));
        System.out.println(" ");
        String val = "";

        do {
            System.out.print(">");//menu
            Scanner input = new Scanner(System.in);
            val = input.nextLine();
            if (val.compareToIgnoreCase("a")==0) {
                myList.add(word());
                System.out.println();
                myList.display();
                System.out.println();
                System.out.println();
                System.out.print("(A)dd");
                System.out.print(",(D)elete");
                System.out.print(",(F)ind");
                System.out.println(",(Q)uit List Size:"+(myList.getSize()-1));
                System.out.println();


            } else if (val.compareToIgnoreCase("d")==0) {

                System.out.println();
                int temp = rand.nextInt(myList.getSize());
                myList.delete(temp);
                System.out.println(" ");
                System.out.println();
                myList.display();
                System.out.println(" ");

                System.out.println(" ");
                System.out.print("(A)dd");
                System.out.print(",(D)elete");
                System.out.print(",(F)ind");
                System.out.println(",(Q)uit List Size:"+(myList.getSize()-1));
                System.out.println();

            } else if (val.compareToIgnoreCase("f")==0) {
                System.out.println();
                System.out.print("What word do you wanna search for? ");
                Scanner input2 = new Scanner(System.in);
                String val2 = input2.next();
                System.out.println();
                if(myList.find(val2, myList)){
                }
                else{
                    System.out.print("Word not found");
                    System.out.println();
                }

                System.out.println(" ");
                System.out.print("(A)dd");
                System.out.print(",(D)elete");
                System.out.print(",(F)ind");
                System.out.println(",(Q)uit List Size:"+(myList.getSize()-1));
                System.out.println();
            }


        }while(val.compareToIgnoreCase("q")!=0);{
            System.exit(-1);

        }


    }
    public static String word(){
        Random rand = new Random();
        String [] all = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String [] vowel = {"a", "e", "i", "o", "u"};

        String one = all[rand.nextInt(26)];
        String two = vowel[rand.nextInt(5)];
        String three = all[rand.nextInt(26)];
        String four = all[rand.nextInt(26)];
        String word = one+two+three+four;

        return word;
    }
}
