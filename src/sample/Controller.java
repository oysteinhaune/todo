package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
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
            errorLabel.setTextFill(Color.web("#ffffff"));
            errorLabel.setText("Du må skrive inn noe");
        }
        else {
            todoListView.getItems().add(taskfield.getText());
            errorLabel.setTextFill(Color.web("#ffffff"));
            taskfield.setText("");
            errorLabel.setText("Lagret");
        }
    }

    @FXML
    public void deleteButton(ActionEvent event) {
        int selectedIdx = todoListView.getSelectionModel().getSelectedIndex();

        if (selectedIdx != -1) {
            todoListView.getItems().remove(selectedIdx);
            errorLabel.setTextFill(Color.web("#ffffff"));
            errorLabel.setText("Slettet");
        }
        else {
            errorLabel.setTextFill(Color.web("#ffffff"));
            errorLabel.setText("Listen er tom eller ingenting er valgt.");
        }
    }

    @FXML
    public void resetLabel(MouseEvent event) {
        errorLabel.setText("");
    }
}
