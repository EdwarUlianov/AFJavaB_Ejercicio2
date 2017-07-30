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
        for (i=0; i<=n; i++){
            System.out.println(i);
        }
    }
        
    //Creo el método Edad que me dirá si el usuario es mayor o menor de edad
    static void Edad(){
       
//Inicializo un objeto del tipo Scanner
       Scanner leer = new Scanner(System.in);
       int n;
       
       //Pido la edad al usuario y la almeceno en n
       System.out.println("Introduzca su edad");
       n = leer.nextInt();
       
       //Compruebo si es menor de edad y se lo comunico usando para ello el
       //condicional if
       if (n<18){
           System.out.println("Eres menos de edad");
       }
       else {
           System.out.println("Es usted mayor de edad");
       }
               
        
    }
    
                            
        
    

    public static void main(String[] args) {
        
        //Lamo al método MostrarNumero
        MostrarNumero();
        Edad();

    }
    
}