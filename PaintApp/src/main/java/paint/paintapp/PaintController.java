package paint.paintapp;

import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class PaintController {

    @FXML
    private Canvas canvas;

    @FXML
    private TextField brushSize;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private CheckBox eraser;

    @FXML
    private BorderPane borderPane;


    public void initialize() {
        borderPane.prefWidthProperty().addListener(((observableValue, oldValue, newValue) -> canvas.setWidth(newValue.doubleValue())));
        borderPane.prefHeightProperty().addListener(((observableValue, oldValue, newValue) -> canvas.setHeight(newValue.doubleValue())));
        GraphicsContext c = canvas.getGraphicsContext2D();
        canvas.setOnMouseDragged(e -> {
            double size = Double.parseDouble(brushSize.getText());
            double x = e.getX() - size / 2;
            double y = e.getY() - size / 2;

            if (eraser.isSelected()) {
                c.clearRect(x, y, size, size);
            } else {
                c.setFill(colorPicker.getValue());
                c.fillRect(x, y, size, size);
            }
        });
    }

    public void onSave()
    {
        FileChooser saveFile = new FileChooser();
        saveFile.setTitle("Save File");
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("PNG files", "*.png");
        saveFile.getExtensionFilters().add(extensionFilter);
        Stage stageToSave = PaintApp.getStage();
        File file = saveFile.showSaveDialog(stageToSave);

        try {
            WritableImage snapshot = canvas.snapshot(null, null);
            ImageIO.write(SwingFXUtils.fromFXImage(snapshot, null), "png", file);

        } catch (IOException e) {
            System.out.println("Could not save image: " + e);
        }
    }







}