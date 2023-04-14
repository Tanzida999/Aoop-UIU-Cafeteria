package com.example.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private double x=0;
    private  double y=0;
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(root);

            root.setOnMousePressed((MouseEvent event) ->{
            x = event.getSceneX();
            y = event.getSceneY();
            });
            root.setOnMouseDragged((MouseEvent event)->{
                stage.setX(event.getSceneX() - x);
                stage.setY(event.getSceneY() - y);
                stage.setOpacity(.8);
            });
            root.
            //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
            //Scene scene = new Scene(fxmlLoader.load(), 500, 400);
            //stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}