/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodoscalificaciones;

/**
 *
 * @author Jean Castillo
 */
public class NodosCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo raiz = new Nodo();
        
        raiz.nombre = "Fase Teorica";
        
        Nodo n1 = new Nodo();
        
        n1.nombre = "Parcial 1";
        n1.ponderacion = 50;
        
        raiz.hijos.add(n1);
        
        Nodo n2 = new Nodo();
        
        n2.nombre = "Formativo";
        n2.ponderacion = 70;
        
        Nodo n3 = new Nodo();
        
        n3.nombre = "Sumativo";
        n3.ponderacion = 30;
        
        n1.hijos.add(n2);
        
        n1.hijos.add(n3);
        
        
        Nodo n4 = new Nodo();
       
        n4.nombre = "Vinculacion";
        n4.ponderacion = 25;
        
        Nodo n5 = new Nodo();
        
        n5.nombre = "Autonomo";
        n5.ponderacion = 25;
        
        Nodo n6 = new Nodo();
        
        n6.nombre = "Investigacion";
        n6.ponderacion = 25;
        
        Nodo n7 = new Nodo();
        
        n7.nombre = "Evaluacion";
        n7.ponderacion = 25;
        
        n2.hijos.add(n4);
        n2.hijos.add(n5);
        n2.hijos.add(n6);
        n2.hijos.add(n7);
        
        Nodo n8 = new Nodo();
        
        n8.nombre = "Examen";
        n8.nota = 85;
        n8.ponderacion = 100;

        
        Nodo n9 = new Nodo();

        n9.nombre = "Recuperacion";
        
        Nodo n10 = new Nodo();
        
        n10.nombre = "N1";
        n10.nota = 70;
        n10.ponderacion = 50;
        
        Nodo n11 = new Nodo();

        n11.nombre = "N2";
        n11.nota = 85;
        n11.ponderacion = 50;

        n4.hijos.add(n10);
        n4.hijos.add(n11);

        Nodo n12 = new Nodo();

        n12.nombre = "N1";
        n12.nota = 80;
        n12.ponderacion = 100;
        
        n5.hijos.add(n12) ;
        
        Nodo n13 = new Nodo();

        n13.nombre = "N1";
        n13.nota = 80;
        n13.ponderacion = 100;

        n6.hijos.add(n13) ;

        Nodo n14 = new Nodo();
        n14.nombre = "N1";
        n14.nota = 80;
        n14.ponderacion = 50;

        Nodo n15 = new Nodo();
        n15.nombre = "N2";
        n15.nota = 80;
        n15.ponderacion = 50;

        n7.hijos.add(n14);
        n7.hijos.add(n15);
        
        raiz.imprimirNombres(n2);    
        System.out.println(raiz.calcularPromedio(n1));

    }
    
}
