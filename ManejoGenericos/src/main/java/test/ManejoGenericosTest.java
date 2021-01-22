package test;

import genericos.ClaseGenerica;

public class ManejoGenericosTest {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt=new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString=new ClaseGenerica("Hola mundo");
        objetoString.obtenerTipo();
        
        //No es posible utilizar tipos primitivos en clases genéricas
        //ClaseGenerica<int> objetoInt=new ClaseGenerica(15);
        
        
    }
}
