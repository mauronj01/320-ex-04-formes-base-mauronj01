package app;

import java.util.ArrayList;

import models.Carre;
import models.Disque;
import models.Forme;
import models.Rectangle;
import models.Triangle;

public class App {

    public final int MAX_FORME = 8;
    private ArrayList<Forme> lesFormes;

    public static void main(String[] args) {
        App app = new App();
        app.genererFormes();
        app.calculerSurfaces();
    }

    public App() {
        lesFormes = new ArrayList<Forme>();
    }

    public void calculerSurfaces() {
        double laSurfaceTotale = 0.0;

        if (lesFormes != null) {
            for (Forme forme : lesFormes) {
                Forme uneForme = forme;
                if (uneForme != null) {
                    double laSurface = uneForme.calculeSurface();
                    laSurfaceTotale += laSurface;
                    System.out.println("la surface de ce " + "[" + uneForme.getNom() + "] " + "possède une surface de "
                            + "[" + laSurface + "]");
                }
            }
        }
        System.out.println("La surface totale des formes est de " + laSurfaceTotale);
    }

    public void genererFormes() {
        lesFormes.add(new Carre("carre1", 1));
        lesFormes.add(new Rectangle("Rectangle1", 2, 3));
        lesFormes.add(new Triangle("Triangle1", 4, 5));
        lesFormes.add(new Disque("Disque1", 6));
        lesFormes.add(new Carre("carre2", 7));
        lesFormes.add(new Rectangle("Rectangle2", 8, 9));
        lesFormes.add(new Triangle("Triangle2", 10, 11));
        lesFormes.add(new Disque("Disque2", 12));
    }
}