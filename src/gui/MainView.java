package gui;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class MainView extends BorderPane {
    private Label inputLabel = new Label("Path to first image:");
    private TextField inputFile = new TextField();
    private Button inputFolderBtn = new Button();
    private Button outputFolderBtn = new Button();
    private HBox inputBox = new HBox(inputLabel,inputFile,inputFolderBtn);

    public MainView(){
        inputBox.setSpacing(8);
        inputLabel.setMinWidth(120);
        setCenter(inputBox);
    }
}
