package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class newTagForm {
        private static TextField _nameSubmission;
        private static Stage _formWindow;

        public static void display() {
            _formWindow = new Stage();
            _formWindow.initModality(Modality.APPLICATION_MODAL);
            _formWindow.setTitle("Name Submission");

            Label text = new Label("Please enter tag name:");
            _nameSubmission = new TextField();

            Button submitBtn = new Button("Submit");
            submitBtn.setOnAction(e -> btnHandler());


            VBox layout = new VBox(10);
            layout.getChildren().addAll(text, _nameSubmission, submitBtn);
            layout.setAlignment(Pos.CENTER);
            Scene scene = new Scene(layout, 400, 300);
            

            _formWindow.setScene(scene);

            _formWindow.showAndWait();
        }

    private static void btnHandler() {
            NoteModel _model = NoteModel.getInstance();

            String tagName = _nameSubmission.getText();
            _model.addTag(new Tag(tagName));

            _formWindow.close();
    }
}
