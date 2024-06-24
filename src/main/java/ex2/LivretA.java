package ex2;

public class LivretA extends CompteBancaire {

    public LivretA(String type, double solde, double tauxRemuneration) {
        super(TYPE_LA, solde, 0, tauxRemuneration);
    }
}
