/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.ArrayList;

/**
 *
 * @author Emma
 */
public class Scenario {
    private ArrayList<Effet> leseffets ;
    private int nbRepet;
    
    public Scenario (int nbRepet){
        this.leseffets = new ArrayList <>();
        this.nbRepet = nbRepet ;  
        }
    public void appliquer(Bandeau b){
        Zoom zoom = new Zoom(1);
        Rotation rota = new Rotation(2);
        Clignotant cli = new Clignotant(5);
        TeleType tele = new TeleType(1);
        JeuDuPendu jdp = new JeuDuPendu(1);
        leseffets.add(jdp);
        leseffets.add(zoom);
        leseffets.add(rota);
        leseffets.add(tele);
        leseffets.add(cli);
        for (int i=0 ; i<nbRepet ; i++){
            jdp.pendu(b);
            zoom.zoomer(b);
            rota.rotation(b);
            cli.clignoter(b);
            tele.affichageGauche(b);
            
        }
    }
    
}
