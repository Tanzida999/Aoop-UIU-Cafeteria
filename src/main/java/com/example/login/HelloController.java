package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToLogin (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToSignup (ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public void switchToFP(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToShop(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Shop.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKhans(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Khans.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKBurger(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KBurger.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKPizza(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KPizza.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKNoodles(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KNoodles.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKS(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KS.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKC(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KC.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKSH(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KSH.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKSP(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KSP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    //@FXML
    /*ImageView myImageView;
    Image myImage = new Image(getClass().getResourceAsStream("uiulogo.jpg"));

    public void displayImage(){
        myImageView.setImage(myImage);*/

    //private Label welcomeText;

    //@FXML
    //protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
    //}
}