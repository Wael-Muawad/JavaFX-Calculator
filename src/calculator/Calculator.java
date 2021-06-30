package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Calculator extends Application {

            TextField rectangle;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bc, plmin, bequal, bplus, bmin, bdot, bx, bdev, bmulti, bce;
    private VBox v1, v2, v3, v4;
    private HBox hbox;
    private GridPane root;
    private EventHandler<ActionEvent> Display;
    private EventHandler<ActionEvent> Operetor;
            String Output;
    @Override
    public void init() {
        Display = e -> OnDisplay(e);
        Operetor = e -> OnOperetor(e);
        
        rectangle = new TextField("0");
        rectangle.setFont(new Font(35));
        rectangle.setPrefSize(320, 65);
        rectangle.addEventHandler(ActionEvent.ACTION, Display);
        
        b1 = new Button("_1");
        b1.setPrefSize(80, 50);
        b1.setFont(new Font(20));
        b1.addEventHandler(ActionEvent.ACTION, Display);

        b2 = new Button("2");
        b2.setPrefSize(80, 50);
        b2.setFont(new Font(20));
        b2.addEventHandler(ActionEvent.ACTION, Display);

        b3 = new Button("3");
        b3.setPrefSize(80, 50);
        b3.setFont(new Font(20));
        b3.addEventHandler(ActionEvent.ACTION, Display);

        b4 = new Button("4");
        b4.setPrefSize(80, 50);
        b4.setFont(new Font(20));
        b4.addEventHandler(ActionEvent.ACTION, Display);
        
        b5 = new Button("5");
        b5.setPrefSize(80, 50);
        b5.setFont(new Font(20));
        b5.addEventHandler(ActionEvent.ACTION, Display);
        
        b6 = new Button("6");
        b6.setPrefSize(80, 50);
        b6.setFont(new Font(20));
        b6.addEventHandler(ActionEvent.ACTION, Display);

        b7 = new Button("7");
        b7.setPrefSize(80, 50);
        b7.setFont(new Font(20));
        b7.addEventHandler(ActionEvent.ACTION, Display);

        b8 = new Button("8");
        b8.setPrefSize(80, 50);
        b8.setFont(new Font(20));
        b8.addEventHandler(ActionEvent.ACTION, Display);

        b9 = new Button("9");
        b9.setPrefSize(80, 50);
        b9.setFont(new Font(20));
        b9.addEventHandler(ActionEvent.ACTION, Display);

        b0 = new Button("0");
        b0.setPrefSize(80, 50);
        b0.setFont(new Font(20));
        b0.addEventHandler(ActionEvent.ACTION, Display);

        bce = new Button("CE");
        bce.setPrefSize(80, 50);
        bce.setFont(new Font(20));

        bc = new Button("C");
        bc.setPrefSize(80, 50);
        bc.setFont(new Font(20));

        bx = new Button("⌫");
        bx.setPrefSize(80, 50);
        bx.setFont(new Font(20));

        bdev = new Button("÷");
        bdev.setPrefSize(80, 50);
        bdev.setFont(new Font(20));
        bdev.addEventHandler(ActionEvent.ACTION, Operetor);

        bmulti = new Button("x");
        bmulti.setPrefSize(80, 50);
        bmulti.setFont(new Font(20));

        bmin = new Button("-");
        bmin.setPrefSize(80, 50);
        bmin.setFont(new Font(20));

        bplus = new Button("+");
        bplus.setPrefSize(80, 50);
        bplus.setFont(new Font(20));

        bequal = new Button("=");
        bequal.setPrefSize(80, 50);
        bequal.setFont(new Font(20));

        bdot = new Button(".");
        bdot.setPrefSize(80, 50);
        bdot.setFont(new Font(20));
        bdot.addEventHandler(ActionEvent.ACTION, Display);

        plmin = new Button("﹢/-");
        plmin.setPrefSize(80, 50);
        plmin.setFont(new Font(20));
        plmin.addEventHandler(ActionEvent.ACTION, Display);

        v1 = new VBox(bce, b7, b4, b1, plmin);
        v2 = new VBox(bc, b8, b5, b2, b0);
        v3 = new VBox(bx, b9, b6, b3, bdot);
        v4 = new VBox(bdev, bmulti, bmin, bplus, bequal);

        hbox = new HBox(v1, v2, v3, v4);
        hbox.setSpacing(2);

        root = new GridPane();
        root.add(rectangle, 0, 0);
        root.add(hbox, 0, 1);
//        root.setGridLinesVisible(true);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(3));

    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(root);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void OnDisplay(ActionEvent e) {
        if (((Button)e.getSource()).getText().equals("﹢/-")) {
            Output = "-"+Output;
        }else
        Output += ((Button)e.getSource()).getText();
        
        rectangle.setText(Output);
    }

    private EventHandler<ActionEvent> OnOperetor(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
