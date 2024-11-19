# Sistema de Pizzería - Patrón Decorator
Este sistema permite a los clientes personalizar sus pizzas de manera dinámica utilizando el patrón de diseño Decorator. Comienza con una pizza básica a la que se pueden añadir complementos como queso extra, jamón y champiñones. Cada complemento agrega un costo adicional, y el sistema calcula automáticamente el precio final de la pizza en función de los ingredientes seleccionados.

### Estructura del proyecto:
Pizza: Interfaz base que define los métodos comunes para las pizzas y sus decoradores.  
PizzaBasico: Implementación concreta de una pizza básica.  
PizzaDecorator: Decorator base para la implementación de decoradores. Esta clase delega todas las operaciones al objeto envuelto.

Decoradores concretos:  
* QuesoExtraDec: Agrega queso extra.
* JamonDec: Agrega jamón.
* ChampiñonesDec: Agrega champiñones.