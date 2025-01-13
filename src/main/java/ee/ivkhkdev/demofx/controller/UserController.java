package ee.ivkhkdev.demofx.controller;

import ee.ivkhkdev.demofx.services.UserService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ee.ivkhkdev.demofx.entity.User;

@Component
public class UserController {

    @Autowired
    private UserService userService;

    @FXML
    private Label info;
    @FXML
    private TextField fFirstname;
    @FXML
    private TextField fLastname;
    @FXML
    private TextField fLogin;
    @FXML
    private TextField fPassword;
    @FXML
    private Button btnRegister;

    @FXML
    public void btnRegisterClick() {
        User user = new User();
        user.setFirstname(fFirstname.getText());
        user.setLastname(fLastname.getText());
        user.setUsername(fLogin.getText());
        user.setPassword(fPassword.getText());
        if(userService.add(user)){
            info.setText("Пользователь добавлен");
            fFirstname.setText("");
            fLastname.setText("");
            fLogin.setText("");
            fPassword.setText("");
        }else{
            info.setText("Пользователя добавить не удалось");
        };
    }
}
