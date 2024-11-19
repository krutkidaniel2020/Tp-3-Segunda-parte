package Modelo;

/**
 * Decorador de pizza que añade jamón a una pizza existente.
 *
 * Este decorador incrementa el precio de la pizza y añade " + Jamón" a su descripción.
 * 
 * @author Grupo G
 */
public class JamonDec extends PizzaDecorator {
    private double costo = 70;

    /**
     * Constructor que recibe una instancia de Pizza para decorarla.
     * Hace uso del metodo "super" de la clase padre PizzaDecorator para 
     * añadir el ingrediente a un componente concreto
     * 
     * @param pizza La pizza a la que se le añadirá jamón.
     */
    public JamonDec(Pizza pizza) {
        super(pizza);
    }

    /**
     * Devuelve la descripción de la pizza con jamón.
     *
     * @return La descripción de la pizza original concatenada con " + Jamón".
     */
    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + " + Jamón";
    }

    /**
     * Devuelve el precio de la pizza con jamón, sumando el costo del jamón.
     *
     * @return El precio de la pizza original más el costo del jamón.
     */
    @Override
    public double getPrecio() {
        return pizza.getPrecio() + costo;
    }
}
