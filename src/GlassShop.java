import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
public class GlassShop {

    static ArrayList<String> dinSmak = new ArrayList<String>();
    static ArrayList<Glass> smaker = new ArrayList<Glass>();


public static void start() {


    Glass banan = new Glass("Banan", 25,"Söt", "Gul");

    //banan.setSmak("Banan");  <-- annat sätt att skriva ut det.
    smaker.add(banan);

    Glass hallon = new Glass("Hallon", 20,"Söt", "Röd");
    smaker.add(hallon);

    Glass vanilla = new Glass("Vanilla", 45,"Söt", "Röd");
    smaker.add(vanilla);



        boolean runProgram = true;
        while (runProgram) {

            printMenu();

            int menyVal = getUserInt();
            switch (menyVal) {
                case 1:
                    System.out.println("Strut eller bägare?");
                    dinSmak.add(getUserSmak());

                    System.out.println("Vilken smak vill du ha?");
                    dinSmak.add(getUserSmak());

                    System.out.println("Här har du din glass!");
                    System.out.println(dinSmak);
                    break;

                case 2:
                    for (int i = 0; i < smaker.size(); i++) {
                        System.out.println(smaker.get(i).getGlass() + ", " + smaker.get(i).getPris() + "kr");

                    }
                    break;


                case 3:
                    System.out.println("Vilken smak vill du veta mer om?");
                    String val = getUserSmak();

                    for(int i = 0; i < smaker.size(); i++){
                        if(Objects.equals(val, smaker.get(i).getGlass())){
                            System.out.println(smaker.get(i).getBeskrivning() + " och " + smaker.get(i).getFärg());

                        }
                    }
                    break;



                case 4:
                    System.out.println("Du har avslutat din beställning");
                    runProgram = false;
                    break;
            }


        }


}

    public static void printMenu () {
        System.out.println("Välkommen till Annas Glass shop!");
        System.out.println("1. Beställ glass");
        System.out.println("2. Se smaker");
        System.out.println("3. Fråga om produkt");
        System.out.println("4. Avsluta beställning");
    }

    public static String getUserSmak() {
        Scanner scan = new Scanner(System.in);

        String userSmak = (scan.nextLine());
        return userSmak;
    }

    public static int getUserInt() {
        Scanner scan  = new Scanner(System.in);

        int myInt;

    while (true) {
        try {
            myInt = Integer.parseInt(scan.nextLine());
            break;
        }
        catch(Exception e) {
            System.out.println("Felaktigt menyval, försök igen!");
        }
    }
        return myInt;

    }
}
