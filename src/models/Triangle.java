package models;

public class Triangle extends Forme {
    private final int base;
    private final int hauteur;

    public Triangle(String nom, int base, int hauteur){
        super(nom);
        this.base = base;
        this.hauteur = hauteur;
    };

    @Override
    public double calculeSurface() {
        double surface = (base * hauteur) / 2;
        return surface;
    }
    
}