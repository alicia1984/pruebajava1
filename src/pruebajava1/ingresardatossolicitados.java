/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava1;
import javax.swing.JOptionPane;
/**
 *
 * @author LP 13
 */
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
      
  

