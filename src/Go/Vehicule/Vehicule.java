package Go.Vehicule;

import Go.Moteur.Moteur;
import Go.Moteur.MoteurDiesel;
import Go.Moteur.MoteurEssence;
import Go.StationEssance.StationEssence;

public class Vehicule {

    private String marque;
    private String couleur;
    private int prix;
    Moteur moteur;

    public Vehicule() {
    }

    public Vehicule(String marque, String couleur, int prix, Moteur moteur) {
        this.marque = marque;
        this.couleur = couleur;
        this.prix = prix;
        this.moteur = moteur;
    }


    public int getPrix() {
        return prix;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getMarque() {
        return marque;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void klaxonner (){
        System.out.println("je klaxonne . ");

    }

    public void faireLePlein(StationEssence stationEssence ,int nombreLitre,Moteur moteur){
        if(moteur instanceof MoteurDiesel){
            double prixPlein = nombreLitre * stationEssence.getPrixDiesel() ;
            prixPlein = (double) Math.round(prixPlein * 100) / 100 ;
            System.out.println(this.marque +" de moteur diesel a dépensé "+ prixPlein + " € pour faire le plein avec "+ nombreLitre +" litres" );


        }else if (moteur instanceof MoteurEssence){
            double prixPlein = nombreLitre * stationEssence.getPrixEssence() ;
            prixPlein = (double) Math.round(prixPlein * 100) / 100 ;
            System.out.println(this.marque +" de moteur essence a dépensé "+ prixPlein + " € pour faire le plein avec " + nombreLitre + " litres");

        }




    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "marque='" + marque + '\'' +
                ", couleur='" + couleur + '\'' +
                ", prix=" + prix +
                ", moteur=" + moteur +
                '}';
    }


}
