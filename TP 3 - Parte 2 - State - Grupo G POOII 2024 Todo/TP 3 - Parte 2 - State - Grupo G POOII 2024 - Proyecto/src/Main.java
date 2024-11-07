import Modelo.Rojo;
import Modelo.Semaforo;

/**
 * Clase principal del programa que inicia la simulación del semáforo.
 * 
 * Esta clase crea un nuevo semáforo en estado rojo y muestra el menú de opciones
 * al usuario para interactuar con el semáforo.
 * 
 * @author Grupo G
 * @version 1.0
 */
public class Main {

    /**
     * Punto de entrada del programa.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo(new Rojo());

        new Menu(semaforo).display();
    }
}