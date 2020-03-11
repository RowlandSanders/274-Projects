import java.util.Random;
import java.util.Scanner;

public class Pro3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int temp = 0;
        LinkedList myList = new LinkedList();
        for(int i = 0;i<22;i++){
            myList.add(word());
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
        System.out.println("Type the first letter of your choice capitalized: ");

        Scanner input = new Scanner(System.in);
        String val = input.nextLine();
        if(val == "A"){
            myList.add(word());

        }else if(val =="D"){
            myList.delete();

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
