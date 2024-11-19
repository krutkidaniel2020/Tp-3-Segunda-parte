package Modelo;

/**
 * Representa un decorador de pizza, que permite agregar ingredientes o características adicionales a una pizza existente.
 * Esta clase abstracta proporciona la implementación básica de un decorator, delegando la obtención de la descripción 
 * y el precio a la pizza decorada.
 * 
 * @author Grupo G
 */
public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza; // Referencia a la pizza que se está decorando

    /**
     * Constructor que recibe una instancia de Pizza para decorarla.
     *
     * @param pizza La pizza a la que se le añadirán ingredientes o características.
     */
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * Devuelve la descripción de la pizza decorada, delegando la llamada a la pizza original.
     *
     * @return La descripción de la pizza decorada.
     */
    @Override
    public String getDescripcion() {
        return pizza.getDescripcion();
    }

    /**
     * Devuelve el precio de la pizza decorada, delegando la llamada a la pizza original.
     *
     * @return El precio de la pizza decorada.
     */
    @Override
    public double getPrecio() {
        return pizza.getPrecio();
    }
}
