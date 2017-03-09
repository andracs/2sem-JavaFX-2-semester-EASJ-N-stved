/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxchallenge_1;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author andrasacs
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Label textfield;
    
    @FXML
    private Button button;
    
    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        
          ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
          list.add("Feed me and I live, yet give me a drink and I die.");//Adding object in arraylist  
          list.add("What always ends everything?");  
          list.add("The more you take, the more you leave behind.");  
          list.add("I have holes, yet I am full of water. What am I?");  
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(list.size());
        String sentence = list.get(randomInt);
        System.out.println(sentence);
        textfield.setText(sentence);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
