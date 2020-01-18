/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodoscalificaciones;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jean Castillo
 */
public class Nodo {
    
    public int id;
    public String nombre;
    public Date fechaEntrega;
    public int ponderacion;
    public float nota;
    public double promedio;
    public ArrayList<Nodo> hijos = new ArrayList<Nodo>();
    
    String tabs = "";
    public void imprimirNombres(Nodo actual){
        System.out.println(tabs + actual.nombre);
        if(actual.hijos.isEmpty()){
            tabs += "";
        }
        else{
            tabs += "   ";
        }
        for(int indice = 0; indice < actual.hijos.size() ; indice++){
            imprimirNombres(actual.hijos.get(indice));  
        }
    }
    
    public float calcularPromedio(Nodo actual){
        
        if(actual.hijos.isEmpty()){
            float nota = (actual.nota * actual.ponderacion) / 100;
            return nota;
        }
        
        
        float promedio = 0;
        for(int index=0; index < actual.hijos.size(); index++){
            promedio += calcularPromedio(actual.hijos.get(index));
            if(actual.nota == 0.0 && actual.hijos.get(index).nota > 0.0){
                float nota = (actual.hijos.get(index).nota * actual.ponderacion) / 100;
                return nota;
            }
        }
        return promedio;
    }
}
