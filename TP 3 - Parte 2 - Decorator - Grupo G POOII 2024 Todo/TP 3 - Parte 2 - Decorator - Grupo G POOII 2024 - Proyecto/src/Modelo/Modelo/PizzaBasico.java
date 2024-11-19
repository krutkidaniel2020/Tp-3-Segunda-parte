package Modelo;

/**
 * Clase que representa un componente concreto del patron Decorator
 * Representa una pizza básica. Sirve como punto de partida para crear pizzas más elaboradas
 * usando decoradores.
 * 
 * @author Grupo G
 */
public class PizzaBasico implements Pizza {
    private String descripcion = "Pizza básica";
    private double precio = 100; // Precio base de la pizza

    /**
     * Devuelve la descripción de la pizza básica.
     *
     * @return La descripción de la pizza básica.
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Devuelve el precio base de la pizza.
     *
     * @return El precio base de la pizza.
     */
    @Override
    public double getPrecio() {
        return precio;
    }
}

