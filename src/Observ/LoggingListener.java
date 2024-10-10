package Observ;

import java.util.Objects;
import java.util.Observable;
import java.util.Observer;

public class LoggingListener implements EventListener {
    @Override
    public void update(String event) {
        System.out.println("Write to log: " + event);
    }


}
