public class StenSaksPapir {

    int slaa(Hand a, Hand b) {
        int resultat = -1;

        if (a == Hand.STEN) {
            if (b == Hand.STEN)
                resultat = 0;
            else if (b == Hand.SAKS)
                resultat = 1;
            else if (b == Hand.PAPIR)
                resultat = 2;
        }

        if (a == Hand.SAKS) {
            if (b == Hand.STEN)
                resultat = 2;
            else if (b == Hand.SAKS)
                resultat = 0;
            else if (b == Hand.PAPIR)
                resultat = 1;
        }

        if (a == Hand.PAPIR) {
            if (b == Hand.STEN)
                resultat = 1;
            else if (b == Hand.SAKS)
                resultat = 2;
            else if (b == Hand.PAPIR)
                resultat = 0;
        }
        return resultat;
    }
}
