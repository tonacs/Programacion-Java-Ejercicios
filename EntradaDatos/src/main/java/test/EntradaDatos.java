package test;

import java.util.*;

public class EntradaDatos {

    public static void main(String[] args) {
        String captura = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un dato: ");
        captura = scanner.nextLine();

        while (!"salir".equals(captura)) {
            System.out.println("El dato introducido " + captura);
            captura=scanner.nextLine();

        }
    }
}
