package noteSystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private NoteModel _model = NoteModel.getInstance();

    @FXML
    private ListView tagView;
    @FXML
    private ListView itemView;
    @FXML
    private ComboBox sortSelection;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tagView.setItems(_model.getTags());
        itemView.setItems(_model.getItems());
        sortSelection.setItems((_model.getTags()));

    }

    public void addTag(){
        newTagForm.display();
    }

    public void addItem(){
        newItemForm.display();
    }

    public void sortBy(){
        Tag tag = (Tag)sortSelection.getSelectionModel().getSelectedItem();
        if(sortSelection.getSelectionModel().isEmpty() || "<None>".equals(tag.toString())){
            //_model.sort
        } else{
            _model.sort(tag);
        }
    }
}
