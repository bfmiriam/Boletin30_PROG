
package boletin30;


public class Entrenador extends SeleccionFutbol{
    
    private int idFederacion;
    
    public Entrenador() {
    }

    public Entrenador(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador--> "+super.toString() + "idFederacion: " + idFederacion;
    }

    public void planificarEntrenamiento(){
        System.out.println("El entrenador planifica el entrenamiento");
    }

    @Override
    public void concentrarse() {
        System.out.println("Se concentra el entrenador");
    }

    @Override
    public void viajar() {
        System.out.println("viaja el entrenador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el entrenador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega el entrenador");
    }
    
}
