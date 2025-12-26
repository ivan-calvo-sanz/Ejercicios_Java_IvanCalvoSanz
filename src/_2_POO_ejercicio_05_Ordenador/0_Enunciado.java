// https://www.youtube.com/watch?v=TdGcQiTMjsQ&list=PLaxZkGlLWHGX3nqyjMv0wjFHkhCpNxaf4&index=71
/**
Crea una clase que represente a un ordenador. Un ordenador se define por:
- Marca
- Modelo
- GB de RAM (Por defecto, 4GB)
- Capacidad disco Duro en GB (Por defecto, 50GB)
- Espacio utilizado en el disco duro
- Estar o no encendido (por defecto esta apagado)

La RAM debe ser potencia de 2, de lo contrario lanzaremos una excepcion. Encapsula todos los atributos. 
Tendra los siguientes constructores:
- Vacio
- Solo pidiendo la RAM
- Solo pidiendo la RAM y la capacidad del disco duro
- Pidiendo todos los atributos excepto el espacio utilizado y encendido

Las operaciones que podra realizar son:
- encender: Enciende el ordenador, haciendo que el atributo encendido este a true
- apagar: Enciende el ordenador, haciendo que el atributo encendido este a false
- transferir archivos: dado un numero de GB, se aumenta el espacio utilizado. Si no cabe, se debera indicar. 
Solo se podra hacer si el ordenador esta encendido.
- eliminar archivos: dado un numero de GB, se elimina el espacio indicado, si supera al espacio utilizado se quedara en 0. 
Solo se podra hacer si el ordenador esta encendido.

Un ordenador es igual a otro cuando tienen la misma marca y modelo.
Muestra la informacion con toString
 */
