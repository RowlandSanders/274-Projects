import java.util.Random;
import java.util.Scanner;

public class Pro3 {

    public static void main(String[] args) {
        Random rand = new Random();
        LinkedList myList = new LinkedList();
        for(int i = 0;i<22;i++){
            myList.addMain(word());
        }
        System.out.println();
        myList.display();
        System.out.println();
        System.out.println("What would you like to do with your Linked List");
        System.out.println();
        System.out.print("(A)dd");
        System.out.print(",(D)elete");
        System.out.print(",(F)ind");
        System.out.println(",(Q)uit List Size:"+myList.getSize());
        System.out.println();
        System.out.print("Type the first letter of your choice capitalized: ");
        String val = "";
        do {
            System.out.println();//menu
            Scanner input = new Scanner(System.in);
            val = input.nextLine();
            if (val.compareToIgnoreCase("a")==0) {
                myList.add(word());
                System.out.println();
                myList.display();
                System.out.println();

            } else if (val.compareToIgnoreCase("d")==0) {
                int temp = rand.nextInt(myList.getSize());
                myList.delete(temp);
                System.out.println();
                myList.display();
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
                    System.out.println();
                    System.out.print("Word not found");
                }

            }


        }while(val.compareToIgnoreCase("q")!=0);{
            System.exit(1);
            System.out.println("Process finished with exit code 1");

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
