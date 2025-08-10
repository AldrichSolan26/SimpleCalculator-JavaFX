import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;
public class MVCCalculator extends Application{
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Calculator");
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model);
        CalculatorView view = new CalculatorView(controller,model);

        Scene scene = new Scene(view.asParent(),400,250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
