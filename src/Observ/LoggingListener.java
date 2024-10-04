package Observ;

import java.util.Objects;
import java.util.Observable;
import java.util.Observer;

public class LoggingListener implements EventListener {

    @Override
    public void update(Observable o, Objects arg) {
System.out.println("Записыл событие в log");
    }
}
