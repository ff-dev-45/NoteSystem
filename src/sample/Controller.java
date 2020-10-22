package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private NoteModel _model = NoteModel.getInstance();

    @FXML
    private ListView tagView;
    @FXML
    private ListView itemView;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tagView.setItems(_model.getTags());
        itemView.setItems(_model.getItems());
    }

    public void addTag(){
        newTagForm.display();
    }
}
