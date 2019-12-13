/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Emma
 */
public class JeuDuPendu extends Effet {
    
     public JeuDuPendu (int nbRepet){
        super(nbRepet);
        }
    
 public void pendu (Bandeau b){
     for (int t=0 ; t<this.nbRepet ; t++){
         b.sleep(100);
         String mInitial = b.getMessage() ;
         int taille = b.getMessage().length() ;
         b.setMessage("_");
         
         for (int i=0;i< taille-1;i++){
             b.setMessage(b.getMessage()+"_");
             
         }
         ArrayList <Integer> nombre = new ArrayList<>();
         for (int f =0 ; f<=taille-1;f++){
             nombre.add(f);
         }                 
         Random r = new Random();
         for (int i=1;i<=taille; i++){
            b.sleep(500);
            int n = r.nextInt(nombre.size());
            int m = nombre.get(n);
            nombre.remove(n);
            StringBuilder sb = new StringBuilder(b.getMessage()); 
            char ch = mInitial.substring(m, m+1).charAt(0);
            sb.setCharAt(m, ch);
            b.setMessage(sb.toString());
         }
     }
         
}
}
