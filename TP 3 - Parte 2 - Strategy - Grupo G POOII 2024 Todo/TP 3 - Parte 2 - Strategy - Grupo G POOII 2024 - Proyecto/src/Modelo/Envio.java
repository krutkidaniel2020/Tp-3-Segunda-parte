package Modelo;

/**
 * Representa una estrategia base de envío. Define los métodos necesarios para calcular el costo,
 * el tiempo de entrega y obtener el tipo de envío.
 *
 * Es la estrategia base del sistema con el patron Strategy. 
 * 
 * Permite la selección dinámica de diferentes estrategias de envío en la clase Tienda.
 * 
 * @author Grupo G
 */
public interface Envio {
    /**
     * Calcula el costo total del envío basado en el peso del paquete.
     *
     * @param peso El peso del paquete en kilogramos.
     * @return El costo total del envío.
     */
    double calcularCosto(double peso);

    /**
     * Obtiene el tiempo estimado de entrega del paquete.
     *
     * @return El tiempo estimado de entrega en formato de cadena.
     */
    String tiempoEntrega();

    /**
     * Obtiene el tipo de envío (regular, expreso o internacional).
     *
     * @return El tipo de envío como una cadena.
     */
    String tipo();
}