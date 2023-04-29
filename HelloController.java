package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.io.IOException;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;

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

    public void switchToKPL(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KPL.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKRB(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KRB.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKTH(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KTH.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKD(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KD.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKAP(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KAP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKAdLogin(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KAdLogin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKStaffDetails(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KStaffDetails.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKS1Details(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KS1Details.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKS2Details(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KS2Details.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToKS3Details(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("KS3Details.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchOlympia(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Olympia.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchOSH(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("OSH.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchOB(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("OBurger.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchORB(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ORB.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchOSP(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("OSP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchOPizza(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("OPizza.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchOS(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("OS.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchONoodles(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ONoodles.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchOAP(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("OAP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchOD(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("OD.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchOSDetails(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("OSDetails.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchOStaffDetails(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("OStaffDetails.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchOS1Details(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("OS1Details.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchOS2Details(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("OS2Details.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchOS3Details(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("OS3Details.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //@FXML
    /*ImageView myImageView;
    Image myImage = new Image(getClass().getResourceAsStream("uiulogo.jpg"));

    public void displayImage(){
        myImageView.setImage(myImage);
        */

}