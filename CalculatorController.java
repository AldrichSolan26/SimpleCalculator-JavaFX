public class CalculatorController {
    public final CalculatorModel model;

    public CalculatorController(CalculatorModel model){
        this.model = model;
    }
    public void updateResult(String result){
        model.setResult(convertStringToDouble(result));
    }
    public double convertStringToDouble(String s){
        if (s == null|| s.isEmpty()){
            return 0;}
        if ("-".equals(s)){
            return 0;
        }
        return Double.parseDouble(s);
    }
}
