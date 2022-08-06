package by.murzo.springstudy.chapter3.annotation;

import by.murzo.springstudy.chapter2.decoupled.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;

    @Autowired
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }



    @Override
    public String getMessage() {
        return message;
    }
}
