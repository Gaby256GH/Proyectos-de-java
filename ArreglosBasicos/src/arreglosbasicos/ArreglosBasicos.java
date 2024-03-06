package arreglosbasicos;
public class ArreglosBasicos {
    public static void main(String[] args) {
        // DECLARACION DE ARREGLOS
        int arreglo [] = new int [3];
        // INICIALIZAR EL ARREGLO MANUAL
        arreglo [0] = 6;
        arreglo [1] = 9;
        arreglo [2] = 12;
        // DECLARAR ARREGLOS E INICIALIZARLOS 
        int arregloDos [] = {6, 9, 12,15};
        String arregloTres [] = {"hola", "mundo"};
        char arregloCuatro [] = {'a', 'b', 'c', 'd'};
        boolean arregloCinco [] = {true,true,false,true,false};
        double arregloSeis [] = {8.5,9.4567,3.095,67.3};
        // CONOCER EL TAMAÑO DE UN ARREGLO
        System.out.println("Tamaño del arreglo: "+arreglo.length);
        System.out.println("Tamaño del arreglodos: "+arregloDos.length);
        System.out.println("Tamaño del arregloTres: "+arregloTres.length);
        System.out.println("Tamaño del arregloCuatro: "+arregloCuatro.length);
        System.out.println("Tamaño del arregloCinco: "+arregloCinco.length);
        System.out.println("Tamaño del arregloSeis: "+arregloSeis.length);
    }   
}
