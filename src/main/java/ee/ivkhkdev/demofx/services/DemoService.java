package ee.ivkhkdev.demofx.services;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String clickAction(){
        return "Spring and JavaFX are working together!";
    }
}
