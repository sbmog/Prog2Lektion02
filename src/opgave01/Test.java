package opgave01;

import opgave01.model.*;
import opgave01.storage.Storage;

public class Test {
    public static void main(String[] args) {
        Kvadrat kvadrat = new Kvadrat(2, 3, 5);
        Rektangel rektangel = new Rektangel(0, 0, 4, 6);
        Cirkel cirkel = new Cirkel(1, 1, 3);
        Ellipse ellipse = new Ellipse(5, 5, 2, 4);

        Storage.tilføjFigur(kvadrat);
        Storage.tilføjFigur(rektangel);
        Storage.tilføjFigur(cirkel);
        Storage.tilføjFigur(ellipse);

        for (Figur figur : Storage.getFigurer()) {
            System.out.println(figur);
            System.out.println("Areal: " + figur.beregnAreal());
            System.out.println();
        }
    }
}
