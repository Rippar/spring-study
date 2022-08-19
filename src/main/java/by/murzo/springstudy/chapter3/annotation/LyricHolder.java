package by.murzo.springstudy.chapter3.annotation;

import org.springframework.stereotype.Service;

@Service("lyricHolder")
public class LyricHolder{
    private String value = "You be the DJ, I'll be the driver";

    @Override
    public String toString() {
        return "LyricHolder: { " + value + "}";
    }

}
