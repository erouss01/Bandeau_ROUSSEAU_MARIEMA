/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author Emma
 */
public class TeleType extends Effet {
    
   public TeleType (int nbRepet){
        super(nbRepet);
        } 
   
         public void affichageGauche(Bandeau b){
             for (int f=0 ; f<this.nbRepet ; f++){
                 b.sleep(100);
                 String mInitial = b.getMessage() ;
         int taille = mInitial.length() ;
         b.setMessage("");
         
         for (int i=1;i<= taille;i++){
             b.sleep(200);
             b.setMessage(b.getMessage()+mInitial.substring(i-1, i));             
         }   
             }
        
        }
}
