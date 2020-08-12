/*
Ejercicio:
Imprimir los números del 1 al 10 uno abajo del otro      

Solucion:
Se define que la clase reciba 2 variables y que loope segun lo que se pidio de a 2

Author: Dz2042
Fecha: 2020-08-05

*/
package laboratorioclase3;

public class Ejercicio2 {
   public static void main(int nro1, int nro2) {
       int multi = 0;
       //Imprimo ejercicio
       String linea = "---------------------------------";
       System.out.println(linea);
       System.out.println("       Ejercicio 2");
       System.out.println(linea);
       //Imprimo variables recibidas
        System.out.println("Desde = " + nro1);
        System.out.println("Iteraciones = " + nro2);
        
        //Logica
        int iteracion, i = 0;
        for(iteracion = 1; iteracion <= (nro2 * 2); iteracion = iteracion + 2){
            i++;
            System.out.println("Iteracion " + i + " - Valor: " + (nro1 + iteracion));
        }
           
           
   }   
}
