
package Principal;


public class Vector {
    
    //Cargar el vector de forma aleatoria
    public static void cargaAleatoria(int A[]){
    
        for(int i = 0; i < A.length; i++){
            
            A[i] = (int)( Math.random()*101 );
        }
    }
    
    //Mostrar el vector
    public static void mostrar(int[] A){
    
        System.out.println();
        
        for(int i: A){
                
            System.out.print( i + " ");
        }
        
        System.out.println();
    }
    
 //Fin de Clase   
}
