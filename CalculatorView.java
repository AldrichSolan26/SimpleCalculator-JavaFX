import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup; 
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class CalculatorView {

    private CalculatorController controller;
    private CalculatorModel model;
    private Button Btn0, Btn1, Btn2, Btn3, Btn4, Btn5, Btn6, Btn7, Btn8, Btn9, a_1, a_2, equality, sum, divide, multiply, substract;
    private Label standardLabel, arithmetic, calculation; 
    private HBox row1, row2,row3,row4,row5,row6,row7;
    private VBox topBox, middleBox, view;
    private String xString = new String("");
    private double result=0;

    
    public CalculatorView(CalculatorController controller, CalculatorModel model) {
        this.controller = controller;
        this.model = model;
        createAndLayoutControl();
        createAndConfigurePane();
        updateControllerFromListeners();
        observeModelAndUpdateControl();
    }
    public Parent asParent(){
        return view;
    }
    public void createAndConfigurePane(){

    }
    public void updateControllerFromListeners(){

    }
    public void observeModelAndUpdateControl(){

    }
    public void dealSequenceNumber(String s){
        if ((calculation.textProperty().get()) == "0" && (calculation.textProperty().get().length() == 1)){
                calculation.setText(xString = s);
            } else{
                xString += s;
                calculation.setText(xString);
            }
    }
    public void saveValue(){
        result+=Double.parseDouble(xString);
            arithmetic.setText(String.valueOf(result)+ " +");
            calculation.setText(String.valueOf(result));
            xString ="";

    }

    public void createAndLayoutControl(){

        standardLabel = new Label("Standard");
        arithmetic = new Label("Arithmetic");
        calculation = new Label("0");
        Btn0 = new Button("0"); 

        Btn0.setOnAction(e->{
            dealSequenceNumber(Btn0.textProperty().get());
    });
    
        Btn0.setMinWidth(90);
        Btn0.setMinHeight(30);

        Btn1 = new Button("1");
        Btn1.setOnAction(e->{
            dealSequenceNumber(Btn1.textProperty().get());
    });
        Btn1.setMinWidth(90);
        Btn1.setMinHeight(30);

        Btn2 = new Button("2");
        Btn2.setOnAction(e->{
            dealSequenceNumber(Btn2.textProperty().get());
        });
        Btn2.setMinWidth(90);
        Btn2.setMinHeight(30);

        Btn3 = new Button("3");
        Btn3.setOnAction(e->{
            dealSequenceNumber(Btn3.textProperty().get());
        });
        Btn3.setMinWidth(90);
        Btn3.setMinHeight(30);

        Btn4 = new Button("4");
        Btn4.setOnAction(e->{
            dealSequenceNumber(Btn4.textProperty().get());
        });
        Btn4.setMinWidth(90);
        Btn4.setMinHeight(30);

        Btn5 = new Button("5");
        Btn5.setOnAction(e->{
            dealSequenceNumber(Btn5.textProperty().get());
        });
        Btn5.setMinWidth(90);
        Btn5.setMinHeight(30);

        
        Btn6 = new Button("6");
        Btn6.setOnAction(e->{
            dealSequenceNumber(Btn6.textProperty().get());
        });
        Btn6.setMinWidth(90);
        Btn6.setMinHeight(30);

        Btn7 = new Button("7");
        Btn7.setOnAction(e->{
            dealSequenceNumber(Btn7.textProperty().get());
        });
        Btn7.setMinWidth(90);
        Btn7.setMinHeight(30);

        Btn8 = new Button("8");
        Btn8.setOnAction(e->{
            dealSequenceNumber(Btn8.textProperty().get());
        });
        Btn8.setMinWidth(90);
        Btn8.setMinHeight(30);

        Btn9 = new Button("9");
        Btn9.setOnAction(e->{
            dealSequenceNumber(Btn9.textProperty().get());
        });
        Btn9.setMinWidth(90);
        Btn9.setMinHeight(30);

        sum = new Button("+");
        sum.setOnAction(e->{
            result+=Double.parseDouble(xString);
            arithmetic.setText(String.valueOf(result)+ " +");
            calculation.setText(String.valueOf(result));
            xString ="";
        });

        sum.setMinWidth(90);
        sum.setMinHeight(30);

        equality = new Button("=");
        equality.setMinWidth(90);
        equality.setMinHeight(30);

        divide = new Button("/");
        divide.setOnAction(e->{
            calculation.setText(String.valueOf(result));
            arithmetic.setText(String.valueOf(result)+ " ÷");
            result/=Double.parseDouble(xString);
            
            xString ="";
        }); 
        divide.setMinWidth(90);
        divide.setMinHeight(30);

        multiply = new Button("x");
        
        multiply.setMinWidth(90);
        multiply.setMinHeight(30);

        substract = new Button("-");
        substract.setMinWidth(90);
        substract.setMinHeight(30);

        a_1 = new Button("+/-");
        a_1.setMinWidth(90);
        a_1.setMinHeight(30);

        a_2 = new Button(".");
        a_2.setMinWidth(90);
        a_2.setMinHeight(30);

        row1 = new HBox(5,standardLabel);
        row1.setAlignment(Pos.TOP_LEFT);

        row2 = new HBox(5, arithmetic);
        row2.setAlignment(Pos.TOP_RIGHT);

        row3 = new HBox(5, calculation);
        row3.setAlignment(Pos.TOP_RIGHT);

        row4 = new HBox(5,Btn7,Btn8,Btn9,divide);
        row4.setAlignment(Pos.CENTER);

        row5 = new HBox(5,Btn4, Btn5, Btn6, multiply);
        row5.setAlignment(Pos.CENTER);
        
        row6 = new HBox(5,Btn1,Btn2,Btn3, substract);
        row6.setAlignment(Pos.CENTER);

        row7 = new HBox(5,equality,Btn0,a_2, sum);
        row7.setAlignment(Pos.CENTER);

        topBox = new VBox(5,standardLabel,arithmetic,calculation);
        topBox.setAlignment(Pos.TOP_CENTER);

        middleBox = new VBox(5,row1,row2,row3,row4,row5,row6,row7);
        middleBox.setAlignment(Pos.CENTER);

        view = new VBox(5, topBox, middleBox);
        view.setAlignment(Pos.CENTER);

    }
}
