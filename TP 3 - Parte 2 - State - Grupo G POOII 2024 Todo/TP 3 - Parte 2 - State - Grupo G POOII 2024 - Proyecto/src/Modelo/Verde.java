package Modelo;

/**
 * Representa el estado concreto verde de un semáforo.
 *
 * Cuando un semáforo está en estado verde, indica que los vehículos pueden avanzar.
 * Esta clase implementa la interfaz State y define el comportamiento específico del estado verde.
 * 
 * @author Grupo G
 * @version 1.0
 */
public class Verde implements State {

    /**
     * Cambia el estado del semáforo de verde a rojo.
     *
     * @param semaforo El semáforo al que se le va a cambiar el estado.
     */
    @Override
    public void setEstado(Semaforo semaforo) {
        System.out.println("Cambiando de Verde a Rojo.");
        semaforo.setEstado(new Rojo());
    }

    /**
     * Muestra la acción correspondiente al estado verde.
     * 
     * Indica que los vehículos pueden avanzar.
     */
    @Override
    public void mostrarAccion() {
        System.out.println("Semáforo Verde: Los autos deben pasar.");
    }
}
