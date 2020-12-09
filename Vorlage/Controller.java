import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Rectangle rechteck;

    @FXML
    void neueFarbe(ActionEvent event) {
        final double r = Math.random();
        final double g = Math.random();
        final double b = Math.random();
        rechteck.setFill(Color.color(r,g,b));
    }

    @FXML
    void initialize() {
        assert rechteck != null : "fx:id=\"rechteck\" was not injected: check your FXML file 'view.fxml'.";

    }
}