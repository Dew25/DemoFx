package ee.ivkhkdev.demofx;

import ee.ivkhkdev.demofx.fxmlloader.SpringFXMLLoader;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoFxApplication extends Application {

    private static ConfigurableApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(DemoFxApplication.class, args); // Запускаем Spring Boot
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        SpringFXMLLoader springFXMLLoader = applicationContext.getBean(SpringFXMLLoader.class);
        FXMLLoader loader = springFXMLLoader.load("/ee/ivkhkdev/demofx/demofx.fxml");
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void stop() throws Exception {
        applicationContext.close(); // Корректно завершаем Spring Boot при закрытии приложения
        Platform.exit();
    }
}
