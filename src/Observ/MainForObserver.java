package Observ;

public class MainForObserver {
     public static void main(String[] args){
         EventListener emailAlertListener = new EmailAlertListener();
         EventListener loggingListener = new LoggingListener();
     }
}
