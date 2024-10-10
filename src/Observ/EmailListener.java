//package Observ;
//
//import java.util.ArrayList;
//
//public class EmailListener implements EventListener {
//
//    private ArrayList<EventListener> listener;
//    public void subscribe(EventListener eventListener){
//        listener.add(eventListener);
//    }
//    public void unsubscribe(EventListener eventListener){
//        listener.remove(eventListener);
//    }
//    public void notiflyAll( String event){
//        listener.forEach(eventListener -> eventListener.update(event));
//
//        for (EventListener eventListener : listener) {
//            eventListener.update(event);
//        }
//    }
//}
