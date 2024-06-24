package ex1;

import java.util.Date;

public class Entreprise {

    public static final int CAPITAL_MAX = 3000000;
    public int siret;
    public String nom;
    public String adresse;
    public Date dateCreation;

    public int getSiret() {
        return siret;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void afficherStatut() {
        System.out.println("Nom de l'entreprise : " + nom);
        System.out.println("Adresse de l'entreprise : " + adresse);
    }

    public boolean depasseCapitalMax(int capital) {
        return capital > CAPITAL_MAX;
    }
}
