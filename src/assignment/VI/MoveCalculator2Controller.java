/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.VI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author thor1
 */
public class MoveCalculator2Controller implements Initializable {

    @FXML
    private TextField d1;
    @FXML
    private TextField x0;
    @FXML
    private TextField v1;
    @FXML
    private TextField d2;
    @FXML
    private TextField y0;
    @FXML
    private TextField v2;
    @FXML
    private Button bCal2;
    @FXML
    private Button switchs;
    @FXML
    private AnchorPane pane2;
    @FXML
    private Label lblX;
    @FXML
    private Label lblY;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    

    @FXML
    private void calClick2(ActionEvent event) 
    {
      double d = Double.parseDouble(d1.getText());
      double v = Double.parseDouble(v1.getText());
      double tempX = Double.parseDouble(x0.getText());
      double tempY = Double.parseDouble(y0.getText());
      double x = mcModel.calPane2x(v, d, tempX);
      double y = mcModel.calPane2y(v, d, tempY);
      String xx = String.valueOf(x);
      String yy = String.valueOf(y);
      lblX.setText(xx);
      lblY.setText(yy);
    }

    @FXML
    private void switchClick(ActionEvent event) throws IOException 
    {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/assignment/VI/MoveCalculater.fxml"));
        pane2.getChildren().setAll(pane);
    }
    MoveCalculatorModel mcModel = new MoveCalculatorModel();
}
