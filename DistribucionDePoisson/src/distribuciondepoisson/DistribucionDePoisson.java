
package distribuciondepoisson;

import java.util.Scanner;


public class DistribucionDePoisson 
{
    //Variables globales
    static Scanner datos= new Scanner(System.in);
    //Variables a utilizar 
    static double eul= 2.7182;//Constante para el valor de euler
  
    
  
    static  int opc;
    
    //Metodo principal
    public static void main(String[] args) 
    {
        System.out.println("/////////////////////////////////////////////////");
        System.out.println("//Bienvenido al programa sobre el ejercicio de //");
        System.out.println("//Distribucion de Poisson donde daremos        //");
        System.out.println("//solucion al ejercicio dado en clase y uno    //");
        System.out.println("//donde el usuario ingrese los valores.        //");
        System.out.println("/////////////////////////////////////////////////");
       //Este codigo nos serevira para dejar un pequeño espacio
        System.out.println();
        //Metodo menu
        menu();
      
        
        
    }
    
    public static void menu()
    {
       
        do{
         System.out.println("///////////////////////////");
         System.out.println("//Distribucion de Poisson//");
         System.out.println("///////////////////////////");
         //Salto de linea
            System.out.println();
            
           
         System.out.println("1.-Problema de clase");
         System.out.println("2.-Insertar datos manualmente");
         System.out.println("3.-Salir");
         System.out.println("4.-Informacion del proyecto");
         System.out.print("Seleccione la opcion con la que desee trabajar: ");
         //Con este codigo el usuario podra ingresar la opcion deseda
         opc= datos.nextInt();
         
            System.out.println();
                   //Dentro de aqui se llevaran acabo los casos 
         switch(opc){

             
             case 1:
                 problema();
                 
                 break;
                 
                 
                 
             case 2:
                ingresar();
                 
                 break;
             
                 
                 
           
             
             case 3:
                 
                salir();
                 break;
                 
                 
             case 4:
                 showInfo();
                 break;
             
             
         }//Llave final del switch
         
         
         
         
         
     }while(opc!=3);//El ciclo finalizara solo cuando se seleccione la opcion 4
     //De lo contrario el menu se seguira mostrando en pantalla.
        
        
    }//Llave final del metodo menu
    
    
    
     public static void salir(){
     //El caso dos se debera utilizar solo si el usuario desea salir
           System.out.println("¿Desea salir S/N?");
             String val = datos.next();
             //Condicion con el cual se verificara si realmente desea salir
                 if(val.equals("S") || val.equals("s"))
                 {
                     //No me quiero ir maestra Diana::::::
                     System.out.println("Hasta luego");
                     System.exit(0);
                 }
                 else
                 {
                    opc = 0;
             //se debe de rersetear por que si no de igual manera sacara al usurio
                 }    
    }//Fin de la llave del metotodo salir
    
     
     //Metodo con el cual se dara salucion al problema
     //Metodo con el cual se dara salucion al problema
     public static void problema()
     {
        //Asignacion de valores a las variables
        double lamda=3;
       
        int n=2;
        
         double acLamd = 0;
         
         double eule;
         
         
         double factorial= 1;
         
         double resultado = 0;
         
         System.out.println("En un banco un acesor comercial atiende ");
         System.out.println("un promedio de 3 personas por hora,");
         System.out.println("¿Cual es la probabilidad de que en las");
         System.out.println("siguientes 2 horas atienda a 2 personas?");
         System.out.println();
         
         
         //Primero se llevara a cabo el proceso de elevar 
         eule = Math.pow(eul, (-lamda));
         
         acLamd= Math.pow(lamda, n);
         //Codigo con el cual de verificara que el numero al sacar el factorial se mayor a 0
         if (n>0)
        {
            //sigo calculando
            for (int i = n;n>0;n--) 
            {
             factorial = factorial * n;
             //N-- ya no se debe de poner porque el decremento ya esta en el for 
            }
            System.out.println("El factorial es: " + factorial);
        }
        else
        {
            System.out.println("Verificar valor mayor a 0");
        }
         
         
          //Proceso de multiplicacion y divicion para la obtencion del resultado
         resultado = eule * acLamd / factorial;
         System.out.println("El resultado final es:" + resultado);
         System.out.println();
     }//Llave final del problema
     
     
     
     
     public static void ingresar()
         {
              //Asignacion de valores a las variables
       
       
        
        
         double acLamd = 0;
         
         double eule;
         
         
         double factorial= 1;
         
         double resultado = 0;
         
        System.out.println("Porfavor ingrese correctamente cada uno de los valores ");
         System.out.println("para asi brindarle el mejor resultado posible");
         System.out.println();
         //Pediremos el valor de ocurrencias de eventos
         System.out.println("Acontinuacion ingrese el numero de ocurrencias del evento");
         //Esta variable a la cual se le obtendra el factorial
         int n= datos.nextInt();
         System.out.println();
         
         System.out.println("Ingrese el numero de veces que se espera que ocurra ");
         System.out.println("el fenomeno (valor de lamda)");
         double lamda= datos.nextDouble();
         
         
         //Primero se llevara a cabo el proceso de elevar 
         eule = Math.pow(eul, (-lamda));
         
         acLamd= Math.pow(lamda, n);
         
         
         
         
         //Codigo con el cual de verificara que el numero al sacar el factorial se mayor a 0
         if (n>0)
        {
            //calculando el factorial
            for (int i = n;n>0;n--) 
            {
             factorial = factorial * n;
             //N-- ya no se debe de poner porque el decremento ya esta en el for 
            }
            System.out.println("El factorial es: " + factorial);
        }
        else
        {
            System.out.println("Verificar valor mayor a 0");
        }
         
         
          //Proceso de multiplicacion y divicion para la obtencion del resultado
         resultado = eule * acLamd / factorial;
         System.out.println("El resultado final es:" + resultado);
         System.out.println();
         }//Llave final del metodo ingresar
    
    
      public static void showInfo ()
      {
        System.out.println("+-----------------------------------------------------------------------------------+");
        System.out.println("|\tFecha de Entrega: abril 2020                                                |");
        System.out.println("|\tPresentan:                                                                  |");
        System.out.println("|\tGarcía Hernández Kevín Gabriel                                              |");
        System.out.println("|\tHernández Bautista Alan Uriel                                               |");
        System.out.println("|\tCruz Islas Brenda                                                           |");
        System.out.println("|\tProfesor: Diana Melendez Rivero                                             |");
        System.out.println("|\tGrupo: MISC - 101                                                           |");
        System.out.println("+-----------------------------------------------------------------------------------+");
       }
    
}//Llave de clase principal






/** Integrantes del equipo:
 *
 * @author Kevin Gabriel Garcia Hernandez
 * @author Bautista Hernandez Alan Uriel
 * @author Cruz Islas Brenda 
 */
