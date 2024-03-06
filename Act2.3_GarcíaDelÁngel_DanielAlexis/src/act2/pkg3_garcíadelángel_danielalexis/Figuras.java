/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act2.pkg3_garcíadelángel_danielalexis;
import java.awt.Color;

import javax.swing. JFrame;
public class Figuras {
    
    
    public static void main( String args[] ){
        JFrame marco = new JFrame( "Dibujo de figuras en 20" );
     marco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    Figuras2Panel figuras2JPanel = new Figuras2Panel();
    marco.add( figuras2JPanel ); // agrega figuras2JPanel al marco

    marco. setBackground( Color.WHITE ); 
    marco.setSize( 400, 400 ); 
    marco.setVisible( true ); 
    }
}
