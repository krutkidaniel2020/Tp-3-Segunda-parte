package Modelo;

/**
 * Representa una estrategia concreta de envío exprés.
 * 
 * Esta clase concreta implementa la interfaz Envio y ofrece un envío rápido
 * con una tarifa por kilogramo fija.
 * 
 * @author Grupo G
 */
public class EnvioExpreso implements Envio {

    /**
     * Tarifa por kilogramo para envíos expresos.
     */
    private final double tarifaPorKg = 10.0;

    /**
     * Tiempo estimado de entrega para envíos expresos.
     */
    private final String tiempo = "1-2 días";

    /**
     * Tipo de envío.
     */
    private final String tipo = "Envio Expreso";

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
     * Obtiene el tiempo estimado de entrega para envíos expresos.
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