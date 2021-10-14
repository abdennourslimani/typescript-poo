package Go.StationEssance;

public class StationEssence {
        private double prixEssence ;
        private double getPrixDiesel ;

    public StationEssence() {
    }

    public StationEssence(double prixEssence, double getPrixDiesel) {
        this.prixEssence = prixEssence;
        this.getPrixDiesel = getPrixDiesel;
    }

    public double getPrixEssence() {
        return prixEssence;
    }

    public double getPrixDiesel() {
        return getPrixDiesel;
    }

    @Override
    public String toString() {
        return "StationEssence{" +
                "prixEssence=" + prixEssence +
                ", getPrixDiesel=" + getPrixDiesel +
                '}';
    }
}
