package af_jb_e2;

//importo el util scanner que me servirá para leer del teclado
import java.util.Scanner; 


public class AF_JB_E2 {

    //Método para contar de 0 a un número dado por el usuario
    static void MostrarNumero(){
        
        //Inicializo un objeto de la clase Scanner y declaro dos variables tipo 
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
           System.out.println("Eres menor de edad");
       }
       else {
           System.out.println("Es usted mayor de edad");
       }
               
        
    }
    
                            
      

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        //Declaro una variable tipo entero para almacenar la opción de menú
        //La inicializo a 0 para que no falle el while
        int n = 0;
        
        //Mediante un while, hago que el menú vuelva a aparecer hasta que se
        //se elija la opción 3, salida.
        while (n!=3){
        //Menú para el usuario
        System.out.println("Elija una opción:");
        System.out.println("1. Mostrar numeros");
        System.out.println("2. Edad");
        System.out.println("3. Salir");
             
        n = leer.nextInt();
        
                
        //Mediante un switch hago un selector para el menú, que ejecutará un 
        //método según la elección del usuario
            switch (n){
        
                case 1:
                    MostrarNumero();
                    break;
            
                case 2:
                    Edad();
                    break;
        
            }
        }
    }
    
}
