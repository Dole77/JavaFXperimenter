import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class GuiController {
    public Label label;

    public void buttonClicked(ActionEvent actionEvent) {
        label.setText("Hurra!");
        Node source = (Node) actionEvent.getSource();
        Scene scene = source.getScene();
        Stage window = (Stage) scene.getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Patient.fxml"));
    }
    public void buttonClicked2(ActionEvent actionEvent) {
        label.setText("Hurra!");
        Node source = (Node) actionEvent.getSource();
        Scene scene = source.getScene();
        Stage window = (Stage) scene.getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Patient.fxml"));
    }
}
