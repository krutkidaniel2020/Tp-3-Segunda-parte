package Modelo;

/**
 * Representa una estrategia concreta de envío internacional.
 *
 * Esta clase concreta implementa la interfaz Envio y ofrece un envío a destinos internacionales.
 * Incluye una tarifa base y una tarifa adicional por kilogramo.
 * 
 * @author Grupo G
 */
public class EnvioInternacional implements Envio {

    /**
     * Tarifa base para envíos internacionales.
     */
    private final double tarifaBase = 20.0;

    /**
     * Tarifa adicional por kilogramo para envíos internacionales.
     */
    private final double tarifaPorKg = 15.0;

    /**
     * Tiempo estimado de entrega para envíos internacionales.
     */
    private final String tiempo = "7-14 días";

    /**
     * Tipo de envío.
     */
    private final String tipo = "Envio Internacional";

    /**
     * Calcula el costo total del envío basado en el peso del paquete, la tarifa base y la tarifa por kilogramo.
     *
     * @param peso El peso del paquete en kilogramos.
     * @return El costo total del envío.
     */
    @Override
    public double calcularCosto(double peso) {
        return tarifaBase + (peso * tarifaPorKg);
    }

    /**
     * Obtiene el tiempo estimado de entrega para envíos internacionales.
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