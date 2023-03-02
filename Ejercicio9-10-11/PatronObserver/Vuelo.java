package PatronObserver;

import java.util.ArrayList;
import java.util.List;

public class Vuelo extends Observador{
    private String codigoViaje;
    private List<Viajero> viajeros;
    private String suceso;

    public Vuelo(String codigoViaje){
        super();
        this.codigoViaje = codigoViaje;
        viajeros = new ArrayList<Viajero>();
        suceso="";
    }

    public String getCodigoViaje() {
        return codigoViaje;
    }

    public void setCodigoViaje(String codigoViaje) {
        this.codigoViaje = codigoViaje;
    }

    public List<Viajero> getViajeros() {
        return viajeros;
    }

    public void setViajeros(List<Viajero> viajeros) {
        this.viajeros = viajeros;
    }

    public String getSuceso() {
        return codigoViaje + ":" + suceso;
    }

    public void setSuceso(String suceso) {
        this.suceso = suceso;
        notificarObservador();
    }
       
}
