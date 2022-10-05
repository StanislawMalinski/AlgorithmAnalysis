import StatisticalAnalysier.Input;
import StatisticalAnalysier.InputGenerator;
import StatisticalAnalysier.Result;
import StatisticalAnalysier.Setting;
import java.security.InvalidParameterException;
import java.util.Iterator;

public abstract class Algorithm {
    private Input input;
    private InputGenerator generator;
    private Setting setting;

    private final int defuelN = 1000;

    private int Counter;

    protected Algorithm(Input input){
        this.input = input;
        Counter = 0;
    }

    protected Algorithm(InputGenerator generator){
        this.generator = generator;
        Counter = 0;
    }

    protected void setSetting(Setting setting){
    }

    protected Result performAnalysis(){
        if(setting == null){
            if(input == null)
                input = generator.nextInput(defuelN);
        }
        AnalysedAlgorithm(input);
        return new Result(Counter);
    }

    protected Result performStatisticalAnalysis(){
        if(generator == null) throw new InvalidParameterException("In order to performe Statistical Analysis, please add" +
                "java.StatisticalAnalysier.Input Generator.");
        Iterator<Integer> iter = setting.getRange().Iterator();
        Input input = null;
        Result result = new Result(0);
        int N;
        while(iter.hasNext()){
            N = iter.next();
            input = generator.nextInput(N);
            AnalysedAlgorithm(input);
            result.addPoint(N, Counter);
        }
        return new Result(2);
    }

    public abstract void AnalysedAlgorithm(Input input);

    protected void countKeyOperation(){
        Counter++;
    }

}
