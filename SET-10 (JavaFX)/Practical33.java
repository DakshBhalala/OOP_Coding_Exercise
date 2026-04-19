import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Practical33 extends Application {
    private int count = 0;

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Count: 0");
        Button button = new Button("Click");

        button.setOnAction(e -> {
            count++;
            label.setText("Count: " + count);
        });

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(label, button);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Event Handling");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
