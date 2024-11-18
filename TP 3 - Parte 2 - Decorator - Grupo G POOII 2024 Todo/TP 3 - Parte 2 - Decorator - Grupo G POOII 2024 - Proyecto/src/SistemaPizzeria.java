/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Clase principal que demuestra el uso del patrón Decorator para crear diferentes tipos de pizzas.
 *
 * Esta clase crea una pizza básica y luego le agrega ingredientes adicionales utilizando decoradores.
 * 
 * @author Grupo G
 */
public class SistemaPizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pizza básica
        Pizza pizza = new PizzaBasico();
        System.out.println(pizza.getDescripcion() + ", Precio: " + pizza.getPrecio());

        // Pizza con queso extra
        pizza = new QuesoExtraDec(pizza);
        System.out.println(pizza.getDescripcion() + ", Precio: " + pizza.getPrecio());

        // Pizza con queso extra y jamón
        pizza = new JamonDec(pizza);
        System.out.println(pizza.getDescripcion() + ", Precio: " + pizza.getPrecio());

        // Pizza con queso extra, jamón y champiñones
        pizza = new ChampiñonesDec(pizza);
        System.out.println(pizza.getDescripcion() + ", Precio: " + pizza.getPrecio());
    }
    
}
