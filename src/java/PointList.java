import java.util.List;

public class PointList{
    private Point [] table;
    private int size;
    private int N;

    public PointList() {
        table = new Point[2];
        size = 2;
    }

    public void addPoint(Point p){
        if(size <= N) doubleUp();
        table[N++] = p;
    }

    public Point getPoint(int index){
        if(index < 0 || index > N) throw new IndexOutOfBoundsException(index + " is out of boundary " + N);
        return table[index];
    }

    private void doubleUp(){
        Point [] nTable = new Point[size*2];
        System.arraycopy(table,0,nTable,0,size);
        table = nTable;
        size = size*2;
    }
}
