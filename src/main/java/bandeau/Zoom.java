/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Font;

/**
 *
 * @author Emma
 */
public class Zoom extends Effet {
    
    public Zoom (int nbRepet){
        super(nbRepet);
        }
    
            public void zoomer(Bandeau b){
                for (int t=0 ; t<this.nbRepet ; t++){
                    b.sleep(100);
                    Font f = b.getFont();
            for (int i=10 ; i<=50 ;i=i+2 ){
               b.setFont(new Font("Arial", Font.BOLD, i));
           b.sleep(40); 
            }
            b.setFont(f);  
                }
                     
        }
}
