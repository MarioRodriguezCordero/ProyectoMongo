package com.corsec.proyectomongo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ProyectoMongoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ProyectoMongoApplication.class.getResource("proyecto-mongo.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Proyecto Mongo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}