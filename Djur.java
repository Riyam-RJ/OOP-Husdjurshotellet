package Animal;

public class Djur implements Portion{

    private double vikt;
    private String namn;
    private String djurRas;
    private double foderDivision;

    public Djur(double vikt, String namn, String djurRas) {
        this.vikt = vikt;
        this.namn = namn;
        this.djurRas = djurRas;
    }
    public Djur(double vikt, String namn, String djurRas, double foderDivision) {
        this.vikt = vikt;
        this.namn = namn;
        this.djurRas = djurRas;
        this.foderDivision = foderDivision;
    }

    @Override
    public double getPortion() {
        return vikt/foderDivision;
    }

    @Override
    public String toString() {
        return "Djur = " + djurRas +
                ", vikt = " + vikt +
                ", namn = " + namn +
                ", portion = " + getPortion();
    }


}
