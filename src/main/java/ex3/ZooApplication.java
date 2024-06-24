package ex3;

public class ZooApplication {

    public static void main(String[] args) {

        /**
         * On va instancier un nouveau zoo
         * nom = Thoiry
         */
        Zoo zoo = new Zoo("Thoiry");

        /**
         * On ajoute un animal au zoo avec la méthode ajouterAnimal()
         */
        zoo.ajouterAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
        zoo.ajouterAnimal("Zèbre", "MAMIFERE", "HERBIVORE");
        zoo.ajouterAnimal("Lion", "MAMMIFERE", "HERBIVORE");
        zoo.ajouterAnimal("Panthère", "MAMMIFERE", "CARNIVORE");
        zoo.ajouterAnimal("Requin blanc", "POISSON", "HERBIVORE");
        zoo.ajouterAnimal("Truite dorée", "POISSON", "HERBIVORE");
        zoo.ajouterAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
        zoo.ajouterAnimal("Python", "SERPENT", "CARNIVORE");

        /**
         * Utilisation de la méthode afficherListeAnimaux()
         */
        zoo.afficherListeAnimaux();
    }

}
