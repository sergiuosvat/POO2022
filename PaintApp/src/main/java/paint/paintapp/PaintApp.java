package paint.paintapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class PaintApp extends Application {
    private static Stage stage;
    public static Stage getStage()
    {
        return stage;
    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        BorderPane root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("paint.fxml")));
        stage = primaryStage;
        primaryStage.setScene(new Scene(root, 700, 700));
        primaryStage.setTitle("Paint App");
        root.prefWidthProperty().bind(primaryStage.widthProperty());
        root.prefHeightProperty().bind(primaryStage.heightProperty());
        primaryStage.getIcons().add(new Image(Objects.requireNonNull(PaintApp.class.getResourceAsStream("/painticon.jpg"))));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}