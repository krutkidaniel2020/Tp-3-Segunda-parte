package Programa;
import Modelo.*;

/**
 * Clase principal que demuestra el uso del patrón Strategy para calcular costos de envío.
 *
 * Esta clase crea instancias de diferentes estrategias de envío (EnvioExpreso, EnvioInternacional, EnvioRegular)
 * y las asigna al contexto Tienda para calcular costos y tiempos de entrega.
 * 
 * @author Grupo G
 */
public class Principal {

    /**
     * Punto de entrada de la aplicación.
     *
     * @param args Los argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {

        // Instancia del contexto (Tienda)
        Tienda contexto = new Tienda();

        // Cambio de estrategia a EnvioExpreso
        Envio estrategia = new EnvioExpreso();
        contexto.setEnvio(estrategia);
        System.out.println("Estrategia: " + contexto.tipo() + "; tiempo estimado: " + contexto.tiempoEstimadoEntrega() + "; costo: " + contexto.calcularCostoEnvio(5));

        // Cambio de estrategia a EnvioInternacional
        estrategia = new EnvioInternacional();
        contexto.setEnvio(estrategia);
        System.out.println("Estrategia: " + contexto.tipo() + "; tiempo estimado: " + contexto.tiempoEstimadoEntrega() + "; costo: " + contexto.calcularCostoEnvio(5));

        // Cambio de estrategia a EnvioRegular
        estrategia = new EnvioRegular();
        contexto.setEnvio(estrategia);
        System.out.println("Estrategia: " + contexto.tipo() + "; tiempo estimado: " + contexto.tiempoEstimadoEntrega() + "; costo: " + contexto.calcularCostoEnvio(5));
    }
}