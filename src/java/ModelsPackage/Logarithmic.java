package ModelsPackage;

public class Logarithmic implements Model{
    private double a;
    private double b;

    public Logarithmic(){}

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double apply(double x) {
        return a*Math.log(x) + b;
    }
}
