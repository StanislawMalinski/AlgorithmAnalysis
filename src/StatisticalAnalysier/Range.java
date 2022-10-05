package StatisticalAnalysier;

import java.util.Iterator;

public class Range {
    private double start = 0;
    private double end = 100;
    private int step = 10;

    public Range(){
    }

    public Range(double start, double end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public Iterator<Integer> Iterator(){
        Iterator<Integer> iter = new Iterator<Integer>() {
            private int iter = 0;

            @Override
            public boolean hasNext() {
                return iter < step;
            }

            @Override
            public Integer next() {
                double result = start + ((end - start)/step)*iter;
                iter++;
                return Math.round(Math.round(result));
            }
        };
        return iter;
    }
}
