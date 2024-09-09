package models;

public class Disque extends Forme {
    private final int rayon;

    public Disque(String nom, int rayon){
        super(nom);
        this.rayon = rayon;

    };

    @Override
    public double calculeSurface() {
        double surface = Math.PI * (rayon * rayon);
        return surface;
    }
    
}