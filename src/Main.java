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
    }
}
