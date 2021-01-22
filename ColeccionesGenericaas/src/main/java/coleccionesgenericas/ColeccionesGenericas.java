package coleccionesgenericas;

import java.util.*;

public class ColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList();
        miLista.add("Juan");
        miLista.add("Pepe");
        miLista.add("Pablo");
        miLista.add("Pablo");
        imprimir(miLista);

        Set<String> miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("200");
        imprimir(miSet);

        Map<String, String> miMap = new HashMap();
        miMap.put("1", "Juan");
        miMap.put("2", "Pepe");
        miMap.put("3", "Pablo");
        imprimir(miMap.keySet());
        imprimir(miMap.values());

    }

    private static void imprimir(Collection<String> col) {
        for (String elemento : col) {
            System.out.println("Elemento: " + elemento);
        }
        System.out.println("");
    }
}
