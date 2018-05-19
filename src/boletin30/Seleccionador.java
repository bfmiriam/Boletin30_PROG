
package boletin30;


public class Seleccionador extends SeleccionFutbol{

    public Seleccionador() {
    }

    public Seleccionador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    @Override
    public String toString() {
        return "Seleccionador--> " + super.toString();
    }
    
    
    public void seleccionarXogador(){
        System.out.println("O seleccionador selecciona xogador");
    }
    @Override
    public void concentrarse() {
        System.out.println("Concéntrase o seleccionador");
    }

    @Override
    public void viajar() {
        System.out.println(" Viaxa o seleccionador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena o seleccionador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Xoga o seleccionador");
    }

    
}
