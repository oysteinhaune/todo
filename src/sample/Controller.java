package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;


public class Controller {
    @FXML
    ListView todoListView;
    ObservableList<String> gjoremaal = FXCollections.observableArrayList();
    ObservableList<String> data = FXCollections.observableArrayList();

    @FXML
    public void storeButton(ActionEvent event) {
        todoListView.setItems("Hello World");
    }
}
