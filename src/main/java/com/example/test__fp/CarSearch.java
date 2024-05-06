package com.example.test__fp;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class CarSearch implements Initializable {
    @FXML
    private ComboBox<String> colorBox;
    @FXML
    private ComboBox<String> priceBox;
    @FXML
    private ComboBox<String> typeBox;
    @FXML
    private ComboBox<String> brandBox;
    @FXML
    private AnchorPane pane;
    @FXML
    private ImageView carImage;

    //store user data
    UserData data = UserData.getInstance();

    @FXML
    protected void searchBtn() {
        String brandName = brandBox.getValue();
        String color = colorBox.getValue();
        String price = priceBox.getValue();
        String type = typeBox.getValue();

        data.setData(brandName, color, price, type);

        //show the image of the car that is found
        //throw an exception if the car is not found
        try {
            findCar(brandName, color, price, type);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    //open new window when button clicked
    @FXML
    protected void onMouseClicked () throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("details-view.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Details View");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    //fill combo box with values
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        brandBox.setItems(FXCollections.observableArrayList("Aston Martin", "BMW", "Ferrari", "Genesis", "Hummer",
                "Lamborghini", "Lincoln", "Lucid", "Maserati", "McLaren", "Mercedes", "Rolls-Royce", "Tesla"));
        colorBox.setItems(FXCollections.observableArrayList("black", "blue", "gold", "gray", "green","orange",
                "red", "white", "yellow"));
        priceBox.setItems(FXCollections.observableArrayList("50,000", "120,000", "150,000", "180,000", "200,000",
                "220,000", "250,000", "300,000", "365,000", "400,000", "500,000"));
        typeBox.setItems(FXCollections.observableArrayList("sedan", "pickup", "SUV", "convertible", "ev"));
    }

    //searches the database to find the car the user selected
    //throws an exception if the car is not found
    public void findCar(String brandName, String color, String price, String type) throws Exception {
        Exception exception = new Exception("Not available in our inventory...Try again!");
        switch (brandName) {
            case "Aston Martin":
                AstonMartin astonMartin = new AstonMartin(brandName, color, price, type);
                HashMap<Integer, String> astonMartinMap = astonMartin.data();

                if (checkInventory(astonMartinMap, color, price)){
                    showImage(brandName, color, type);
                }
                else {
                    throw exception;
                }

                break;

            case "BMW":
                BMW bmw = new BMW(brandName, color, price, type);
                HashMap<Integer, String> bmwMap = bmw.data();
                if (checkInventory(bmwMap, color, price)){
                    showImage(brandName, color, type);
                }
                else {
                    throw exception;
                }

                break;

            case "Ferrari":
                Ferrari ferrari = new Ferrari(brandName, color, price, type);
                HashMap<Integer, String> ferrariMap = ferrari.data();

                if (checkInventory(ferrariMap, color, price)){
                    showImage(brandName, color, type);
                }
                else {
                    throw exception;
                }

                break;

            case "Hummer":
                Hummer hummer = new Hummer(brandName, color, price, type);
                HashMap<Integer, String> hummerMap = hummer.data();

                if (checkInventory(hummerMap, color, price)){
                    showImage(brandName, color, type);
                }
                else {
                    throw exception;
                }

                break;

            case "Genesis":
                Genesis genesis = new Genesis(brandName, color, price, type);
                HashMap<Integer, String> genesisMap = genesis.data();

                if (checkInventory(genesisMap, color, price)){
                    showImage(brandName, color, type);
                }
                else {
                    throw exception;
                }

                break;

            case "Lincoln":
                Lincoln lincoln = new Lincoln(brandName, color, price, type);
                HashMap<Integer, String> lincolnMap = lincoln.data();

                if (checkInventory(lincolnMap, color, price)){
                    showImage(brandName, color, type);
                }
                else {
                    throw exception;
                }

                break;

            case "Lucid":
                Lucid lucid = new Lucid(brandName, color, price, type);
                HashMap<Integer, String> lucidMap = lucid.data();

                if (checkInventory(lucidMap, color, price)){
                    showImage(brandName, color, type);
                }
                else {
                    throw exception;
                }

                break;

            case "Lamborghini":
                Lamborghini lambo = new Lamborghini(brandName, color, price, type);
                HashMap<Integer, String> lamboMap = lambo.data();

                if (checkInventory(lamboMap, color, price)){
                    showImage(brandName, color, type);
                }
                else {
                    throw exception;
                }

                break;

            case "McLaren":
                McLaren mcLaren = new McLaren(brandName, color, price, type);
                HashMap<Integer, String> mcLarenMap = mcLaren.data();

                if (checkInventory(mcLarenMap, color, price)){
                    showImage(brandName, color, type);
                }
                else {
                    throw exception;
                }

                break;

            case "Mercedes":
                MercedesMaybach mercedes = new MercedesMaybach(brandName, color, price, type);
                HashMap<Integer, String> mercedesMap = mercedes.data();

                if (checkInventory(mercedesMap, color, price)){
                    showImage(brandName, color, type);
                }
                else {
                    throw exception;
                }

                break;

            case "Maserati":
                Maserati maserati = new Maserati(brandName, color, price, type);
                HashMap<Integer, String> maseratiMap = maserati.data();

                if (checkInventory(maseratiMap, color, price)){
                    showImage(brandName, color, type);
                }
                else {
                    throw exception;
                }

                break;

            case "Rolls-Royce":
                RollRoyce rollRoyce = new RollRoyce(brandName, color, price, type);
                HashMap<Integer, String> rollsMap = rollRoyce.data();

                if (checkInventory(rollsMap, color, price)){
                    showImage(brandName, color, type);
                }
                else {
                    throw exception;
                }

                break;
            case "Tesla":
                Tesla tesla = new Tesla(brandName, color, price, type);
                HashMap<Integer, String> teslaMap = tesla.data();

                if (checkInventory(teslaMap, color, price)){
                    showImage(brandName, color, type);
                }
                else {
                    throw exception;
                }
                break;
        }
    }

    //method used to check if the car is available
    //checks the color and price of the car within the database
    public static boolean checkInventory(HashMap<Integer, String> car, String color, String price) {

        for (int i = 0; i < car.size(); i++) {
            if (car.containsValue(color) &&
                    car.containsValue(price)) {
                return true;
            }
            else if (car.containsValue(price)){
                return true;
            }
        }
        return false;
    }


    //shows the image of the car
    //checks the brand and uses switch statement to determine which image to use
    public void showImage (String brandName, String color, String type){
        switch (brandName){
            case "Aston Martin":
                if (type.equals("convertible")) {
                    if (color.equals("red")){
                        Image car = new Image(new File("src/cars/RedAstonConvertible.jpg").toURI().toString());
                        carImage.setImage(car);
                    }
                    else if (color.equals("black")){
                        Image car = new Image(new File("src/cars/BlkAstonConvertible.jpg").toURI().toString());
                        carImage.setImage(car);
                    }
                }
                else if (type.equals("sedan")){
                    if (color.equals("blue")){
                        Image car = new Image(new File("src/cars/BluAston.jpg").toURI().toString());
                        carImage.setImage(car);
                    }
                    else if (color.equals("green")){
                        Image car = new Image(new File("src/cars/GreenAston.jpg").toURI().toString());
                        carImage.setImage(car);
                    }
                }
                break;
            case "BMW":
                if (type.equals("ev")){
                    if (color.equals("gold")){
                        Image car = new Image(new File("src/cars/GoldBMWev.png").toURI().toString());
                        carImage.setImage(car);
                    }
                }
                break;
            case "Ferrari":
                if (type.equals("convertible")){
                    if (color.equals("black")){
                        Image car = new Image(new File("src/cars/BlkFerrariConvertible.jpg").toURI().toString());
                        carImage.setImage(car);
                    }
                    else if (color.equals("blue")){
                        Image car = new Image(new File("src/cars/BluFerrariConvertible.jpg").toURI().toString());
                        carImage.setImage(car);
                    }
                }
                else if (type.equals("sedan")){
                    switch (color) {
                        case "red" -> {
                            Image car = new Image(new File("src/cars/RedFerrari.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                        case "white" -> {
                            Image car = new Image(new File("src/cars/WhiteFerrari.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                        case "yellow" -> {
                            Image car = new Image(new File("src/cars/YellowFerrari.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                    }
                }
                break;
            case "Hummer":
                if (type.equals("ev") || type.equals("SUV")){
                    if (color.equals("blue")){
                        Image car = new Image(new File("src/cars/BlueHummerSUVev.png").toURI().toString());
                        carImage.setImage(car);
                    }
                    else if (color.equals("white")){
                        Image car = new Image(new File("src/cars/WhiteHummerSUVev.png").toURI().toString());
                        carImage.setImage(car);
                    }

                }
                else if (type.equals("pickup")) {
                    switch (color) {
                        case "gray" -> {
                            Image car = new Image(new File("src/cars/WhiteHummerSUVev.png").toURI().toString());
                            carImage.setImage(car);
                        }
                        case "orange" -> {
                            Image car = new Image(new File("src/cars/OrangeHummerPickupEV.png").toURI().toString());
                            carImage.setImage(car);
                        }
                        case "white" -> {
                            Image car = new Image(new File("src/cars/WhiteHummerPickupEV.png").toURI().toString());
                            carImage.setImage(car);
                        }
                    }
                }
                break;
            case "Genesis":
                if (type.equals("ev") || type.equals("convertible")){
                    if (color.equals("white")){
                        Image car = new Image(new File("src/cars/WhiteGenesisConvertibleEV.png").toURI().toString());
                        carImage.setImage(car);
                    }
                }
                break;
            case "Lincoln":
                if (type.equals("SUV")){
                    if (color.equals("black")){
                        Image car = new Image(new File("src/cars/BlkLincolnSUV.png").toURI().toString());
                        carImage.setImage(car);
                    }
                    else if (color.equals("gray")){
                        Image car = new Image(new File("src/cars/GrayLincolnSUV.png").toURI().toString());
                        carImage.setImage(car);
                    }
                }
                break;
            case "Lucid":
                if (type.equals("ev")){
                    if (color.equals("blue")){
                        Image car = new Image(new File("src/cars/BlueLucidEv.png").toURI().toString());
                        carImage.setImage(car);
                    }
                    else if (color.equals("red")){
                        Image car = new Image(new File("src/cars/RedLucidEv.png").toURI().toString());
                        carImage.setImage(car);
                    }
                    else if (color.equals("white")){
                        Image car = new Image(new File("src/cars/WhiteLucidEv.png").toURI().toString());
                        carImage.setImage(car);
                    }
                }
                break;
            case "Lamborghini":
                if (type.equals("sedan")){
                    switch (color) {
                        case "white" -> {
                            Image car = new Image(new File("src/cars/WhiteLambo.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                        case "yellow" -> {
                            Image car = new Image(new File("src/cars/YellowLambo.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                        case "green" -> {
                            Image car = new Image(new File("src/cars/GreenLambo.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                        case "black" -> {
                            Image car = new Image(new File("src/cars/BlkLambo.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                    }
                }
                else if (type.equals("convertible")){
                    if (color.equals("blue")){
                        Image car = new Image(new File("src/cars/BluLamboConvertible.jpg").toURI().toString());
                        carImage.setImage(car);
                    }
                    else if (color.equals("black")){
                        Image car = new Image(new File("src/cars/BlkLamboConvertible.jpg").toURI().toString());
                        carImage.setImage(car);
                    }
                }
                break;
            case "McLaren":
                if (type.equals("sedan")){
                    switch (color) {
                        case "black" -> {
                            Image car = new Image(new File("src/cars/BlkMcLaren.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                        case "blue" -> {
                            Image car = new Image(new File("src/cars/BluMcLaren.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                        case "green" -> {
                            Image car = new Image(new File("src/cars/GreenMcLaren.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                        case "red" -> {
                            Image car = new Image(new File("src/cars/RedMcLaren.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                        case "yellow" -> {
                            Image car = new Image(new File("src/cars/YellowMcLaren.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                    }
                }
                else if (type.equals("convertible")){
                    if (color.equals("orange")){
                        Image car = new Image(new File("src/cars/OranMcLarConvertible.jpg").toURI().toString());
                        carImage.setImage(car);
                    }
                }
                break;
            case "Mercedes":
                if (type.equals("ev")){
                    if (color.equals("red")){
                        Image car = new Image(new File("src/cars/RedMercedesMaybachEV.png").toURI().toString());
                        carImage.setImage(car);
                    }
                }
                break;
            case "Maserati":
                if (type.equals("sedan")){
                    switch (color) {
                        case "black" -> {
                            Image car = new Image(new File("src/cars/BlkMaserati.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                        case "blue" -> {
                            Image car = new Image(new File("src/cars/BluMaserati.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                        case "red" -> {
                            Image car = new Image(new File("src/cars/RedMaserati.jpg").toURI().toString());
                            carImage.setImage(car);
                        }
                    }
                }
                else if (type.equals("convertible")){
                    if (color.equals("white")){
                        Image car = new Image(new File("src/cars/WhiteMaserConvertible.jpg").toURI().toString());
                        carImage.setImage(car);
                    }
                }
                break;
            case "Rolls-Royce":
                if (type.equals("ev")){
                    if (color.equals("gold")){
                        Image car = new Image(new File("src/cars/GoldRollsRoyceEV.png").toURI().toString());
                        carImage.setImage(car);
                    }
                }

                break;
            case "Tesla":
                if (type.equals("ev")){
                    if (color.equals("gray")){
                        Image car = new Image(new File("src/cars/GrayCyberTruckEV.png").toURI().toString());
                        carImage.setImage(car);
                    }
                }
                break;
        }

    }


    //abstract class to be inherited
    abstract class ExoticCars {
        private String brandName, color, convertible;
        private String priceRange;

        ExoticCars(String brandName, String color, String priceRange, String convertible) {
            this.brandName = brandName;
            this.color = color;
            this.priceRange = priceRange;
            this.convertible = convertible;
        }

        public String getBrandName() {
            return brandName;
        }

        public String getColor() {
            return color;
        }

        public String getConvertible() {
            return convertible;
        }

        public String getPriceRange() {
            return priceRange;
        }

        abstract HashMap<Integer, String> data();
    }

    class Tesla extends ExoticCars {
        Tesla(String brandName, String color, String priceRange, String convertible) {
            super(brandName, color, priceRange, convertible);
        }

        @Override
        HashMap<Integer, String> data() {
            HashMap<Integer, String> teslaData = new HashMap<>();

            teslaData.put(1, "gray");
            teslaData.put(2, "ev");
            teslaData.put(4, "50,000");

            return teslaData;
        }
    }

    class Lincoln extends ExoticCars {
        Lincoln(String brandName, String color, String priceRange, String convertible) {
            super(brandName, color, priceRange, convertible);
        }

        @Override
        HashMap<Integer, String> data() {
            HashMap<Integer, String> lincolnData = new HashMap<>();

            lincolnData.put(1, "120,000");
            lincolnData.put(2, "black");
            lincolnData.put(3, "gray");
            lincolnData.put(5, "SUV");
            lincolnData.put(6, "ev");

            return lincolnData;
        }
    }

    class Lucid extends ExoticCars {
        Lucid(String brandName, String color, String priceRange, String convertible) {
            super(brandName, color, priceRange, convertible);
        }

        @Override
        HashMap<Integer, String> data() {
            HashMap<Integer, String> lucidData = new HashMap<>();

            lucidData.put(1, "150,000");
            lucidData.put(2, "white");
            lucidData.put(3, "blue");
            lucidData.put(4, "red");
            lucidData.put(5, "ev");

            return lucidData;
        }
    }

    class Hummer extends ExoticCars {
        Hummer(String brandName, String color, String priceRange, String convertible) {
            super(brandName, color, priceRange, convertible);
        }

        @Override
        HashMap<Integer, String> data() {
            HashMap<Integer, String> hummerData = new HashMap<>();

            hummerData.put(1, "180,000");
            hummerData.put(2, "white");
            hummerData.put(3, "blue");
            hummerData.put(4, "gray");
            hummerData.put(5, "orange");
            hummerData.put(6, "SUV");
            hummerData.put(7, "ev");
            hummerData.put(8, "pick-up");

            return hummerData;
        }
    }

    class Maserati extends ExoticCars {
        Maserati(String brandName, String color, String priceRange, String convertible) {
            super(brandName, color, priceRange, convertible);
        }

        @Override
        HashMap<Integer, String> data() {
            HashMap<Integer, String> maseratiData = new HashMap<>();

            maseratiData.put(1, "200,000");
            maseratiData.put(2, "white");
            maseratiData.put(3, "black");
            maseratiData.put(4, "blue");
            maseratiData.put(5, "red");

            return maseratiData;
        }
    }

    class AstonMartin extends ExoticCars {
        AstonMartin(String brandName, String color, String priceRange, String convertible) {
            super(brandName, color, priceRange, convertible);
        }

        @Override
        HashMap<Integer, String> data() {
            HashMap<Integer, String> astonMartinData = new HashMap<>();

            astonMartinData.put(1, "red");
            astonMartinData.put(2, "blue");
            astonMartinData.put(3, "200,000");
            astonMartinData.put(6, "black");
            astonMartinData.put(7, "green");

            return astonMartinData;
        }
    }

    class BMW extends ExoticCars {
        BMW(String brandName, String color, String priceRange, String convertible) {
            super(brandName, color, priceRange, convertible);
        }

        @Override
        HashMap<Integer, String> data() {
            HashMap<Integer, String> bmwData = new HashMap<>();

            bmwData.put(1, "250,000");
            bmwData.put(2, "gold");
            bmwData.put(3, "ev");

            return bmwData;
        }
    }

    class Genesis extends ExoticCars {

        Genesis(String brandName, String color, String priceRange, String convertible) {
            super(brandName, color, priceRange, convertible);
        }

        @Override
        HashMap<Integer, String> data() {
            HashMap<Integer, String> genesisData = new HashMap<>();

            genesisData.put(1, "300,000");
            genesisData.put(2, "white");
            genesisData.put(3, "ev");

            return genesisData;
        }
    }

    class Ferrari extends ExoticCars {

        Ferrari(String brandName, String color, String priceRange, String convertible) {
            super(brandName, color, priceRange, convertible);
        }

        @Override
        HashMap<Integer, String> data() {
            HashMap<Integer, String> ferrariData = new HashMap<>();

            ferrariData.put(1, "300,000");
            ferrariData.put(2, "white");
            ferrariData.put(3, "yellow");
            ferrariData.put(4, "blue");
            ferrariData.put(5, "red");
            ferrariData.put(6, "black");

            return ferrariData;
        }
    }

    class McLaren extends ExoticCars {

        McLaren(String brandName, String color, String priceRange, String convertible) {
            super(brandName, color, priceRange, convertible);
        }

        @Override
        HashMap<Integer, String> data() {
            HashMap<Integer, String> mclarenData = new HashMap<>();

            mclarenData.put(1, "365,000");
            mclarenData.put(2, "yellow");
            mclarenData.put(3, "black");
            mclarenData.put(4, "blue");
            mclarenData.put(5, "green");
            mclarenData.put(6, "orange");
            mclarenData.put(7, "red");

            return mclarenData;
        }
    }

    class Lamborghini extends ExoticCars {

        Lamborghini(String brandName, String color, String priceRange, String convertible) {
            super(brandName, color, priceRange, convertible);
        }

        @Override
        HashMap<Integer, String> data() {
            HashMap<Integer, String> lamboData = new HashMap<>();

            lamboData.put(1, "400,000");
            lamboData.put(2, "white");
            lamboData.put(3, "yellow");
            lamboData.put(4, "black");
            lamboData.put(5, "blue");
            lamboData.put(6, "green");

            return lamboData;
        }
    }

    class MercedesMaybach extends ExoticCars {

        MercedesMaybach(String brandName, String color, String priceRange, String convertible) {
            super(brandName, color, priceRange, convertible);
        }

        @Override
        HashMap<Integer, String> data() {
            HashMap<Integer, String> mercedesData = new HashMap<>();

            mercedesData.put(1, "400,000");
            mercedesData.put(2, "red");
            mercedesData.put(3, "ev");

            return mercedesData;
        }
    }

    class RollRoyce extends ExoticCars {

        RollRoyce(String brandName, String color, String priceRange, String convertible) {
            super(brandName, color, priceRange, convertible);
        }

        @Override
        HashMap<Integer, String> data() {
            HashMap<Integer, String> rollsRoyceData = new HashMap<>();

            rollsRoyceData.put(1, "500,000");
            rollsRoyceData.put(2, "gold");
            rollsRoyceData.put(3, "ev");

            return rollsRoyceData;
        }
    }
}
