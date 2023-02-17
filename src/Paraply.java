import java.util.Scanner;

public class Paraply {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final boolean alwaysTrue = true;
        final boolean alwaysFalse = false;
        String regnString;
        boolean regn = false;
        boolean regn1tim = false; // initialize to false
        String regn1timString;
        System.out.println("Is it raining now? (True/False - Y/N)");
        regnString = input.next();

        System.out.println("Kommer det att regna inom 1 timme?");
        regn1timString = input.next();
         //om det kommer att regna
         if (regnString.equalsIgnoreCase("y") || regnString.equalsIgnoreCase("yes") || regnString.equalsIgnoreCase("true")
               || regnString.equalsIgnoreCase("sant") || regnString.equalsIgnoreCase("ja")) {
             regn = true;

         //om det inte kommer att regna
           } else if (regnString.equalsIgnoreCase("n") || regnString.equalsIgnoreCase("no") || regnString.equalsIgnoreCase("false")
                 || regnString.equalsIgnoreCase("falskt") || regnString.equalsIgnoreCase("nej")) {
            regn = false;


        // Om det börjar regna, och det kommer regna inom 1 timme
        }
        if (regn1timString.equalsIgnoreCase("y") || regn1timString.equalsIgnoreCase("yes") || regn1timString.equalsIgnoreCase("true")
                || regn1timString.equalsIgnoreCase("sant") || regn1timString.equalsIgnoreCase("ja") || regnString.equalsIgnoreCase("y") || regnString.equalsIgnoreCase("yes") || regnString.equalsIgnoreCase("true")
                || regnString.equalsIgnoreCase("sant") || regnString.equalsIgnoreCase("ja")) {
            regn = true;
            regn1tim = true;

        } while (regn1tim == alwaysTrue && regn == alwaysTrue) {
            System.out.println("Behöver du ett paraply?: " + regn1tim);
            break;
        }


    }
}
