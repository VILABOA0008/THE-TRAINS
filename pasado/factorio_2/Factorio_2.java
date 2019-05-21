/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorio_2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *
 * @author mi
 */
public class Factorio_2 {
 

  
  public static void main (String args[]){      boolean funciona=true; 
      try { 
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
       NewJFrame n=new NewJFrame();
      n.setVisible(true);

} catch (ClassCastException ex) {       funciona=false;
    ex.printStackTrace(); 
}     catch (ClassNotFoundException ex) {
          Logger.getLogger(Factorio_2.class.getName()).log(Level.SEVERE, null, ex); funciona=false;
      } catch (InstantiationException ex) {
          Logger.getLogger(Factorio_2.class.getName()).log(Level.SEVERE, null, ex); funciona=false;
      } catch (IllegalAccessException ex) {
          Logger.getLogger(Factorio_2.class.getName()).log(Level.SEVERE, null, ex); funciona=false;
      } catch (UnsupportedLookAndFeelException ex) {
          Logger.getLogger(Factorio_2.class.getName()).log(Level.SEVERE, null, ex); funciona=false;
      }
    
      
if(funciona==false){
NewJFrame n=new NewJFrame();
      n.setVisible(true);}

  }
}
/*
   public void rmain(){     
        try{
        spaguete=rutapaquete.getSelectedItem().toString();
            File  paquete = new File(directorio+"/"+rutapaquete.getSelectedItem());
        System.out.println(paquete);
   rutamain.removeAllItems();
    
       loop(paquete.listFiles());
           rutamain.setSelectedIndex(-1);
        }catch(NullPointerException e){labelprincipalerrores.setText("Seleccione el paqute");}   
    }
    
    
  public void rpaquete(){     
  rutapaquete.removeAllItems();
      
              File fil[]=    directorio.listFiles();
              if(fil!=null){
           for(int j=0;j<fil.length;j++){
               if(fil[j].isDirectory()){
                     rutapaquete.addItem(fil[j].getName());
       // System.out.println("    "+fil[j]);/*loop(fil[j].listFiles());
           }}
                 }  rutapaquete.setSelectedIndex(-1); }
  
  public  void  loop(File []f){
         
       if(f!=null){
           for(int j=0;j<f.length;j++){                    
               rutamain.addItem(f[j].getName());            
            loop(f[j].listFiles());}}
       
}
*/