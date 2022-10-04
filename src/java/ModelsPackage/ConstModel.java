package ModelsPackage;

public class ConstModel implements Model{
    private double a = 0;
    private double b = 0;

    public ConstModel(){}

    @Override
    public void setA(double a){
        this.a = a;
    }

    @Override
    public void setB(double b) {
        ;
    }

    @Override
    public double apply(double x) {
        return a;
    }
}
