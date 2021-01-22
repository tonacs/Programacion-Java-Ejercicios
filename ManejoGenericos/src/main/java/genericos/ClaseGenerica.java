package genericos;

public class ClaseGenerica<T> {
    //Definimos la variable de tipo generico
    T objeto;
    
    //constructor que inicializa el tipo a utilizar
    public ClaseGenerica(T objeto){
        this.objeto=objeto;
        
    }
    public void obtenerTipo(){
        System.out.println("El tipo T es: "+ objeto.getClass().getSimpleName());
    }
}
