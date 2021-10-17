package Animal;

public class Orm extends Djur{

    public Orm(double vikt, String namn, String djurRas) {
        super(vikt, namn, djurRas);
    }

    public double getPortion(){
        return 20;
    }
}
