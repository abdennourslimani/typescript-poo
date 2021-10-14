package Go.Vehicule;

import Go.Moteur.Moteur;

public class Voiture extends Vehicule {


    public Voiture() {
        super();
    }

    public Voiture(String marque, String couleur, int prix, Moteur moteur) {
        super(marque, couleur, prix, moteur);
    }


    @Override
    public String toString() {
        return "Voiture{" +
                "moteur=" + moteur +
                '}';
    }
}
