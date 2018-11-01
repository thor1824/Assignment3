/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.rest;

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
public class TextSolverController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private ComboBox<String> comboText;
    @FXML
    private Label lblResult;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        ObservableList<String> options = FXCollections.observableArrayList(
                "Exercise 7",
                "Exercise 8",
                "Exercise 9",
                "Exercise 10",
                "Exercise 11"
        );
        comboText.setItems(options);
    }

    @FXML
    private void format(ActionEvent event) 
    {
        int selectedIndex = comboText.getSelectionModel().getSelectedIndex();
    
        switch(selectedIndex)
        {
            case 0: 
                String aText = tscModel.excerciseVII(name.getText());
                lblResult.setText(aText);
                break;
            case 1:
                String bText = tscModel.excerciseIIX(name.getText());
                lblResult.setText(">"+bText);
                break;
            case 2:
                String cText = tscModel.excerciseIX(name.getText());
                lblResult.setText(">"+cText);
                break;
            case 3:
                int dText = tscModel.excerciseX(name.getText());
                String dTextr = String.valueOf(dText);
                lblResult.setText(">"+dTextr);
                break;
            case 4:
                String eText = tscModel.excerciseXI(name.getText());
                lblResult.setText(">"+eText);
                break;
        }
    }
    TextSolverControllerModel tscModel = new TextSolverControllerModel();
}

