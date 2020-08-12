/*
Ejercicio:
Imprimir los números del 1 al 10 uno abajo del otro      

Solucion:
Se define que la clase reciba 2 variables y que loope segun lo que se pidio

Author: Dz2042
Fecha: 2020-08-05

*/
package laboratorioclase3;

public class Ejercicio1 {
    public static void main(int nro1, int nro2) {
        //Imprimo Ejercicio
        String linea = "---------------------------------";
        System.out.println(linea);
        System.out.println("       Ejercicio 1");
        System.out.println(linea);
        
        //Imprimo variables recibidas
        System.out.println("Desde = " + nro1);
        System.out.println("Iteraciones = " + nro2);
        
        //Logica
        int iteracion;
        
        for(iteracion = 1; iteracion <= nro2; iteracion++){
            System.out.println("Iteracion " + iteracion + " - Valor: " + (nro1 + iteracion));
        }
                
        
        //No lleva llaves ya que la logica del if es una sola linea
    }
            
}
