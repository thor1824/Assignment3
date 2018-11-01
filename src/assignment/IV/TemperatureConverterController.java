/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.IV;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author thor1
 */
public class TemperatureConverterController implements Initializable {
    
    @FXML
    private TextField tempInput;
    @FXML
    private Label tempResult;
    @FXML
    private ComboBox<String> comboBox;

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        ObservableList<String> options =  FXCollections.observableArrayList(
        "Celcius to Fahrenheit",
        "Fahrenheit to Celcius");
        comboBox.setItems(options);
    }    

    @FXML
    private void handleSelectComboBox(ActionEvent event) 
    {
        double inputTemp = Double.parseDouble(tempInput.getText());
        double tempValue = 0;
    
        int selectedIndex = comboBox.getSelectionModel().getSelectedIndex();
    
        switch(selectedIndex)
        {
            case 0:
                tempValue = tcmodel.getTemperaturInFahrenheit(inputTemp);
                break;
            case 1:
                tempValue = tcmodel.getFahrenheitInTemperatur(inputTemp);
                break;
            default:
                throw new UnsupportedOperationException("Selected conversion not supported yet");
                
        }
        String resultText = String.valueOf(tempValue);
        tempResult.setText(resultText);
    }
    private TemperaturConverterModel tcmodel = new TemperaturConverterModel();
    
}
