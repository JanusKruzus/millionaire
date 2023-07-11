package com.example.milionar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Otazky implements Initializable {

    private Scene scene;
    private Parent root;
    private Stage stage;

    @FXML
    private Label otazka;
    @FXML
    private Button buttonA;
    @FXML
    private Button buttonB;
    @FXML
    private Button buttonC;
    @FXML
    private Button buttonD;


    final String[] otazky = {
            "Kolik je 2 + 2?",
            "Co se stalo na náměstí Nebeského klidu roku 1989?",
            "Který programovací jazyk je nejstarší?",
            "Které je nejlepší anime?",
            "Jak se jmenuje hlavní město ČR?"
    };

    final String[][] odpovedi = {

            {"5", "4", "420", "69"},
            {"Vůbec nic", "Nevím o čem mluvíš", "Obrovský protest", "Miluju Si Ťin-pchinga"},
            {"Python", "Javascript", "C", "Java"},
            {"Sword Art Online", "One Piece", "Rent a Girlfriend", "Dotkni se trávy pls"},
            {"Praha","Stodolní","Ústí nad Labem","Ostrava"}
    };


    private int counter = 0;
    public static int pocetBodu = 0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nastavitOtazku();
    }

    public void nastavitOtazku(){

        otazka.setText(otazky[counter]);

        buttonA.setText(odpovedi[counter][0]);
        buttonB.setText(odpovedi[counter][1]);
        buttonC.setText(odpovedi[counter][2]);
        buttonD.setText(odpovedi[counter][3]);
        counter++;

        System.out.println("Hodnota "+counter);
    }

    public void clickA(ActionEvent ev) throws IOException {

        if(counter == 5){

            pocetBodu++;
            root = FXMLLoader.load(getClass().getResource("konec.fxml"));
            stage = (Stage)((Node)ev.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            System.out.println("počet bodů jsem tady debílku: "+pocetBodu);
            return;

        }
        nastavitOtazku();


    }
    public void clickB(ActionEvent ev) throws IOException {

        if(counter == 1){
           pocetBodu++;

        }
        if(counter == 5){

            root = FXMLLoader.load(getClass().getResource("konec.fxml"));
            stage = (Stage)((Node)ev.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            return;

        }
        nastavitOtazku();



    }
    public void clickC(ActionEvent ev) throws IOException {

        if(counter == 2){
            pocetBodu++;

        }

        if(counter == 3){
            pocetBodu++;

        }
        if(counter == 5){

            root = FXMLLoader.load(getClass().getResource("konec.fxml"));
            stage = (Stage)((Node)ev.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            return;

        }
        nastavitOtazku();




    }
    public void clickD(ActionEvent ev) throws IOException {

        if(counter == 4){
            pocetBodu++;

        }
        if(counter == 5){

            root = FXMLLoader.load(getClass().getResource("konec.fxml"));
            stage = (Stage)((Node)ev.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            return;

        }
        nastavitOtazku();


    }

    public int getPocetBodu() {
        return pocetBodu;
    }
}
