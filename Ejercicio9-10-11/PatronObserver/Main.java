package PatronObserver;

public class Main {
    public static void main(String[] args) {
        
        /*
        Aplicacion de un viajero que  pueda suscribir a un vuelo, 
        para recibir las notificaciones que se vayan generando
        con el patron de diseño  Observer
        */
        
        Vuelo vuelo = new Vuelo("2023 destino Mexico");
        
        Viajero medel = new Viajero("Miguel Medel", vuelo);
        
        vuelo.add(medel);
        vuelo.notificarObservador();
        
    }
}
