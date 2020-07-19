
package Burbuja;

import Principal.Vector;

public class Burbuja_Clasica{

    public static void main(String[] args){
        
        //Mejor Caso:
            //int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        //Peor Caso:
            //int[] arreglo = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        //RANDOM
            int[] arreglo = new int[10]; Vector.cargaAleatoria(arreglo);
        
            
        System.out.print("DESORDENADO: ");
        
            Vector.mostrar(arreglo);
        
        System.out.print("\nORDENADO: ");
        
            Burbuja(arreglo);

            Vector.mostrar(arreglo);

     //Fin de Programa
    }

    //BURBUJA CLASICA -----------------------------------------------------------------------------------------------
    private static void Burbuja(int[] A){

        int N = 0;//Cantidad de Comparaciones
        int M = 0;//Cantidad de Intercambios
        // ---------------------------------------
        
        int AUX;
        
        for(int i = 0; i < A.length; i++){
        
            for(int j = 0; j < A.length - 1; j++){
            
                N++;
                
                if(A[j] > A[j+1]){
                    
                    M++;
                
                    AUX = A[j];
                    A[j] = A[j+1];
                    A[j+1] = AUX;
                }
            }
        }
        
        System.out.print(" Comparaciones: " + N + " - Intercambios: " + M);
    }
    

 //Fin de Clase
}
