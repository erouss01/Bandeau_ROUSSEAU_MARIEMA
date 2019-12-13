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
public class Rotation extends Effet{
     
     public Rotation (int nbRepet){
        super(nbRepet);
        }
     
     
          public void rotation(Bandeau b,String mess){
              b.setMessage(mess);
            for (int f=0 ; f<this.nbRepet ; f++){
                b.sleep(100);
                 double d = b.getRotation();
         for (int i = 0; i <= 100; i++) {
		b.setRotation(2*Math.PI*i / 100);
		b.sleep(35);
	}
        
           b.setRotation(d); 
            }
           
        }
}
