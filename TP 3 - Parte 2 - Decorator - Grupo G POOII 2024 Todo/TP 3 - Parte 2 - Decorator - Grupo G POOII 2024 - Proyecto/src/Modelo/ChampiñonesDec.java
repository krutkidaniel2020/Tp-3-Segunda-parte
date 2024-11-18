/**
 * Decorador de pizza que añade champiñones a una pizza existente.
 *
 * Este decorador incrementa el precio de la pizza y añade " + Champiñones" a su descripción.
 * 
 * @author Grupo G
 */
public class ChampiñonesDec extends PizzaDecorator {
    private double costo = 60;

    /**
     * Constructor que recibe una instancia de Pizza para decorarla.
     * Hace uso del metodo "super" de la clase padre PizzaDecorator para 
     * añadir el ingrediente a un componente concreto
     * 
     * @param pizza La pizza a la que se le añadirán champiñones.
     */
    public ChampiñonesDec(Pizza pizza) {
        super(pizza);
    }

    /**
     * Devuelve la descripción de la pizza con champiñones.
     *
     * @return La descripción de la pizza original concatenada con " + Champiñones".
     */
    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + " + Champiñones";
    }

    /**
     * Devuelve el precio de la pizza con champiñones, sumando el costo de los champiñones.
     *
     * @return El precio de la pizza original más el costo de los champiñones.
     */
    @Override
    public double getPrecio() {
        return pizza.getPrecio() + costo;
    }
}
