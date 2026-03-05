package opgave01.model.opgave01.storage;

import opgave01.model.opgave01.model.Figur;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Figur> figurer = new ArrayList<>();

    public static void tilføjFigur(Figur figur) {
        figurer.add(figur);
    }

    public static ArrayList<Figur> getFigurer() {
        return figurer;
    }
}
