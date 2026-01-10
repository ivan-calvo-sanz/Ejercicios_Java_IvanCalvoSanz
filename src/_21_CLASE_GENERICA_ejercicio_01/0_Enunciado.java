package _21_CLASE_GENERICA_ejercicio_01;

// https://www.youtube.com/watch?v=rtHOpAXF1Kc&list=PLaxZkGlLWHGX3nqyjMv0wjFHkhCpNxaf4&index=95
/**
CREA UNA CLASE GENERICA Lista
- elementos
- numElementos
El atributo elementos puede ser cualquier tipo que le indiquemos. 
Tendremos un constructor donde le pasaremos el tamaño que queremos del array, debe ser positivo.

CREA UNA INTERFAZ Listable
- posicion(): le pasamos un elemento T y devolvera un numero
- anadir(): le pasamos un elemento T y devolvera un booleano
- tamano(): sin parametros y devolvera un numero
- eliminar(): le pasamos un elemento T y devolvera un booleano
- listar(): sin parametros y no devuelve nada
- vaciar(): sin parametros y no devuelve nada

Implementala en la clase Lista
- posicion(): dado un elemento, indica en que indice esta, sino existe, devolvemos un -1
- anadir: añade un elemento al array, siempre y cuando haya espacio. No se admiten repetidos. True si lo añade y false sino lo hace
- tamano: devuelve el numero de elementos que hay
- eliminar: elimina el elemento que le pasemos. True si lo elimina y false sino lo hace.
- listar: muestra los elementos que tenemos
- vaciar: reinicia el array al tamaño original
 */
