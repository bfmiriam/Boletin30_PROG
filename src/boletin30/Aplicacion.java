
package boletin30;

import java.util.ArrayList;
import java.util.List;


public class Aplicacion {
    
    List <SeleccionFutbol> integrantes = new ArrayList();
    
    public void añadirIntegrantes(){
        
        SeleccionFutbol entrenador = new Entrenador(1212,111,"Alberto","Rodriguez Alvarez",22);
        SeleccionFutbol futbolista = new Futbolista(9,"Delantero",112,"Luis","Fernández Alonso",20);
        SeleccionFutbol masajista = new Masajista("Fisioterapia",5,117,"Alfredo","Cuña Estevez",32);
        SeleccionFutbol seleccionador = new Seleccionador(132,"Juan","Lopez Blanco",32);
        
        integrantes.add(entrenador);
        integrantes.add(futbolista);
        integrantes.add(masajista);
        integrantes.add(seleccionador);
    }
    public void mostrar(){
        for(SeleccionFutbol comp : integrantes){
            System.out.println(comp);
        }
    }
}
