/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.V;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author thor1
 */
public class BMI_ConverterController implements Initializable {

    @FXML
    private TextField lblResult;
    @FXML
    private Button b1;
    @FXML
    private TextField txtInputkg;
    @FXML
    private TextField txtInputcm;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    

    @FXML
    private void calculate(ActionEvent event) 
    {
        double inputKG = Double.parseDouble(txtInputkg.getText());
        double inputCM = Double.parseDouble(txtInputcm.getText());
        double bmi = bmimodel.bmi(inputKG, inputCM);
        String result = String.valueOf(bmi);
        lblResult.setText(result);
    }
    BMI_ConverterModel bmimodel = new BMI_ConverterModel();
}
