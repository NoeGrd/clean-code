package ex1;

import java.util.Date;

public class Entreprise {

    public static final int CAPITAL_MAX = 3000000;
    public long siret;
    public String nom;
    public String adresse;
    public Date dateCreation;

    public void afficherStatut() {

        System.out.println("Nom de l'entreprise : " + nom);
        System.out.println("Adresse de l'entreprise : " + adresse);
    }
}
