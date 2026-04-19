import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Practical32 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Welcome to JavaFX!");

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 300, 200);
        
        primaryStage.setTitle("Basic Layout");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
