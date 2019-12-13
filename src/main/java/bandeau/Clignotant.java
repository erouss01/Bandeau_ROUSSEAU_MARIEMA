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
public class Clignotant extends Effet{
    
 
    public Clignotant (int nbRepet){
        super(nbRepet);
        
    }
    
            public void clignoter (Bandeau b){
                
                String n = b.getMessage();
            for (int i=0 ; i<= nbRepet ; i++){
            b.sleep(100);
            b.setMessage(n) ;
            b.sleep(100);
            b.setMessage("");
            }
            b.setMessage(n); 
                }
            
        }

   

