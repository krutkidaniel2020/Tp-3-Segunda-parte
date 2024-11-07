package Modelo;

/**
 * Representa el estado concreto "rojo" de un semáforo.
 * 
 * Cuando un semáforo está en estado rojo, indica que los vehículos deben detenerse.
 * 
 * @author Grupo G
 * @version 1.0
 */
public class Rojo implements State {

    /**
     * Cambia el estado del semáforo de rojo a amarillo.
     *
     * @param semaforo El semáforo al que se le va a cambiar el estado.
     */
    @Override
    public void setEstado(Semaforo semaforo) {
        System.out.println("Cambiando de Rojo a Amarillo.");
        semaforo.setEstado(new Amarillo());
    }

    /**
     * Muestra la acción correspondiente al estado rojo.
     */
    @Override
    public void mostrarAccion() {
        System.out.println("Semáforo Rojo: Los autos deben detenerse.");
    }
}

