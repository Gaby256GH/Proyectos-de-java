
package ejemploclases;


public class EjemploClases {

   
    public static void main(String[] args) 
    {
     //Crear una instancia de la clase animal 
        Animal perro = new Animal();
        
        //Imprimir el nombre de la instancia perro
        System.out.println("Imprime Animal : "+perro.toString());
        
        //Metodos con el cual estableceremos los valores
        perro.setNombre("Scotty");
        perro.setColor("Cafe");
        perro.setEdad(4);
        perro.setPeso(4.20f);
        perro.setTamano(1.10);
        perro.setEspecie("Cocker");
        System.out.println("A continuacion mostraremos el Animal : "+perro.toString());
      
    }
    
}
