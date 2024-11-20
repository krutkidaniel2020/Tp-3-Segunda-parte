# Sistema de envios en una tienda en linea
Este sistema de envios para una tienda en linea implementa el patrón de diseño "Strategy" para la gestion de los diferentes métodos de envío, como puede ser un envio regular, expreso, o internacional. Permite que los clientes seleccionen entre estas opciones de envío al realizar una compra, cada una con costos y tiempos de entrega específicos.  

### Estructura del proyecto
Tienda (Contexto): Administra la estrategia de envío seleccionada y calcula costos y tiempos de entrega.  
Envio (Interfaz): Define los métodos comunes para todas las estrategias de envío.  

Estrategias concretas:
- EnvioRegular: Entrega en 5-7 días con tarifa estándar por kilogramo.
- EnvioExpreso: Entrega rápida en 1-2 días con un costo más alto por kilogramo.
- EnvioInternacional: Envío global con una tarifa base más un costo por kilogramo, entrega en 7-14 días.