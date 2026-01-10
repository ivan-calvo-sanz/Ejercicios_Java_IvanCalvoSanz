package _20_POO_ejercicio_08_Interface_Prestable;

// https://www.youtube.com/watch?v=zXp7jL6cX0c&list=PLaxZkGlLWHGX3nqyjMv0wjFHkhCpNxaf4&index=90
/**
CREA UNA INTERFAZ Prestable:
Tendrá los siguientes métodos:
- prestar
- devolver

CREA LA CLASE VideoJuego que implemente esta interfaz.
Se define por:
- nombre
- precio
- prestado
- vecesPrestado
Encapsula los atributos nombre y precio. Crea un constructor que pida nombre y precio. 
Las operaciones que debe realizar son:
- prestar: pone prestado a true, solo se puede prestar si esta disponible. El atributo vecesPrestado aumentará en uno.
- devolver: pone prestado a false, solo se puede devolver si esta prestado.

CREA LA CLASE Prestamo que implemente la interfaz Prestable.
Se define por los siguientes atributos:
- cantidad
- adeudo
- titular
Encapsula los atributos cantidad y titular. 
Crea un constructor que pida la cantidad y el titular. 
Las operaciones que debe realizar son:
- prestar: presta el valor del atributo cantidad al titular, mostrará un mensaje indicándolo. Incrementa el adeudo con un 5% de interés.
- devolver: devuelve el valor del atributo cantidad al titular, mostrará un mensaje indicándolo. El adeudo se reducirá, el adeudo no puede ser negativo, por lo que se quedara en cero en ese caso.
 */
