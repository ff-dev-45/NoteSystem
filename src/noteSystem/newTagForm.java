package noteSystem;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class newTagForm {
        private static TextField _nameSubmission;
        private static Stage _formWindow;

        public static void display() {
            _formWindow = new Stage();
            _formWindow.initModality(Modality.APPLICATION_MODAL);
            _formWindow.setTitle("New Tag Submission");

            Scene scene=null;

            try{
                Parent root = FXMLLoader.load(newTagForm.class.getResource("/noteSystem/newTagView.fxml"));
                scene = new Scene(root, 300, 400);
            } catch (IOException e){
                e.printStackTrace();
            }


            _formWindow.setScene(scene);
            _formWindow.showAndWait();
        }

        public static void close(){_formWindow.close();}

}
