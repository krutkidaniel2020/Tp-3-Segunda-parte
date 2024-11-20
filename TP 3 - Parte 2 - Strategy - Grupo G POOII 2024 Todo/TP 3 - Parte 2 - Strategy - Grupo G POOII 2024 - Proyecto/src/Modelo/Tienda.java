package Modelo;

/**
 * Representa una tienda en línea que ofrece diferentes opciones de envío.
 * Implementa el patrón Strategy para permitir la selección dinámica de estrategias de envío.
 * En la estructura del patrón Strategy, esta es una clase "Contexto". 
 * 
 * @author Grupo G
 */
public class Tienda {
    /**
     * Referencia a la estrategia de envío actual utilizada por la tienda.
     */
    private Envio envio;

    /**
     * Establece la estrategia de envío a utilizar.
     *
     * @param envio La estrategia de envío a establecer.
     */
    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    /**
     * Delega el calculo del costo total del envío a la estrategia de envío seleccionada.
     *
     * @param peso El peso del paquete en kilogramos.
     * @return El costo total del envío.
     * @throws IllegalStateException Si no se ha seleccionado una estrategia de envío.
     */
    public double calcularCostoEnvio(double peso) {
        if (envio == null) {
            throw new IllegalStateException("No se ha seleccionado una estrategia de envío.");
        }
        return envio.calcularCosto(peso);
    }

    /**
     * Delega la obtención del tiempo estimado de entrega del paquete a la estrategia de envío seleccionada.
     *
     * @return El tiempo estimado de entrega en formato de cadena.
     * @throws IllegalStateException Si no se ha seleccionado una estrategia de envío.
     */
    public String tiempoEstimadoEntrega() {
        if (envio == null) {
            throw new IllegalStateException("No se ha seleccionado una estrategia de envío.");
        }
        return envio.tiempoEntrega();
    }

    /**
     * Delega la obtención del tipo de envío seleccionado a la estrategia de envío seleccionada.
     *
     * @return El tipo de envío como una cadena.
     * @throws IllegalStateException Si no se ha seleccionado una estrategia de envío.
     */
    public String tipo() {
        if (envio == null) {
            throw new IllegalStateException("No se ha seleccionado una estrategia de envío.");
        }
        return envio.tipo();
    }
}