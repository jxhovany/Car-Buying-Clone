package com.example.test__fp;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ReceiptView implements Initializable {
    UserData data = UserData.getInstance();


    @FXML
    private Label brandLabel;

    @FXML
    private Label colorLabel;

    @FXML
    private Label priceLabel1;

    @FXML
    private Label typeLabel;

    @FXML
    private Label fNameLabel;

    @FXML
    private Label lNameLabel;


    //shows the receipt with users name, brand of car, color, type, and price
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fNameLabel.setText(data.getUserValue().get("FirstName"));
        lNameLabel.setText(data.getUserValue().get("LastName"));
        brandLabel.setText("Brand: " + data.getUserValue().get("Brand"));
        colorLabel.setText("Color: " + data.getUserValue().get("Color"));
        typeLabel.setText("Type: " + data.getUserValue().get("Type"));
        priceLabel1.setText("$" + data.getUserValue().get("Price"));
    }
}
