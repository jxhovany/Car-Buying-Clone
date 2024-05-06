package com.example.test__fp;

import javafx.scene.image.Image;

import java.io.File;
import java.util.HashMap;

public class UserData {
    private static final UserData instance = new UserData();
    private final HashMap<String, String> userValue = new HashMap<>();
    private UserData(){
    }
    public static UserData getInstance (){
        return instance;
    }
    public HashMap<String, String> getUserValue() {
        return userValue;
    }

    //set the data to the specific input in the map
    //brand, color, price, type
    public void setData(String brand, String color, String price, String type){
        userValue.put("Brand", brand);
        userValue.put("Color", color);
        userValue.put("Price", price);
        userValue.put("Type", type);
    }

    //used to store the users name
    public void setUserName (String fName, String lName){
        userValue.put("FirstName", fName);
        userValue.put("LastName", lName);
    }

    //used to get the image of a specific car
    public Image getImage () {
        //if statements used to determine which car image to display
        //returns null if the image is not found
        if (getUserValue().containsValue("Aston Martin")){
            if (getUserValue().containsValue("red")){
                return new Image(new File("src/cars/RedAstonConvertible.jpg").toURI().toString());
            }
            else if (getUserValue().containsValue("black")){
                return new Image(new File("src/cars/BlkAstonConvertible.jpg").toURI().toString());
            }
            else if (userValue.containsValue(("blue"))){
                return new Image(new File("src/cars/BluAston.jpg").toURI().toString());
            }
            else if (userValue.containsValue(("green"))){
                return new Image(new File("src/cars/GreenAston.jpg").toURI().toString());
            }
        }
        else if (userValue.containsValue("BMW")){
            if (getUserValue().containsValue("gold")){
                return new Image(new File("src/cars/GoldBMWev.png").toURI().toString());
            }
        }
        else if (userValue.containsValue("Ferrari")){
            if (getUserValue().containsValue("red")){
                return new Image(new File("src/cars/RedFerrari.jpg").toURI().toString());
            }
            else if (getUserValue().containsValue("black")){
                return new Image(new File("src/cars/BlkFerrariConvertible.jpg").toURI().toString());
            }
            else if (userValue.containsValue(("blue"))){
                return new Image(new File("src/cars/BluFerrariConvertible.jpg").toURI().toString());
            }
            else if (userValue.containsValue(("yellow"))){
                return new Image(new File("src/cars/YellowFerrari.jpg").toURI().toString());
            }
            else if (userValue.containsValue(("white"))){
                return new Image(new File("src/cars/WhiteFerrari.jpg").toURI().toString());
            }
        }
        else if (userValue.containsValue("Hummer")){
            if (getUserValue().containsValue("blue")){
                return new Image(new File("src/cars/BlueHummerSUVev.png").toURI().toString());
            }
            else if (getUserValue().containsValue("white") && userValue.containsValue("SUV") || userValue.containsValue("ev")){
                return new Image(new File("src/cars/WhiteHummerSUVev.png").toURI().toString());
            }
            else if (userValue.containsValue(("gray"))){
                return new Image(new File("src/cars/WhiteHummerSUVev.png").toURI().toString());
            }
            else if (userValue.containsValue(("orange"))){
                return new Image(new File("src/cars/OrangeHummerPickupEV.png").toURI().toString());
            }
            else if (userValue.containsValue("white") && userValue.containsValue("pickup")){
                return new Image(new File("src/cars/WhiteHummerPickupEV.png").toURI().toString());
            }
        }
        else if (userValue.containsValue("Genesis")){
            if (getUserValue().containsValue("white")){
                return new Image(new File("src/cars/WhiteGenesisConvertibleEV.png").toURI().toString());
            }
        }
        else if (userValue.containsValue("Lincoln")){
            if (getUserValue().containsValue("black")){
                return new Image(new File("src/cars/BlkLincolnSUV.png").toURI().toString());
            }
            else if (getUserValue().containsValue("gray")){
                return new Image(new File("src/cars/GrayLincolnSUV.png").toURI().toString());
            }
        }
        else if (userValue.containsValue("Lucid")){
            if (getUserValue().containsValue("blue")){
                return new Image(new File("src/cars/BlueLucidEv.png").toURI().toString());
            }
            else if (getUserValue().containsValue("red")){
                return new Image(new File("src/cars/RedLucidEv.png").toURI().toString());
            }
            else if (userValue.containsValue(("white"))){
                return new Image(new File("src/cars/WhiteLucidEv.png").toURI().toString());
            }
        }
        else if (userValue.containsValue("Lamborghini")){
            if (getUserValue().containsValue("white")){
                return new Image(new File("src/cars/WhiteLambo.jpg").toURI().toString());
            }
            else if (getUserValue().containsValue("yellow")){
                return new Image(new File("src/cars/YellowLambo.jpg").toURI().toString());
            }
            else if (userValue.containsValue(("green"))){
                return new Image(new File("src/cars/GreenLambo.jpg").toURI().toString());
            }
            else if (userValue.containsValue(("black"))){
                return new Image(new File("src/cars/BlkLambo.jpg").toURI().toString());

            }
            else if (userValue.containsValue(("blue"))){
                return new Image(new File("src/cars/BluLamboConvertible.jpg").toURI().toString());

            }
            else if (userValue.containsValue(("black")) && userValue.containsValue("convertible")){
                return new Image(new File("src/cars/BlkLamboConvertible.jpg").toURI().toString());

            }
        }
        else if (userValue.containsValue("McLaren")){
            if (getUserValue().containsValue("black")){
                return new Image(new File("src/cars/BlkMcLaren.jpg").toURI().toString());
            }
            else if (getUserValue().containsValue("blue")){
                return new Image(new File("src/cars/BluMcLaren.jpg").toURI().toString());
            }
            else if (userValue.containsValue(("green"))){
                return new Image(new File("src/cars/GreenMcLaren.jpg").toURI().toString());
            }
            else if (userValue.containsValue(("red"))){
                return new Image(new File("src/cars/RedMcLaren.jpg").toURI().toString());

            }
            else if (userValue.containsValue(("yellow"))){
                return new Image(new File("src/cars/YellowMcLaren.jpg").toURI().toString());

            }
            else if (userValue.containsValue(("orange"))){
                return new Image(new File("src/cars/OranMcLarConvertible.jpg").toURI().toString());

            }
        }
        else if (userValue.containsValue("Mercedes")){
            if (getUserValue().containsValue("red")){
                return new Image(new File("src/cars/RedMercedesMaybachEV.png").toURI().toString());
            }

        }
        else if (userValue.containsValue("Maserati")){
            if (getUserValue().containsValue("black")){
                return new Image(new File("src/cars/BlkMaserati.jpg").toURI().toString());
            }
            else if (getUserValue().containsValue("blue")){
                return new Image(new File("src/cars/BluMaserati.jpg").toURI().toString());
            }
            else if (userValue.containsValue(("red"))){
                return new Image(new File("src/cars/RedMaserati.jpg").toURI().toString());
            }
            else if (userValue.containsValue(("white"))){
                return new Image(new File("src/cars/WhiteMaserConvertible.jpg").toURI().toString());

            }
        }
        else if (userValue.containsValue("Rolls-Royce")){
            if (getUserValue().containsValue("gold")){
                return new Image(new File("src/cars/GoldRollsRoyceEV.png").toURI().toString());
            }
        }
        else if (userValue.containsValue("Tesla")){
            if (getUserValue().containsValue("gray")){
                return new Image(new File("src/cars/GrayCyberTruckEV.png").toURI().toString());
            }
        }

        return null;
    }
}
