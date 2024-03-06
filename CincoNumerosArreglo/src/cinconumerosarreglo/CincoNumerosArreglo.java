
package cinconumerosarreglo;
//Libreria del scanner 
import java.util.Scanner;


public class CincoNumerosArreglo {

    //variable con la cual se define el tamaño
    static int n = 5,suma;
    //Declaracion del arreglo
   static int []miArreglo;
   static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
   
         System.out.println("Bienvenido al programa donde dberas ingresar 5 numeros");
         llenado();
         impresion();
    }
   
     //Metodo con el cual se realiza el llenado del arreglo
     public static void llenado()
    {
        //Aqui se asigna el tamaño al arreglo
        miArreglo = new int [n];
        //Proceso de llenado del arreglo
        System.out.println("a continuacion ingrese cada uno de sus datos");
        
        for(int i=0; i<n; i++)
        {
            System.out.println("Ingrese el valor deseado en la posicion : "+i);
            //Codigo con el cual se ingresaran los valores del usuario
            miArreglo[i]= leer.nextInt();
           suma = suma + miArreglo[i];
        }
   
    }
       public static void impresion()
    {
        System.out.println("");
        System.out.println("Mostraremos sus datos ingresados");
      //Ciclo con el cual se mostraran los datos del arreglo
      for(int i=0;i<miArreglo.length;i++)  
      {
          //Mensaje con el cual se mostraran los valores dentro del arreglo
         System.out.println(" Elemento en indice " + i + ": " + miArreglo[i]);  
      }//Llave del ciclo for
        System.out.println("");
        System.out.println("La suma de sus numeros es :" +suma);
      
    }//Llave del metodo de impresion 
}
