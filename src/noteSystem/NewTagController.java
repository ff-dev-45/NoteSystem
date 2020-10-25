package noteSystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class NewTagController implements Initializable {
    private ObservableList<Tag> tagsSelected = FXCollections.observableArrayList();
    private List<Tag> tagsToAdd = new ArrayList<Tag>();
    private NoteModel _model = NoteModel.getInstance();

    @FXML
    private ComboBox tagOptions;
    @FXML
    private ListView tagView;
    @FXML
    private TextField nameSubmission;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tagsToAdd = new ArrayList<Tag>();
        tagOptions.setItems(_model.getTags());
        tagView.setItems(tagsSelected);
    }

    public void addTag(){
        Tag tag = (Tag)tagOptions.getSelectionModel().getSelectedItem();
        if(!tagsSelected.contains(tag) && tag != null) {
            tagsSelected.add(tag);
            tagsToAdd.add(tag);
        }
    }

    public void createTag(){
        String tagName = nameSubmission.getText();
        Tag newTag = new Tag(tagName);

        newTag.addTags(tagsToAdd);

        _model.addTag(newTag);
        newTagForm.close();
    }
}
