package ModelsPackage;

public class SuperLinear implements Model{
    private double a;
    private double b;

    public SuperLinear() {}

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double apply(double x) {
        return a*Math.log(x)*x + b;
    }
}
