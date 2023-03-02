package PatronObserver;

public class Viajero implements Receptor{
    private String nombre;
    private Vuelo vuelo;

    public Viajero(String nombre, Vuelo vuelo) {
        super();
        this.nombre = nombre;
        this.vuelo = vuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public void notificar() {
        System.out.println(nombre + "<-- Notificar: " +
        vuelo.getSuceso());
    }
    
            
}
