package com.example.test__fp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DetailsView implements Initializable {
    @FXML
    private Label brandLabel;

    @FXML
    private ImageView carImageView;

    @FXML
    private Label colorLabel;

    @FXML
    private Label cyclindersLabel;

    @FXML
    private Label performLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private Label typeLable;

    UserData data = UserData.getInstance();

    @FXML
    void onBuyBtn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("credit-card-info.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Details View");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    //used to show the details for the car that the user picked
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //use the data that is stored and access it to print the details
        //use switch statement to show the performance of the certain cars

        brandLabel.setText("Brand: " + data.getUserValue().get("Brand"));
        colorLabel.setText("Color: " + data.getUserValue().get("Color"));
        priceLabel.setText("Price: $" + data.getUserValue().get("Price"));
        typeLable.setText("Type: " + data.getUserValue().get("Type"));
        switch (data.getUserValue().get("Brand")) {
            case "Genesis", "BMW", "Lucid", "Tesla", "Hummer", "Mercedes" ->{
                performLabel.setText("Performance: 2.3 secs");
            }
            case "McLaren", "Lamborghini" ->{
                performLabel.setText("Performance: 2.5 secs");
            }
            case "Ferrari" -> {
                performLabel.setText("Performance: 2.7 secs");
            }
            case "Rolls-Royce" -> {
                performLabel.setText("Performance: 3 secs");
            }
            case "Aston Martin" -> {
                performLabel.setText("Performance: 3.6 secs");
            }
            case "Maserati" -> {
                performLabel.setText("Performance: 3.8 secs");
            }
            case "Lincoln" -> {
                performLabel.setText("Performance: 4.2 secs");
            }

        }
        //used to show the image of the car
        carImageView.setImage(data.getImage());
    }
}
