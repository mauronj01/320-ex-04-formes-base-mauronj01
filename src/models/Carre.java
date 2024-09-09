package models;

public class Carre extends Forme {
    private final int cote;

    public Carre(String nom, int cote) {
        super(nom);
        this.cote = cote;
    }

    @Override
    public double calculeSurface() {
        double surface = cote * cote;
        return surface;
    }

}