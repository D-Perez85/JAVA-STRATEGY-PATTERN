### Patrón Strategy:  medio de pago

Supongamos que estamos diseñando una tienda online y queremos que acepte distintos medios de pago (tarjeta de crédito, Paypal, Bitcoin, etc). 

Veamos el diagrama UML a seguir (no vamos a escribir los constructores de las clases).

![image](https://github.com/D-Perez85/JAVA-STRATEGY-PATTERN/assets/77124855/713f24b0-34e0-4ecc-b74a-cef4ee0fba50)


En este ejemplo simplificado podemos utilizar un objeto Tienda, setear la forma de pago y efectuar el pago.

La lógica del pago estará, entonces, en cada forma de pago y no en la tienda, separando y facilitando el algoritmo.

Para agregar una nueva forma de pago debería solamente hacer una nueva clase que implemente StrategyPago.
