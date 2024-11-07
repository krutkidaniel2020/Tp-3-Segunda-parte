package Modelo;

/**
 * Representa el estado concreto amarillo de un semáforo.
 *
 * Cuando un semáforo está en estado amarillo, indica que los vehículos deben 
 * prepararse para detenerse o avanzar con precaución.
 * 
 * @author Grupo G
 * @version 1.0
 */
public class Amarillo implements State {

    /**
     * Cambia el estado del semáforo de amarillo a verde.
     *
     * @param semaforo El semáforo al que se le va a cambiar el estado.
     */
    @Override
    public void setEstado(Semaforo semaforo) {
        System.out.println("Cambiando de Amarillo a Verde.");
        semaforo.setEstado(new Verde());
    }

    /**
     * Muestra la acción correspondiente al estado amarillo.
     * 
     * Indica que los vehículos deben pasar con precaución.
     */
    @Override
    public void mostrarAccion() {
        System.out.println("Semáforo Amarillo: Los autos deben pasar con precaución.");
    }
}


