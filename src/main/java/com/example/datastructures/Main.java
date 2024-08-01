package com.example.datastructures;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



/* *************************************************************************************


                                ESTRUCTURAS DE DATOS


/* **************************************************************************************/


/**************************  Estructuras de Datos en Java    ******************************/
     /*
    Estructuras de Datos en Java

        Clases:
            - ArrayList: Implementación de la interfaz List basada en un array dinámico.
            - LinkedList: Implementación de la interfaz List basada en una lista enlazada.
            - HashSet: Implementación de la interfaz Set basada en una tabla hash.
            - LinkedHashSet: Implementación de la interfaz Set que mantiene el orden de inserción, basada en una tabla hash y una lista doblemente enlazada.
            - TreeSet: Implementación de la interfaz Set basada en un árbol rojo-negro que mantiene los elementos ordenados.
            - PriorityQueue: Implementación de la interfaz Queue que proporciona una cola de prioridad basada en una heap.
            - LinkedList: También puede funcionar como una implementación de la interfaz Queue.
            - HashMap: Implementación de la interfaz Map basada en una tabla hash.
            - LinkedHashMap: Implementación de la interfaz Map que mantiene el orden de inserción, basada en una tabla hash y una lista doblemente enlazada.
            - TreeMap: Implementación de la interfaz Map basada en un árbol rojo-negro que mantiene los elementos ordenados.
            - ArrayDeque: Implementación de la interfaz Deque que proporciona una cola de doble extremo basada en un array dinámico.

        Interfaces:
            - List: Define una colección ordenada de elementos accesibles por índice.
            - Deque: Define una cola de doble extremo, con operaciones en ambos extremos.
            - Set: Define una colección que no permite elementos duplicados.
            - SortedSet: Extiende Set y define una colección ordenada de manera natural o según un comparador.
            - NavigableSet: Extiende SortedSet y proporciona operaciones de navegación adicional sobre el conjunto.
            - Queue: Define una colección diseñada para manipulación de elementos en una secuencia FIFO (primero en entrar, primero en salir).
            - Map: Define una colección de pares clave-valor, con cada clave asociada a un valor.
            - SortedMap: Extiende Map y define un mapa cuyas claves están ordenadas.
            - NavigableMap: Extiende SortedMap y proporciona operaciones de navegación adicional sobre el mapa.
     */


/*********************************************************************************************************/





        /**********************      ARRAYS          ******************************/


    /*
       En programación, una **estructura de datos** es una forma de organizar y almacenar datos
       en una computadora para que puedan ser utilizados de manera eficiente. Se trata de un formato
       específico que permite manejar, almacenar, y organizar información, facilitando la realización
       de operaciones como inserción, eliminación, búsqueda y actualización.


        Ejemplos comunes de estructuras de datos** incluyen arreglos, listas, pilas, colas, conjuntos
        y mapas. Cada una tiene características y ventajas distintas, adaptadas a diferentes necesidades
        y tipos de problemas.
     */


        // Arreglos (Arrays)
        // En matematicas matriz o conjunto
        // Estructura básica para almacenar elementos del mismo tipo en un bloque contiguo de memoria.

        //Resumen colección ordenada por indices de un mismo tipo de datos


        int[] array = new int[5]; /* Crear un arreglo de enteros con tamaño 5 */


        array[0] = 10;
        array[1] = 20;

        // System.out.println(array[0]);           /* Imprime 10 */
        // System.out.println(array.length);           /* va contar los elementos de array*/


        String[] nombresArray = new String[5];

        String[] nombresArray2 = new String[3];

        String[] nombresArray3 = {"Laura", "Camilo"}; /* Inicializa el arreglo con valores directamente */

        String[] nombresArray4 = new String[3]; /* Crea un arreglo de 3 elementos (inicialmente null) */

        /* No se asigna un nuevo arreglo, solo se llenan los valores en el arreglo existente */
        nombresArray4[0] = "Laura";
        nombresArray4[1] = "Camilo";


        String[] hola = {"hola"};






        /******************************      LinkedList         ******************************/


        // Lista doblemente enlazada que permite una inserción y eliminación
        // eficiente en cualquier posición.


     /*
        Es una estructura de datos que no guarda la información de forma consecutiva en
        memoria, sino que utiliza un puntero. Por ejemplo, en una lista enlazada (LinkedList),
        cada elemento apunta al siguiente. En comparación, un array sería como tener una hoja
        con todos los estudiantes de un aula; la LinkedList sería como decirle al primer estudiante
        que llame al siguiente, y ese a otro, y así sucesivamente. Por eso, es menos eficiente
        para obtener elementos en una LinkedList en comparación con un array.
    */

        LinkedList<String> nombreLista = new LinkedList<>(); /* Crear una lista doblemente enlazada */
        nombreLista.add("Java");
        nombreLista.add("Python");
       // System.out.println(nombreLista.getFirst());      /* Imprime "Java" */



        // Eficiencia de LinkedList
        /*
            Eficiencia de LinkedList:

            - Acceso: Ineficiente para obtener elementos, ya que se requiere recorrer la lista desde el
              principio (o el final, en una lista doblemente enlazada) para llegar al índice deseado.

            - Eliminación: Eficiente para eliminar elementos, especialmente si se realiza en los extremos
              de la lista o si se tiene una referencia al nodo correspondiente. La eliminación en cualquier
              otra posición puede ser menos eficiente debido a la necesidad de recorrer la lista para encontrar
              el nodo a eliminar.

            - Adición: Eficiente para añadir elementos, especialmente si se realiza al principio o al final
              de la lista. La adición en cualquier otra posición requiere recorrer la lista para encontrar
              el lugar adecuado, pero una vez en la posición correcta, la operación es eficiente.
*/



      //  Métodos de LinkedList en Java
/*
    Métodos de LinkedList en Java

    Adición de Elementos
    - add(E e) - Añade el elemento al final de la lista.
    - add(int index, E element) - Inserta el elemento en la posición especificada.
    - addFirst(E e) - Añade el elemento al principio de la lista.
    - addLast(E e) - Añade el elemento al final de la lista.

    Acceso y Búsqueda
    - get(int index) - Obtiene el elemento en la posición especificada.
    - getFirst() - Obtiene el primer elemento de la lista.
    - getLast() - Obtiene el último elemento de la lista.
    - indexOf(Object o) - Devuelve el índice de la primera aparición del elemento especificado.
    - lastIndexOf(Object o) - Devuelve el índice de la última aparición del elemento especificado.

    Eliminación de Elementos
    - remove(int index) - Elimina el elemento en la posición especificada.
    - remove(Object o) - Elimina la primera aparición del elemento especificado.
    - removeFirst() - Elimina el primer elemento de la lista.
    - removeLast() - Elimina el último elemento de la lista.
    - clear() - Elimina todos los elementos de la lista.

    Modificación
    - set(int index, E element) - Reemplaza el elemento en la posición especificada con el elemento dado.

    Otras Operaciones
    - size() - Devuelve el número de elementos en la lista.
    - isEmpty() - Verifica si la lista está vacía.
    - contains(Object o) - Verifica si la lista contiene el elemento especificado.
    - toArray() - Convierte la lista en un arreglo.
    - addAll(Collection<? extends E> c) - Añade todos los elementos de la colección especificada a la lista.
    - removeAll(Collection<?> c) - Elimina de la lista todos los elementos que están en la colección especificada.
    - retainAll(Collection<?> c) - Retiene solo los elementos que están en la colección especificada.

    Iteración
    - iterator() - Devuelve un iterador sobre los elementos de la lista.
    - listIterator() - Devuelve una lista iteradora sobre los elementos de la lista.
    - forEach(Consumer<? super E> action) - Aplica la acción especificada a cada elemento de la lista.
*/




/*************************************************************************************************/





/************************  Preferencia por Interfaces en Lugar de Clases Concretas  **************************/


    /*    List<String> nombres7 = new LinkedList<>()     /  LinkedList<String> nombres8 = new LinkedList<>();  */



/*
 1. Uso de Interfaces (`List<String>`):
   - Ofrece flexibilidad para cambiar la implementación subyacente sin modificar el código que utiliza la variable.
   - Permite cambiar la implementación de la lista (por ejemplo, de `LinkedList` a `ArrayList`) fácilmente.
                */

   // Ejemplo:
   // Declaración utilizando la interfaz List
   List<String> nombres7 = new LinkedList<>();
   nombres7.add("Juan");
   nombres7.add("Ana");

   // Cambiar la implementación a ArrayList sin modificar el código que usa la lista
   nombres7 = new ArrayList<>();
   nombres7.add("Luis");
   nombres7.add("Maria");

/*
  2. Uso de Clases Concretas (`LinkedList<String>`):
   - Está acoplado a una implementación específica, lo que puede limitar la flexibilidad.
   - Requiere cambios en la declaración de la variable y posiblemente en el código que interactúa con ella si decides cambiar la implementación.
*/


 //  Ejemplo:
   // Declaración utilizando la clase concreta LinkedList
   LinkedList<String> nombres8 = new LinkedList<>();
   nombres8.add("Juan");
   nombres8.add("Ana");

   // Para cambiar a ArrayList, necesitarías modificar la declaración
   ArrayList<String> nombres9 = new ArrayList<>();
   nombres9.add("Luis");
   nombres9.add("Maria");

  /*
     El uso de interfaces sigue el principio de programación orientada a interfaces, lo que promueve
     un diseño de código más limpio y modular. Al programar contra interfaces en lugar de implementaciones
     concretas, se mejora la mantenibilidad y la flexibilidad del código.
 */

    }

}