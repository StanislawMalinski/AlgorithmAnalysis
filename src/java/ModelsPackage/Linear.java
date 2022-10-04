package ModelsPackage;

import PointList;

public class Linear implements Model{
    private double a;
    private double b;

    @Override
    public double apply(double x) {
        return a*x + b;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void setB(double b) {
        this.b = b;
    }

    public void getParameters(PointList list){

    }
}
