package noteSystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class NewItemController implements Initializable {
    private ObservableList<Tag> tagsSelected = FXCollections.observableArrayList();
    private NoteModel _model = NoteModel.getInstance();

    @FXML
    private ComboBox allTags;
    @FXML
    private ListView tagView;
    @FXML
    private TextField nameField;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        allTags.setItems(_model.getTags());
        tagView.setItems(tagsSelected);

    }

    public void addTag(){
        Tag tag = (Tag)allTags.getSelectionModel().getSelectedItem();
        if(!tagsSelected.contains(tag)) {
            tagsSelected.add(tag);
        }
    }

    public void createItem(){
        String itemName = nameField.getText();
        _model.addItem(new Item(itemName,"",tagsSelected));
        newItemForm.close();
    }
}
