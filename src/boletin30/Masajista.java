
package boletin30;


public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private int anosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, int anosExperiencia) {
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public Masajista(String titulacion, int anosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista--> "+super.toString() + " titulacion: " + titulacion + ", anosExperiencia: " + anosExperiencia;
    }
    public void darMasaje(){
        System.out.println("Da masaxes o masaxista");
    }
    @Override
    public void concentrarse() {
        System.out.println("Concéntrase o masaxista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaxa o masaxista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena o masaxista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Xoga o masaxista");
    }
    
}
