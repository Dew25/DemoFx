package ee.ivkhkdev.demofx.fxmlloader;

import javafx.fxml.FXMLLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringFXMLLoader {
    private final ApplicationContext context;

    @Autowired
    public SpringFXMLLoader(ApplicationContext context) {
        this.context = context;
    }

    public FXMLLoader load(String fxmlPath) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
        loader.setControllerFactory(context::getBean); // Используем Spring для создания контроллеров
        return loader;
    }
}
