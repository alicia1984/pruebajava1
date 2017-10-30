 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava1 ;
import java.util.Scanner;
/*******************************************************************************
 *Alicia Villarroel
 * @author LP 13
 * Fecha:Octubre 30 de 20017
 * Programa: pruebajava1
 * Responsabilidad: calcular  el area del  triangulo
 *****************************************************************************/
public class aptarea
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


// TODO code application logic hereç
        int numerobase;//Declaracion de variable tipo entero base
        
      int numeroaltura;//Declaracion variable tipo double altura
     
      Scanner escaner = new Scanner(System.in);
      System.out.println("ingrese el  numero  de la  base  de  su triangulo");
      numerobase= escaner.nextInt();
       System.out.println("ingrese el numero altura de  su triangulo");
       numeroaltura= escaner.nextInt();
       
 System.out.println ("Multiplicacion de  la base y la  altura  de  su triangulo  es : "+(numerobase*numeroaltura));
   
       
       
    
    }
}