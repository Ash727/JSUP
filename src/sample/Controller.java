package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Controller {

private @FXML TextField Name;

private @FXML Text outPut;

    public void HandelSaySup (ActionEvent e) {
       System.out.println("Sup, "+ Name.getText());
       Name.getStyleClass().add("Activate");
       outPut.setText("Sup, "+ Name.getText());

    }
}
