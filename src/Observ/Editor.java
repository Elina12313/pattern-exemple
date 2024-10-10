package Observ;

import java.util.Observer;

public abstract class Editor implements Observer {

 public Editor(EventManager eventManager) {this.eventManager = eventManager;}

 private  EventManager eventManager;
 public  void openFile(){ eventManager.notifyAll("File open");}

 public void closeFile(){eventManager.notifyAll("File close");}
}
