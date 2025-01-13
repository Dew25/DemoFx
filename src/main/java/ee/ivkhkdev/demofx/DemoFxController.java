package ee.ivkhkdev.demofx;

import ee.ivkhkdev.demofx.services.DemoService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class DemoFxController implements Initializable {
    @Autowired
    private DemoService demoService;
    @FXML
    private Label label;

    @FXML
    private void onActionButtonClick() {
        String result = demoService.clickAction();
        label.setText(result);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        label.setText("Welcome to JavaFX with Spring Boot!");
    }
}
