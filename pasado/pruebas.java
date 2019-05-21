
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a16pablovc
 */
public class pruebas {
      public static void main (String args[]){
    
    ArrayList<ArrayList<String[]>> bases=new ArrayList<>();
    Random r=new Random();
    int c=0;
    while(c<10){
         ArrayList<String[]>m=new ArrayList<>();
        int cc=2+r.nextInt(7);
       
        for(int i=0;i<cc;i++){
             String ma[]=new String[5];
            for(int j=0;j<5;j++){
        ma[j]=String.valueOf(r.nextInt(8)+"  ");
        
       m.add(ma);}            
            
        bases.add(m);}        
        
     c++;
    }
          System.out.println("");
     
    for(ArrayList <String[]> i:bases){
        System.out.println("\n\n //////////// ");
        for(String[] j:i){
            System.out.println("");
        for (String q:j){
            System.out.print(q);
        
        }
    }
    }
    
    
            }
}
