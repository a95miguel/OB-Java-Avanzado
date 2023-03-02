package PatronObserver;

import java.util.ArrayList;

public class Observador {
    private ArrayList <Receptor> receptor  = new ArrayList();
    
    public void add(Receptor receptor) {
        this.receptor.add(receptor);
    }
     
     public void notificarObservador(){
         for(Receptor receptor: receptor)
             receptor.notificar();         
     }
}
