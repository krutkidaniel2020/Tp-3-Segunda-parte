package Modelo;

/**
 * Representa un semáforo en un sistema de gestión de tráfico.
 * Implementa el patrón de comportamiento "State" para gestionar los diferentes estados del semáforo.
 * Es la clase "Contexto" dentro de este sistema.
 * 
 * @author Grupo G
 * @version 1.0
 */
public class Semaforo {
    /**
     * El estado actual del semáforo.
     */
    private State estado;

    /**
     * Constructor de la clase Semaforo.
     *
     * @param estado El estado inicial del semáforo.
     */
    public Semaforo(State estado) {
        this.estado = estado;
    }

    /**
     * Establece un nuevo estado al semáforo.
     *
     * @param estado El nuevo estado del semáforo.
     */
    public void setEstado(State estado) {
        this.estado = estado;
    }

    /**
     * Muestra la acción correspondiente al estado actual del semáforo.
     */
    public void mostrarAccion() {
        estado.mostrarAccion();
    }
}




