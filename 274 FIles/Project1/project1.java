
import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        String name;
        double distance;
        int hr, min, sec;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Los Angeles Marathon Training Program");
        System.out.print("Please enter your name: ");
        name = input.nextLine();
        System.out.print("Please enter your distance: ");
        distance = input.nextDouble();
        System.out.print("How many hours: ");
        hr = input.nextInt();
        System.out.print("How many minutes: ");
        min = input.nextInt();
        System.out.print("How many seconds: ");
        sec = input.nextInt();
        System.out.println("");
        Pace(hr,min,sec,distance,name);
    }
    public static void Pace(int hr, int min, int sec, double distance,String name){
        double eP = ((1*3600)+(59*60)+(40))/(26+(385/1760.0)); //eliud input
        double aP = ((hr*3600)+(min*60)+sec)/distance; //my input
        int sHr = (int)((aP)/3600);
        int sMin = (int)(((aP)-(sHr*3600))/60);
        int sSec = (int)((aP)-((sHr*3600)+(sMin*60)));
        int tHr = (int)(((26+(385/1760.0))*aP)/3600);
        int tMin = (int)((((26+(385/1760.0))*aP)-(tHr*3600))/60);
        int tSec = (int)(((26+(385/1760.0))*aP)-((tHr*3600)+(tMin*60)));
        System.out.println("Hi "+name);
        System.out.println("Your pace is "+sMin+":"+sSec);
        System.out.println("At this rate your marathon time would be "+tHr+":"+tMin+":"+tSec);
        System.out.println("Good luck with your training!");
        for (int i = 1;i <= 26;i++){
            int eHr = (int)((i*eP)/3600);
            int eMin = (int)(((i*eP)-(eHr*3600))/60);
            int eSec = (int)((i*eP)-((eHr*3600)+(eMin*60)));
            int aHr = (int)((i*aP)/3600);
            int aMin = (int)(((i*aP)-(aHr*3600))/60);
            int aSec = (int)((i*aP)-((aHr*3600)+(aMin*60)));
            System.out.printf("%d\t\t\t%01d:%02d:%02d\t\t\t%01d:%02d:%02d\n",i,eHr,eMin,eSec,aHr,aMin,aSec);
            if (i==26){
                int eyHr = (int)(((26+(385/1760.0))*eP)/3600);
                int eyMin = (int)((((26+(385/1760.0))*eP)-(eyHr*3600))/60);
                int eySec = (int)(((26+(385/1760.0))*eP)-((eyHr*3600)+(eyMin*60)));
                int ayHr = (int)(((26+(385/1760.0))*aP)/3600);
                int ayMin = (int)((((26+(385/1760.0))*aP)-(ayHr*3600))/60);
                int aySec = (int)(((26+(385/1760.0))*aP)-((ayHr*3600)+(ayMin*60)));
                System.out.printf("26m, 385y\t%01d:%02d:%02d\t\t\t%01d:%02d:%02d\n",eyHr,eyMin,eySec,ayHr,ayMin,aySec);
            }
        }
    }
}
