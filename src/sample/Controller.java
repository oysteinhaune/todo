package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;


public class Controller {
    @FXML
    ListView todoListView;
    @FXML
    TextField taskfield;
    @FXML
    Label errorLabel;

    @FXML
    public void storeButton(ActionEvent event) {
        Button button = (Button) event.getSource();
        if (taskfield.getText().equals("")) {
            errorLabel.setTextFill(Color.web("#ff0000"));
            errorLabel.setText("Du må skrive inn noe");
        }
        else {
            todoListView.getItems().add(taskfield.getText());
            errorLabel.setTextFill(Color.web("#41d33c"));
            taskfield.setText("");
            errorLabel.setText("Lagret");
        }
    }

    @FXML
    public void deleteButton(ActionEvent event) {
        int selectedIdx = todoListView.getSelectionModel().getSelectedIndex();
        if (selectedIdx != -1) {
            todoListView.getItems().remove(selectedIdx);
        }
        else {
            errorLabel.setTextFill(Color.web("#ff0000"));
            errorLabel.setText("Listen er tom eller ingenting er valgt.");
        }
    }
}
