public class Point{
    public double x;
    public double y;

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Point)) return false;
        Point p = (Point) o;
        return (p.x == this.x) && (p.y == this.y);
    }
}
