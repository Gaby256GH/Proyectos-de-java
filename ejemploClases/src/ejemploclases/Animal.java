
package ejemploclases;


public class Animal 
{
    //Atributos de la clase animal 
    private String nombre;
    private String color;
    private int edad;
    private double tamano;
    private float peso;
    private String especie;
    
    //Insertamos el constructor
public Animal() {
    }
   
    //Agramamos los metodos getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

        //Ingresamos mas codigo 

    @Override
    public String toString() {
        return "Animal{" + 
                "nombre=" + nombre + 
                ", color=" + color + ", "
                + "edad=" + edad + ", "
                + "tamano=" + tamano + 
                ", peso=" + peso + 
                ", especie=" + especie + '}';
    }
    
    

    
    
}
