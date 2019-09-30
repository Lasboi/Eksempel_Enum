import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hand a = Hand.PAPIR;
        Hand b = Hand.SAKS;

        StenSaksPapir runde1 = new StenSaksPapir();
        StenSaksPapir runde2 = new StenSaksPapir();
        StenSaksPapir runde3 = new StenSaksPapir();
        System.out.println(runde1.slaa(a, b));
        System.out.println(runde2.slaa(b, a));
        System.out.println(runde3.slaa(a, a));

        Hand computerHand = null;
        int handInt = (int) (Math.random() * 3 + 1);
        if (handInt == 1) {computerHand = Hand.PAPIR;}
        if (handInt == 2) {computerHand = Hand.STEN;}
        if (handInt == 3) {computerHand = Hand.SAKS;}
        System.out.println("Computeren slår: " + computerHand);

        Scanner scanner = new Scanner(System.in);
        Hand spiller = null;
        String spillerSkriver = scanner.next();
        if (spillerSkriver.equalsIgnoreCase("papir")) {spiller = Hand.PAPIR;}
        if (spillerSkriver.equalsIgnoreCase("sten")) {spiller = Hand.STEN;}
        if (spillerSkriver.equalsIgnoreCase("saks")) {spiller = Hand.SAKS;}
        System.out.println("Spiller slår: " + spiller);

        int resultat = runde1.slaa(computerHand, spiller);

        System.out.println("Resultatet er: " + resultat);
    }
}
