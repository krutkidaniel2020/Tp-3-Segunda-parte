package Programa;
import java.util.Scanner;

import Modelo.Amarillo;
import Modelo.Rojo;
import Modelo.Semaforo;
import Modelo.Verde;

/**
 * Clase que representa un menú de opciones para interactuar con un semáforo.
 * 
 * Esta clase permite al usuario elegir el color del semáforo, ver la acción actual
 * del semáforo y terminar el programa.
 * 
 * @author Grupo G
 * @version 1.0
 */
public class Menu {
    /**
     * El semáforo sobre el cual se realizarán las operaciones del menú.
     */
    private Semaforo semaforo;

    /**
     * Constructor de la clase Menu.
     *
     * @param semaforo El semáforo asociado a este menú.
     */
    public Menu(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    /**
     * Muestra el menú de opciones al usuario y procesa sus elecciones.
     * 
     * Este método presenta un menú interactivo al usuario, permitiendo seleccionar 
     * diferentes acciones sobre el semáforo.
     */
    public void display() {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        String mensajeOpciones = "Color del semaforo: " +
                                 "a) Rojo, d) Amarillo, j) Verde, p) Mostrar Acción, s) Terminar Programa";

        while (true) {
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'a': semaforo.setEstado(new Rojo()); break;
                case 'd': semaforo.setEstado(new Amarillo()); break;
                case 'j': semaforo.setEstado(new Verde()); break;
                case 'p': semaforo.mostrarAccion(); break;
                case 's': System.out.println("Hasta pronto!"); System.exit(0);
                default: System.out.println("Opcion no válida");
            }
        }
    }
}