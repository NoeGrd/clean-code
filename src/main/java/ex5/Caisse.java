package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private Taille taille;
    private List<Item> items;

    public Caisse(Taille taille) {
        this.taille = taille;
        this.items = new ArrayList<>();
    }

    public boolean accepteItem(Item item) {
        return item.getPoids() <= taille.getPoidsMax();
    }

    public void ajouterItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
