
package codigo;

/**
 *
 * @author kevin
 */
public class Codigo {

   
    public static void main(String[] args) 
    {
    
         codigoA();
    }
    public static void codigoA()
    {

        int cont=1,acumulador=1;

        while (cont<8) {

            acumulador*=2;

            System.out.print(","+acumulador);

            cont++;

        }

    }
}
