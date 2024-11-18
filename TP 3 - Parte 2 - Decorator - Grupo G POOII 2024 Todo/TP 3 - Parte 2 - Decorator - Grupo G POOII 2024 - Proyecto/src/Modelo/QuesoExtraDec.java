/**
 * Decorador de pizza que añade queso extra a una pizza existente.
 * 
 * Este decorador incrementa el precio de la pizza y añade " + Queso Extra" a su descripción.
 * 
 * @author Grupo G
 */
public class QuesoExtraDec extends PizzaDecorator {
    private double costo = 50;

    /**
     * Constructor que recibe una instancia de Pizza para decorarla.
     * Hace uso del metodo "super" de la clase padre PizzaDecorator para 
     * añadir el ingrediente a un componente concreto 
     * 
     * @param pizza La pizza a la que se le añadirá queso extra.
     */
    public QuesoExtraDec(Pizza pizza) {
        super(pizza);
    }

    /**
     * Devuelve la descripción de la pizza con queso extra.
     *
     * @return La descripción de la pizza original concatenada con " + Queso Extra".
     */
    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + " + Queso Extra";
    }

    /**
     * Devuelve el precio de la pizza con queso extra, sumando el costo del queso extra.
     *
     * @return El precio de la pizza original más el costo del queso extra.
     */
    @Override
    public double getPrecio() {
        return pizza.getPrecio() + costo;
    }
}
