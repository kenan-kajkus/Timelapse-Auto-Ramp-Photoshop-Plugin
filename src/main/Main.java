package main;

import gui.MainView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private MainView mainView = new MainView();
    private Scene mainScene = new Scene(mainView);

    public static void main(String[] args){
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Timelapse-Auto-Ramp-Photoshop-Plugin");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
}
