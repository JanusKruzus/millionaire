package com.example.milionar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class KonecController implements Initializable {

    @FXML
    Label bodyLabel;

    private int body = 69;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Otazky otazky = new Otazky();

        bodyLabel.setText("Počet bodů je: "+otazky.pocetBodu);

    }

}
