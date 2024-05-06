package com.example.test__fp;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreditCardInfo implements Initializable {
    @FXML
    private TextField cardNumTxt;

    @FXML
    private TextField cvvNumTxt;

    @FXML
    private TextField fNameTxt;

    @FXML
    private TextField lNameTxt;

    @FXML
    private ComboBox<String> monthCombo;

    @FXML
    private ComboBox<String> yearCombo;
    UserData data = UserData.getInstance();

    //button pressed and caused for a new window to open with the receipt
    @FXML
    void onOkBtn(ActionEvent event) throws IOException {
        data.setUserName(fNameTxt.getText(), lNameTxt.getText());

        //if statement checks validation of information
        try {
            if (checkInfo(fNameTxt.getText(), lNameTxt.getText(), cardNumTxt.getText(), cvvNumTxt.getText())){
                Parent root = FXMLLoader.load(getClass().getResource("receipt-view.fxml"));
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setTitle("Receipt View");
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.show();
            }
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

    }

    //fills combo box with values
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        monthCombo.setItems(FXCollections.observableArrayList("01","02","03","04","05","06",
                "07","08","09","10","11","12"));
        yearCombo.setItems(FXCollections.observableArrayList("2023","2024","2025","2026","2027"));
    }

    public boolean checkInfo (String fName, String lName, String cardNum, String cvv){
        //loops through the names and checks to see if each input is a letter
        //throws an exception if not a letter

        for (int i = 0; i < fName.length(); i++){
            if (!Character.isLetter(fName.charAt(i))){
                throw new IllegalArgumentException("Name must contain letters...");
            }
        }
        for (int i = 0; i < lName.length(); i++){
            if (!Character.isLetter(lName.charAt(i))){
                throw new IllegalArgumentException("Name must contain letters...");
            }
        }

        //loops through the card numbers to check if input is numbers and if it is 16 digits long
        //throws an exception
        for (int i = 0; i < cardNum.length(); i++){
            if (!Character.isDigit(cardNum.charAt(i)) || cardNumTxt.getText().length() != 16){
                throw new IllegalArgumentException("Invalid card number...Try again");
            }
        }
        for (int i = 0; i < cvv.length(); i++){
            if (!Character.isDigit(cvv.charAt(i))){
                throw new IllegalArgumentException("CVV must only contain numbers...");
            }
        }

        return true;
    }
}