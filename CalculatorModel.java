import javafx.beans.property.*;
public class CalculatorModel{

    private final SimpleDoubleProperty result = new SimpleDoubleProperty();
    public CalculatorModel(){

    }

    public final SimpleDoubleProperty resultProperty(){
        return this.result;
    }
    public final double getResult(){
        return resultProperty().get();
    }
    public final void setResult(final double result){
        this.resultProperty().set(result);
    }
}


