package Observ;

public class EmailAlertListener implements  EventListener{


    @Override
    public void  update (String event ){
        System.out.println("Send to e-mail" + event);
    }
}
