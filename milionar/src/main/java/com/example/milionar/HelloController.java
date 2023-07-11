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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {


    @FXML
    private Button konec;



    private Scene scene;
    private Parent otazky;
    private Stage stage;

    public void zacitOtazky(ActionEvent event) throws IOException {

        otazky = FXMLLoader.load(getClass().getResource("otazky.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(otazky);
        stage.setScene(scene);
        stage.show();





    }


}