import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.util.concurrent.Flow;

public class JavaFXHello extends Application {
    public static void run() {
        launch();
    }

    @Override
    public void start(Stage stage) {
        String version = System.getProperty("javafx.version");
        Label label1 = new Label("Panther Pharma");
        Label label2 = new Label("Username:");
        Label label3 = new Label("pasword:");
        GridPane pane = new GridPane();
        pane.add(label1,0,0);
        pane.add(label2, 2,2);
        pane.add(label3, 5,5);
        Scene scene = new Scene(pane, 640, 480);
        stage.setScene(scene);
        stage.show();

    }
}
