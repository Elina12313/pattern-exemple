package Observ;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<EventListener> listener;

    public EventManager() { listener = new ArrayList<>();}

    public  void subscribe(EventListener eventListener) { listener.add(eventListener);}

    public void unsubscribe ( EventListener eventListener) { listener.remove(eventListener);}

    public  void notifyAll(String event) { listener.forEach(eventListener -> eventListener.update(event));}


}
