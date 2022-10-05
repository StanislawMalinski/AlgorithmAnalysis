package StatisticalAnalysier;

public class Result {
    private int counter;
    private PointList table;


    public Result(){
        table = new PointList();
    }

    public Result(int counter) {
        table = new PointList();
    }

    public int getCounter(){
        return counter;
    }

    public void addPoint(int n, int counter) {
        Point point = new Point();
        point.x = n;
        point.y = counter;
        table.addPoint(point);
    }
}
