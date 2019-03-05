package observer;

import java.util.Observable;

public class Button extends Observable{
    //Can't multi inheritance (view and Observable) 

    public void onClick(){
        setChanged();//protected in observable.clas
        notifyObservers();
    }
}
