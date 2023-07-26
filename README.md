"# JAVA-STRATEGY-PATTERN" 🚀
--------------------- 


![image](https://github.com/D-Perez85/JAVA-FACTORY-METHOD-PATTERN/assets/77124855/ed22828a-241f-4e7f-8125-bc296d7398dc)


Strategy es un patrón de diseño de comportamiento que te permite definir una familia de algoritmos, colocar cada uno de ellos en una clase separada y hacer sus objetos intercambiables.



## Problema
Un día decidiste crear una aplicación de navegación para viajeros ocasionales, la cual giraba alrededor de un bonito mapa que ayudaba a los usuarios a orientarse rápidamente en cualquier ciudad. Una de las funciones más solicitadas para la aplicación era la planificación automática de rutas, donde un usuario debía poder introducir una dirección y ver la ruta más rápida a ese destino mostrado en el mapa. 

La primera versión de la aplicación sólo podía generar las rutas sobre carreteras. Las personas que viajaban en coche estaban locas de alegría. Pero, aparentemente, no a todo el mundo le gusta conducir durante sus vacaciones. 

En la siguiente actualización añadiste una opción para crear rutas a pie. Después, añadiste otra opción para permitir a las personas utilizar el transporte público en sus rutas, esto era sólo el principio... 

Más tarde planeaste añadir la generación de rutas para ciclistas, y más tarde, otra opción para trazar rutas por todas las atracciones turísticas de una ciudad.
Aunque desde una perspectiva comercial la aplicación era un éxito, la parte técnica provocaba muchos dolores de cabeza. 

Cada vez que añadías un nuevo algoritmo de enrutamiento, la clase principal del navegador doblaba su tamaño. En cierto momento, la bestia se volvió demasiado difícil de mantener ya que cualquier cambio en alguno de los algoritmos, fuera un sencillo arreglo de un error o un ligero ajuste de la representación de la calle, afectaba a toda la clase, aumentando las probabilidades de crear un error en un código ya funcional.

El trabajo en equipo se volvió ineficiente: tus compañeros, contratados tras el exitoso lanzamiento, se quejaban de que dedicaban demasiado tiempo a resolver conflictos de integración. Implementar una nueva función te exige cambiar la misma clase enorme, entrando en conflicto con el código producido por otras personas.




## Solución

El patrón Strategy sugiere que tomes esa clase que hace algo específico de muchas formas diferentes y extraigas todos esos algoritmos para colocarlos en clases separadas llamadas estrategias.

La clase original, llamada contexto, debe tener un campo para almacenar una referencia a una de las estrategias, entonces el contexto delega el trabajo a un objeto de estrategia vinculado en lugar de ejecutarlo por su cuenta.

La clase contexto no es responsable de seleccionar un algoritmo adecuado para la tarea, en lugar de eso, el cliente pasa la estrategia deseada a la clase contexto.

La clase contexto no sabe mucho acerca de las estrategias, funciona con todas las estrategias a través de la misma interfaz genérica, que sólo expone un único método para disparar el algoritmo encapsulado dentro de la estrategia seleccionada.

De esta forma, el contexto se vuelve independiente de las estrategias concretas, así que puedes añadir nuevos algoritmos o modificar los existentes sin cambiar el código de la clase contexto o de otras estrategias.

![image](https://github.com/D-Perez85/JAVA-STRATEGY-PATTERN/assets/77124855/1bd37b28-ba64-4067-a3af-82ba22bc51c8)

En nuestra aplicación de navegación, cada algoritmo de enrutamiento puede extraerse y ponerse en su propia clase con un único método crearRuta. 

El método acepta un origen y un destino y devuelve una colección de puntos de control de la ruta. Incluso contando con los mismos argumentos, cada clase de enrutamiento puede crear una ruta diferente. 

A la clase navegadora principal no le importa qué algoritmo se selecciona ya que su labor principal es representar un grupo de puntos de control en el mapa. 

La clase tiene un método para cambiar la estrategia activa de enrutamiento, de modo que sus clientes, como los botones en la interfaz de usuario, pueden sustituir el comportamiento seleccionado de enrutamiento por otro.




## Analogía en el mundo real

Imagina que tienes que llegar al aeropuerto:

       ○    Puedes tomar el autobús.
       ○    Pedir un taxi.
       ○    Ir en bicicleta.


![image](https://github.com/D-Perez85/JAVA-STRATEGY-PATTERN/assets/77124855/fa9e915b-cc73-48a2-9d4b-2c874636176e)

Éstas son tus estrategias de transporte. Puedes elegir una, dependiendo de factores como presupuesto o límites de tiempo.



## Estructura

![image](https://github.com/D-Perez85/JAVA-STRATEGY-PATTERN/assets/77124855/86ca2e6f-8845-4e07-aff7-7c2a3468993c)




## Aplicabilidad

:pushpin: cuando quieras utilizar variantes de un algoritmo dentro de un objeto y poder cambiar de un algoritmo a otro durante el tiempo de ejecución.
Strategy permite alterar indirectamente el comportamiento del objeto en tiempo de ejecución asociándolo con distintos subobjetos que pueden realizar subtareas específicas de distintas maneras.

:pushpin: cuando tengas muchas clases similares que sólo se diferencien en la forma en que ejecutan cierto comportamiento. 
Strategy permite extraer comportamiento variante y ponerlo en una jerarquía de clases separada, combinar las clases originales en una, reduciendo el código duplicado.

:pushpin: para aislar la lógica de negocio de una clase, (detalles de implementación de algoritmos que pueden no ser tan importantes en el contexto de esa lógica).
 Strategy permite aislar el código, los datos internos y las dependencias, del resto del código. Los clientes obtienen una interfaz simple para ejecutar los algoritmos 
 y cambiarlos durante el tiempo de ejecución.

:pushpin: cuando tu clase tenga un enorme operador condicional que cambie entre distintas variantes del mismo algoritmo.
 Strategy permite suprimir dicho condicional extrayendo todos los algoritmos para ponerlos en clases separadas, las cuales implementan la misma interfaz. 
 El objeto original delega la ejecución a uno de esos objetos, en lugar de implementar todas las variantes del algoritmo.







## Cómo implementarlo


-    En la clase contexto, identifica un algoritmo que tienda a sufrir cambios frecuentes, puede ser un enorme condicional que seleccione y ejecute una variante del mismo algoritmo durante el tiempo de ejecución.
-    Declara la interfaz estrategia común a todas las variantes del algoritmo.
-    Uno a uno, extrae todos los algoritmos y ponlos en sus propias clases. Todas deben implementar la misma interfaz estrategia.
-    En la clase contexto añade un campo para almacenar una referencia a un objeto de estrategia y proporciona un modificador set para sustituir valores de ese campo. La clase contexto debe trabajar con el objeto de estrategia únicamente a través de la interfaz estrategia y la clase contexto puede definir una interfaz que permita a la estrategia acceder a sus datos.
-    Los clientes de la clase contexto deben asociarla con una estrategia adecuada que coincida con la forma en la que esperan que la clase contexto realice su trabajo principal.



## Pros y contras

•	 Puedes intercambiar algoritmos usados dentro de un objeto durante el tiempo de ejecución.

•	 Puedes aislar los detalles de implementación de un algoritmo del código que lo utiliza.

•	 Puedes sustituir la herencia por composición.

•	 Principio de abierto/cerrado. Puedes introducir nuevas estrategias sin tener que cambiar el contexto.

•	 Si tienes un par de algoritmos que raramente cambian no hay razón real para complicar el programa en exceso con nuevas clases e interfaces que vengan con el patrón.

•	 Los clientes deben conocer las diferencias entre estrategias para poder seleccionar la adecuada.

•	 Muchos lenguajes de programación modernos tienen un soporte de tipo funcional que te permite implementar distintas versiones de un algoritmo dentro de un grupo de funciones anónimas. Entonces puedes utilizar estas funciones exactamente como habrías utilizado los objetos de estrategia, pero sin saturar tu código con clases e interfaces adicionales.
 
 
 

## Relaciones con otros patrones
:heavy_check_mark:	Bridge, State, Strategy (y, hasta cierto punto, Adapter) tienen estructuras muy similares. De hecho, todos estos patrones se basan en la composición, que consiste en delegar trabajo a otros objetos. Sin embargo, todos ellos solucionan problemas diferentes. Un patrón no es simplemente una receta para estructurar tu código de una forma específica. También puede comunicar a otros desarrolladores el problema que resuelve.

:heavy_check_mark:	Command y Strategy pueden resultar similares porque puedes usar ambos para parametrizar un objeto con cierta acción. No obstante, tienen propósitos muy diferentes.

            •	 Puedes utilizar Command para convertir cualquier operación en un objeto. Los parámetros de la operación se convierten en campos de ese objeto. 
          
            •	 Strategy normalmente describe distintas formas de hacer lo mismo, permitiéndote intercambiar estos algoritmos dentro de una única clase contexto.

:heavy_check_mark:	Decorator te permite cambiar la piel de un objeto, mientras que Strategy te permite cambiar sus entrañas.

:heavy_check_mark:	Template Method se basa en la herencia: te permite alterar partes de un algoritmo extendiendo esas partes en subclases. Strategy se basa en la composición: puedes alterar partes del comportamiento del objeto suministrándole distintas estrategias que se correspondan con ese comportamiento. Template Method trabaja al nivel de la clase, por lo que es estático. Strategy trabaja al nivel del objeto, permitiéndote cambiar los comportamientos durante el tiempo de ejecución.

:heavy_check_mark:	State puede considerarse una extensión de Strategy. Ambos patrones se basan en la composición: cambian el comportamiento del contexto delegando parte del trabajo a objetos ayudantes. Strategy hace que estos objetos sean completamente independientes y no se conozcan entre sí. Sin embargo, State no restringe las dependencias entre estados concretos, permitiéndoles alterar el estado del contexto a voluntad.





## Comenzando 🚀

Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas.


### Instalación 🔧

### `Clonar` 
Clonar el proyecto utilizando git clone  dentro de tu entorno local para poder obtener el codigo fuente. 
```
git clone https://github.com/D-Perez85/JAVA-STRATEGY-PATTERN.git  
```
### `Instalar Intellij IDE`
Necesitas este framework para poder compilar los archivos de prueba
```
https://www.jetbrains.com/es-es/idea/download/?section=windows
```
### `Run`
Una vez instalado el frame podras correr la App para ver este patron en funcionamiento.  

![image](https://github.com/D-Perez85/JAVA-STRATEGY-PATTERN/assets/77124855/b82fc507-68c9-4c64-9892-cd945046b5f0)


Made with ❤️ by [Damian Perez](https://github.com/D-Perez85) 😊


