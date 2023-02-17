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

              //om det regnar nu
         if (regnString.equalsIgnoreCase("y") || regnString.equalsIgnoreCase("yes") || regnString.equalsIgnoreCase("true")
               || regnString.equalsIgnoreCase("sant") || regnString.equalsIgnoreCase("ja")) {
             regn = true;

                //om det inte regnar nu
           } else if (regnString.equalsIgnoreCase("n") || regnString.equalsIgnoreCase("no") || regnString.equalsIgnoreCase("false")
                 || regnString.equalsIgnoreCase("falskt") || regnString.equalsIgnoreCase("nej")) {
             regn = false;

                 // om det regnar om en 1 tim
             if (regn1timString.equalsIgnoreCase("y") || regn1timString.equalsIgnoreCase("yes") || regn1timString.equalsIgnoreCase("true")
                     || regn1timString.equalsIgnoreCase("sant") || regn1timString.equalsIgnoreCase("ja")) {
                 regn1tim = true;

                 // om det inte kommer regna om 1 tim
             } else if (regn1timString.equalsIgnoreCase("n") || regn1timString.equalsIgnoreCase("no") || regn1timString.equalsIgnoreCase("false")
                     || regn1timString.equalsIgnoreCase("falskt") || regn1timString.equalsIgnoreCase("nej")) {
                 regn1tim = false;


                     // Om det börjar regna, och det kommer regna inom 1 timme
             }
             if (regn1timString.equalsIgnoreCase("y") || regn1timString.equalsIgnoreCase("yes") || regn1timString.equalsIgnoreCase("true")
                     || regn1timString.equalsIgnoreCase("sant") || regn1timString.equalsIgnoreCase("ja") || regnString.equalsIgnoreCase("y") || regnString.equalsIgnoreCase("yes") || regnString.equalsIgnoreCase("true")
                     || regnString.equalsIgnoreCase("sant") || regnString.equalsIgnoreCase("ja")) {
                 regn = true;
                 regn1tim = true;

             }
             if (regn1timString.equalsIgnoreCase("n") || regn1timString.equalsIgnoreCase("no") || regn1timString.equalsIgnoreCase("false")
                     || regn1timString.equalsIgnoreCase("falskt") || regn1timString.equalsIgnoreCase("nej") || regnString.equalsIgnoreCase("n") || regnString.equalsIgnoreCase("no") || regnString.equalsIgnoreCase("false")
                     || regnString.equalsIgnoreCase("falskt") || regnString.equalsIgnoreCase("nej")) {
                 regn = false;
                 regn1tim = false;
             }
boolean wasWhileExecuted = false;
             while (regn1tim == alwaysTrue && regn == alwaysTrue) {
                 System.out.println("Behöver du ett paraply?: " + regn1tim);
                 wasWhileExecuted = true;
                 break;
             }

             while (regn == alwaysTrue && regn1tim == alwaysFalse) {
                 System.out.println("Kanske att du behöver ett paraply. Ta med ett - just in case!");
                 break;
             }

         }
    }
}
