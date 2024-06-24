package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String nom;
    private List<String> types;
    private List<String> noms;
    private List<String> comportements;
    public Zoo(String nom) {
        this.nom = nom;
        this.types = new ArrayList<>();
        this.noms = new ArrayList<>();
        this.comportements = new ArrayList<>();
    }

    public void ajouterAnimal(String nomAnimal, String typeAnimal, String comportement) {
        if (nomAnimal != null && typeAnimal != null && comportement != null) {
            types.add(typeAnimal);
            noms.add(nomAnimal);
            comportements.add(comportement);
        } else {
            System.out.println("Erreur : Tous les arguments doivent être non nuls.");
        }
    }

    public void afficherListeAnimaux() {
        for (int i = 0; i < types.size(); i++) {
            System.out.println(noms.get(i) + " " + types.get(i) + " " + comportements.get(i));
        }
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter for types
     *
     * @return the types
     */
    public List<String> getTypes() {
        return types;
    }

    /**
     * Setter
     *
     * @param types the types to set
     */
    public void setTypes(List<String> types) {
        this.types = types;
    }

    /**
     * Getter for noms
     *
     * @return the noms
     */
    public List<String> getNoms() {
        return noms;
    }

    /**
     * Setter
     *
     * @param noms the noms to set
     */
    public void setNoms(List<String> noms) {
        this.noms = noms;
    }

    /**
     * Getter for comportements
     *
     * @return the comportements
     */
    public List<String> getComportements() {
        return comportements;
    }

    /**
     * Setter
     *
     * @param comportements the comportements to set
     */
    public void setComportements(List<String> comportements) {
        this.comportements = comportements;
    }
}
