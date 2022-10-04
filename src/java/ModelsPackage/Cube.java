package ModelsPackage;

public class Cube implements Model{
    private double a;
    private double b;

    @Override
    public double apply(double x) {
        return x*x*x*a + b;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void setB(double b) {
        this.b = b;
    }
}
