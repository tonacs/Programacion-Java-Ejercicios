package test;

import java.util.Scanner;
import static calculadora.Operaciones.suma;
public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Proporciona el primer valor: ");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("Proporciona el segundo valor: ");
        int b=scanner.nextInt();
        int resultado=suma(a,b);
        System.out.println("El reusltado de la suma es: " + resultado);
    }
}
