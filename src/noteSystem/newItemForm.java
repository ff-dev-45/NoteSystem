package noteSystem;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class newItemForm {
    private static TextField _nameSubmission;
    private static Stage _formWindow;

    public static void display() {
        _formWindow = new Stage();
        _formWindow.initModality(Modality.APPLICATION_MODAL);
        _formWindow.setTitle("Item Submission");

        Scene scene=null;

        try{
            Parent root = FXMLLoader.load(newItemForm.class.getResource("/noteSystem/newItemview.fxml"));
            scene = new Scene(root, 300, 400);
        } catch (IOException e){
            e.printStackTrace();
        }



        _formWindow.setScene(scene);
        _formWindow.showAndWait();
    }

    public static void close(){
        _formWindow.close();
    }
}
