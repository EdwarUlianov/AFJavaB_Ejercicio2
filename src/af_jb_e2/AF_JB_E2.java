package af_jb_e2;

//importo el util scanner que me servirá para leer del teclado
import java.util.Scanner; 


public class AF_JB_E2 {

    //Método para contar de 0 a un número dado por el usuario
    static void MostrarNumero(){
        
        //Inicializo un objeto del tipo Scanner y declaro dos variables tipo 
        //entero
        Scanner leer = new Scanner(System.in);
        int n;
        int i;
        
        //Pido un número al usuario y lo almaceno en n
        System.out.println("Introduza un numero");
        n = leer.nextInt();
        
        //Creo una rutina con for que inicializa i a cero y lo va incrementando
        //hasta llegar a n
        for (i=0; i<n; i++){
            System.out.println(i);
        }
                            
        
    }

    public static void main(String[] args) {


    }
    
}
