/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.III;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author thor1
 */
public class NumberConversionController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField txtNumberInput;
    
    @FXML
    private Label lblResult;
    
    @FXML
    private Button button;
    
    @FXML
    private Button button1;
    @FXML
    private AnchorPane btnCalculate;
   
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
        System.out.println("You clicked me!");
        double txtFieldValue;
        txtFieldValue = Double.parseDouble(txtNumberInput.getText());
        double resultInMiles = ncmodel.getMilesFromKilometers(txtFieldValue);
        String resultAsString = String.valueOf(resultInMiles);
        lblResult.setText(resultAsString);
    }
    
    @FXML
    private void handleButtonAction1(ActionEvent event)
    {
        System.out.println("You clicked me!");
        double txtFieldValue;
        txtFieldValue = Double.parseDouble(txtNumberInput.getText());
        double resultInKm = ncmodel.getKilometersFromMiles(txtFieldValue);
        String resultAsString = String.valueOf(resultInKm);
        lblResult.setText(resultAsString);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        TextInputDialog dialog = new TextInputDialog("");
        
        dialog.setTitle("text input Dialog");
        dialog.setContentText("please enter your name:");
        
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent())
        {
            String message = ncmodel.getGreetingsMessage(result.get());
            label.setText(message);
        }
        
    }   
    private NumberConversionModel ncmodel = new NumberConversionModel();
}
