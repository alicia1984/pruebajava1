/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava1;
import javax.swing.JOptionPane;
/*******************************************************************************
 *Alicia Villarroel
 * @author LP 13
 * Fecha:Octubre 30 de 20017
 * Programa: pruebajava1
 * Responsabilidad: ingreso  de datos  de  nombre  edad y  cuanto  tendra   en  20 años mas 
 * PRUEBA TERMINADA 
 *****************************************************************************/
public class ingresardatossolicitados 
{
  public ingresardatossolicitados() //constructor
  {
  
  }
  public static void main (String[] args)
  {
      String nombre;
      int edad;
      
     nombre = (JOptionPane.showInputDialog("Ingrese su Nombre")) ;
      edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
      
       JOptionPane.showMessageDialog(null,"Bienbenido sr, " +(nombre));
       
        JOptionPane.showMessageDialog(null," dentro  de 20 años usted tendra..."+(edad+20));
      
          
  }
 
          
      }
      
  

