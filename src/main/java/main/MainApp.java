package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //FXMLLoader loader = new FXMLLoader(
            //MainApp.class.getResource("/form-tiket.fxml"));
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/KalkulatorBMI.fxml"));

        
        Scene scene = new Scene(loader.load());
        stage.setTitle("Calculator BMI - OOP dan GUI");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
