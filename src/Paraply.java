import java.util.Scanner;

public class Paraply {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String regnString;
        boolean regn = false;
        boolean regn1tim = false;
        String regn1timString;

        System.out.println("Regnar det nu? (True/False - Y/N)");
        regnString = input.next();

        System.out.println("Kommer det att regna inom närmsta timmen? (True/False - Y/N)");
        regn1timString = input.next();

        // Kolla om det regnar
        if (regnString.equalsIgnoreCase("y") || regnString.equalsIgnoreCase("yes") || regnString.equalsIgnoreCase("true")
                || regnString.equalsIgnoreCase("sant") || regnString.equalsIgnoreCase("ja")) {
            regn = true;

            // Kolla om det kommer att regna inom närmsta timme
            if (regn1timString.equalsIgnoreCase("y") || regn1timString.equalsIgnoreCase("yes") || regn1timString.equalsIgnoreCase("true")
                    || regn1timString.equalsIgnoreCase("sant") || regn1timString.equalsIgnoreCase("ja")) {
                regn1tim = true;

            } else if (regn1timString.equalsIgnoreCase("n") || regn1timString.equalsIgnoreCase("no") || regn1timString.equalsIgnoreCase("false")
                    || regn1timString.equalsIgnoreCase("falskt") || regn1timString.equalsIgnoreCase("nej")) {
                regn1tim = false;
            }

            if (regn && regn1tim) {
                System.out.println("Du behöver ett paraply.");
            } else if (regn && !regn1tim) {
                System.out.println("Kanske borde du ta med ett paraply, för säkerhets skull!.");
            } else {
                System.out.println("äsch, du behöver inget paraply!");
            }

        } else if (regnString.equalsIgnoreCase("n") || regnString.equalsIgnoreCase("no") || regnString.equalsIgnoreCase("false")
                || regnString.equalsIgnoreCase("falskt") || regnString.equalsIgnoreCase("nej")) {

            if (regn1timString.equalsIgnoreCase("y") || regn1timString.equalsIgnoreCase("yes") || regn1timString.equalsIgnoreCase("true")
                    || regn1timString.equalsIgnoreCase("sant") || regn1timString.equalsIgnoreCase("ja")) {
                System.out.println("Du behöver inget paraply.");
            } else {
                System.out.println("Du behöver inget paraply.");
            }

        } else {
            System.out.println("Ogiltiga svar!");
        }
    }
}
