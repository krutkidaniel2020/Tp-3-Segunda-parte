package Modelo;

/**
 * Representa un estado del semáforo.
 * Define el comportamiento común a todos los estados posibles de un semáforo.
 * Es la clase "State" en este sistema que sigue el patron del mismo nombre.
 * 
 * @author Grupo G
 * @version 1.0
 */
public interface State {
    /**
     * Establece el estado del semáforo.
     *
     * @param semaforo El semáforo al que se le va a cambiar el estado.
     *
     * Este método permite a un estado cambiar el estado de un semáforo, 
     * por ejemplo, cuando se pasa de verde a amarillo.
     */
    void setEstado(Semaforo semaforo);

    /**
     * Muestra la acción correspondiente al estado actual.
     * 
     * Cada estado concreto (Rojo, Amarillo, Verde) implementará este método
     * para definir la acción específica asociada a ese estado, como "Detener",
     * "Precaución" o "Avanzar".
     */
    void mostrarAccion();
}