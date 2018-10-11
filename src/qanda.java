import java.util.Scanner;

public class qanda {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Wat is jouw naam?");
        System.out.println();
        String name = s.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println();

        System.out.println("Hoe oud ben jij?");
        System.out.println();

        int age = s.nextInt();
        System.out.println("Jouw leeftijd is " + age + " jaar oud!");
        System.out.println();

        if (age < 18) {
            System.out.println("okee je bent niet oud genoeg");
            System.out.println();
        }

        else {
            System.out.println("okee dan ben je oud genoeg voor de q and a.");
            System.out.println();

            System.out.println("op eenschaal van 1 tot 10 hoe dronken ben je.");

            int dronken = 1;
            dronken = s.nextInt();

            if (dronken == 10) {
                System.out.println("Je heb te veel gezopen");
            } else if (dronken < 5) {
                System.out.println("je hebt 1 glaasje op");
            } else if (dronken == 5) {
                System.out.println("Je hebt 3 glaasjes op");
            } else if (dronken > 5) {
                System.out.println("je hebt 8 glaasjes op");
            }

        }

    }
}