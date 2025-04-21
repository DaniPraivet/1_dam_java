package Unidad12.practicaEvaluable1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    /*
  _____              _      _   _____           _      _                        _____
 |  __ \            (_)    | | |  __ \         | |    (_)                      |  __ \
 | |  | | __ _ _ __  _  ___| | | |__) |___   __| |_ __ _  __ _ _   _  ___ ____ | |__) |__ _ __ ___ ____
 | |  | |/ _` | '_ \| |/ _ \ | |  _  // _ \ / _` | '__| |/ _` | | | |/ _ \_  / |  ___/ _ \ '__/ _ \_  /
 | |__| | (_| | | | | |  __/ | | | \ \ (_) | (_| | |  | | (_| | |_| |  __// /  | |  |  __/ | |  __// /
 |_____/ \__,_|_| |_|_|\___|_| |_|  \_\___/ \__,_|_|  |_|\__, |\__,_|\___/___| |_|   \___|_|  \___/___|
                                                          __/ |
                                                         |___/
     */
    public static void main(String[] args) {
        /*
        - Cada apartado se debe realizar en una función llamada desde el método principal. El método principal no muestra un menú, sino que lo hace de forma secuencial tal y como lo hemos hecho en clase.

        - Las funciones implementadas deben estar parametrizadas lo suficiente como para permitir refactorización y aprovechamiento de código.
        - Penalizaciones:    - 0.2 puntos en cada variable, clase, instancia o función no siguiendo notación CamelCase
        - Penalización por no optimización, código repetido, no refactorización o aprovechamiento de funciones , aunque funcionen correctamente => hasta 3 puntos.
         */

        System.out.println("1. Generar números");
        Collection<Integer> lista = generarlista(100);
        mostrarLista(lista);

        System.out.println("2. Eliminar los elementos que valen 5.");
        eliminarElementosDeValor5(lista);
        mostrarLista(lista);

        System.out.println("3. Eliminar impares.");
        eliminarElementosImpares(lista);
        mostrarLista(lista);

        System.out.println("4. Añadir elementos de otra colección.");
        fusionarDosListas(lista, generarlista(30));
        mostrarLista(lista);




    }

    // 1) Implementar una aplicación donde se insertan 100 números enteros aleatorios entre 1 y 10(incluidos), que pueden estar repetidos, en una colección  => 1.5 puntos
    public static Collection<Integer> generarlista(int cantidad) {
        Collection<Integer> coleccionNumeros = new ArrayList<>();
        int limite = 10;
        for (int i = 0; i < cantidad; i++) {
            coleccionNumeros.add((int) (Math.random() * limite) + 1);
        }
        return coleccionNumeros;
    }

    // 2) Después, se eliminan todos los elementos que valen 5 mediante el uso de un Iterador. => 2 puntos
    public static void eliminarElementosDeValor5(Collection<Integer> argsLista) {
        Iterator<Integer> iterador = argsLista.iterator();

        while (iterador.hasNext()) {
            if (iterador.next() == 5) iterador.remove();
        }
    }

    // 3) Eliminar de la colección resultante del apartado 2 los elementos impares => 2 puntos
    public static void eliminarElementosImpares(Collection<Integer> argsLista) {
        argsLista.removeIf(numero -> (numero % 2) == 1);
    }

    // 4) Añadir todos los elementos de otra colección nueva de 30 enteros aleatorios entre 1 y 10(incluidos) => 2 puntos
    public static void fusionarDosListas(Collection<Integer> argsLista, Collection<Integer> listaAFusionar) {
        argsLista.addAll(listaAFusionar);
    }

    // 5) Mostrar la colección antes y después de la eliminación. => 1.5 puntos
    public static void mostrarLista(Collection<Integer> argsLista) {
        System.out.println("\tLista actual: \n\t\t" + argsLista);
        System.out.println("\tTamaño de la lista actualmente: " + argsLista.size() + "\n\n");
    }
}
