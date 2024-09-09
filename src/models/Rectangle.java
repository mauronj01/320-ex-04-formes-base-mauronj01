package models;

public class Rectangle extends Forme {
    private final int largeur;
    private final int hauteur;

    public Rectangle(String nom, int largeur, int hauteur){
        super(nom);
        this.largeur = largeur;
        this.hauteur = hauteur;
    };


    @Override
    public double calculeSurface() {
        int surface = largeur * hauteur;
        return surface;
    }

    
}