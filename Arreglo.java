/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrelos_lab;

/**
 *
 * @author Gabriel
 */
public class Arreglo {
    
    //a)MÃ©todo sumarLista que reciba por parÃ¡metro un arreglo unidimensional de 
    //enteros y muestre por pantalla la suma y promedio de los mismos.
    public static void sumarLista(int arreglo[]) {
        
        int suma=0;
        double promedio;
        
        for (int i=0; i<arreglo.length; i++) {
            suma += arreglo[i];
        }
        promedio = suma / arreglo.length;
        
        System.out.println("Suma de los numeros ingresados: " + suma);
        System.out.println("Promedio: " + promedio);
        
        //for (int enteros: arreglo) {
            //suma += enteros;
        //}
    }
    
    //b) MÃ©todo buscarMayor que reciba por parÃ¡metro un arreglo bidimensional e 
    //irregular de enteros y retorne el entero mÃ¡s grande que se encuentra en el arreglo.
    public static void buscarMayor(int arreglo2[][]) {
        
        int mayor = arreglo2[0][0];
        
        for (int i=0; i<arreglo2.length; i++) {
            for (int j=0; j<arreglo2[i].length; j++) {
                if (arreglo2[i][j] > mayor) {
                    mayor = arreglo2[i][j];
                }
            }
        }
        System.out.println("El mayor numero del arreglo irregular es: " + mayor);
        
    }
    
}
