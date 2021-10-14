package Go;

import Go.Moteur.MoteurDiesel;
import Go.StationEssance.StationEssence;
import Go.Vehicule.Vehicule;
import Go.Vehicule.Voiture;

public class Main {
    public static void main(String args[]){

        MoteurDiesel moteurDiesel =new MoteurDiesel(120,120000) ;

        Voiture voiture = new Voiture("Mercedes","Blanc neige",30000,moteurDiesel) ;

        StationEssence stationEssence = new StationEssence(2.3,1.8);
        voiture.faireLePlein(stationEssence,42,moteurDiesel);


    }



}
