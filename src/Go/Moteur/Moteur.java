package Go.Moteur;

public class Moteur {
     private int vitesse  ;
     private int kilometrage ;

    public Moteur() {
    }

    public Moteur(int vitesse, int kilometrage) {
        this.vitesse = vitesse;
        this.kilometrage = kilometrage;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    @Override
    public String toString() {
        return "Moteur{" +
                "vitesse=" + vitesse +
                ", kilometrage=" + kilometrage +
                '}';
    }
}
