package Modelo;
/**
 * Clase que representa el componente base del patron Decorator. 
 * Representa una pizza en el sistema. Esta interfaz define los métodos básicos 
 * para una pizza como descripción y precio.
 *  
 * @author Grupo G
 */
public interface Pizza {
    /**
     * Obtiene una descripción detallada de la pizza, incluyendo sus ingredientes y características.
     *
     * @return Una cadena de texto que describe la pizza.
     */
    String getDescripcion();

    /**
     * Obtiene el precio total de la pizza.
     *
     * @return El precio de la pizza en la moneda correspondiente.
     */
    double getPrecio();
}
