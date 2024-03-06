
package busquedasecuencial;

import java.util.Scanner;

public class BusquedaSecuencial {
//Esto le permitira al usuario poder ingresar los valores deseados
   static Scanner leer = new Scanner(System.in);
    //Arreglo de tipo entero
    static int numero[];
    //Esta variable sera la encargada de definir el tamaño del arreglo
    static int n;
    static int dato;
    
    static boolean encontrado = false;
    
   
    public static void main(String[] args) 
    {
        System.out.println("Bienvenidos al programa de busqueda ");
        System.out.println("En este programa se llevara a cabo el ");
        System.out.println("Metodo de busqueda lineal.");
        System.out.println();
        declaracion();
        llenado();
        System.out.println();
        busquedaLineal();
        
        
        
    }//Llave final del metodo principal
      public static void declaracion()
    {
        System.out.println("Porfavor ingrese la cantidad de datos deseada :");
        //con esta linea de codigo capturaremos el tamaño del arreglos.
        n = leer.nextInt();
        //Aqui se define el tamaño del arreglo
        numero= new int [n];
         
    }
    //Metodo donde el usuario deberea lenar el respectivo arreglo conn los datos
    public static void llenado()
    {
        
        
        System.out.println("Acontinuacion se llevara a cabo el llenado de datos");
         
        for(int i=0; i<n;i++)
            {
                //Con este codigo el usuario podra ingresar los valores deseados
                System.out.println("Ingresa el valor en posicion :" + (i));
                numero[i]= leer.nextInt();
                System.out.println();
            }//Llaves final del ciclo for
  
    }
    //Esta sera el metodo de busqueda lineal
    public static void busquedaLineal()
    {
        System.out.println("Ingrese el numero que dese buscar :");
        dato= leer.nextInt();
        //Esta sera la varibles que dirigira el ciclo while
        int busqueda=0;
        
        //Como podemos ver el ciclo whilke se repetira mientras nuestra variable "encontrado" siga siendo false
        while(busqueda<n && encontrado == false)
        {
            //Con este condicional se hara la busqueda con una comparacion donde el valor en posicion i se comparara con el valor que se quiere buscar
            if (numero[busqueda] == dato)
            {
                //En caso de que el numero sea encontrado se ejecutar el codigo dentro
                encontrado = true;
            }//Llave fial del if
            
            //En caso de que el valor no cumpla con la condicion entonces se debera incrementar nuestra variable en 1 para correr a la siguiente posicion
            busqueda ++;
            
        }
        
        //En esta condicional se verifica si el numero ingreseado sigue sin ser encontrado y se comprubea entonces
        //Se debera ejecutar la linea de codigo dentro indicandole al usuario que el valor no se encuentra
        if(encontrado == false)
        {
            
            System.out.println("El valor que ingreso no se encuentra en dentro del arreglo");
        }
        //En caso de que el valor si se encuentre se debra ejecutar la siguiente linea de codigo donde le mostraremos donde se encuentra
        else 
        {
            System.out.println("Exitosamente hemos encontrado el  numero que desa buscar");
            System.out.println("El numero que ingreso se encuentra en la posicion :" + (busqueda-1));
     
        }
    }
}

/**
 *
 * @author Kevin Gabriel Garcia Hernandez
 */