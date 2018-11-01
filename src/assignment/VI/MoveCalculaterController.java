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
public class MoveCalculaterController implements Initializable {

    @FXML
    private TextField x1;
    @FXML
    private TextField y1;
    @FXML
    private Label lblResult;
    @FXML
    private TextField x2;
    @FXML
    private TextField y2;
    @FXML
    private Button cb;
    @FXML
    private Button switchs;
    @FXML
    private AnchorPane pane1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    

    @FXML
    private void calculateClick(ActionEvent event) 
    {
        double dx1 = Double.parseDouble(x1.getText());
        double dy1 = Double.parseDouble(y1.getText());
        double dx2 = Double.parseDouble(x2.getText());
        double dy2 = Double.parseDouble(y2.getText());
        double d = mcModel.calPane1(dx1, dx2, dy1, dy2);
        String dd = String.valueOf(d);
        lblResult.setText(dd);
        
    }

    @FXML
    private void switchClick(ActionEvent event) throws IOException 
    {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/assignment/VI/MoveCalculator2.fxml"));
        pane1.getChildren().setAll(pane);
    }
    MoveCalculatorModel mcModel = new MoveCalculatorModel();
}
