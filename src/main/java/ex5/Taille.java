package ex5;

public enum Taille {
    PETIT(5),
    MOYEN(20),
    GRAND(Integer.MAX_VALUE); // Capacité maximale non spécifiée

    private int poidsMax;

    Taille(int poidsMax) {
        this.poidsMax = poidsMax;
    }

    public int getPoidsMax() {
        return poidsMax;
    }
}
