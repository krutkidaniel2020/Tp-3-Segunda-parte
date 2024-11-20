package Modelo;

/**
 * Representa una estrategia concreta de envío regular.
 *
 * Esta clase concreta implementa la interfaz Envio y ofrece un envío estándar a un costo menor.
 * Es ideal para envíos que no requieren una entrega urgente.
 * 
 * @author Grupo G
 */
public class EnvioRegular implements Envio {

    /**
     * Tarifa por kilogramo para envíos regulares.
     */
    private final double tarifaPorKg = 5.0;

    /**
     * Tiempo estimado de entrega para envíos regulares.
     */
    private final String tiempo = "5-7 días";

    /**
     * Tipo de envío.
     */
    private final String tipo = "Envio Regular";

    /**
     * Calcula el costo total del envío basado en el peso del paquete y la tarifa por kilogramo.
     *
     * @param peso El peso del paquete en kilogramos.
     * @return El costo total del envío.
     */
    @Override
    public double calcularCosto(double peso) {
        return peso * tarifaPorKg;
    }

    /**
     * Obtiene el tiempo estimado de entrega para envíos regulares.
     *
     * @return El tiempo estimado de entrega en formato de cadena.
     */
    @Override
    public String tiempoEntrega() {
        return tiempo;
    }

    /**
     * Obtiene el tipo de envío.
     *
     * @return El tipo de envío como una cadena.
     */
    @Override
    public String tipo() {
        return tipo;
    }
}

