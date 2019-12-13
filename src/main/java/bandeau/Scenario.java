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

    private ArrayList<Effet> leseffets;
    private int nbRepet;

    public Scenario(int nbRepet) {
        this.leseffets = new ArrayList<>();
        this.nbRepet = nbRepet;
    }

    public void appliquerzoom(Bandeau b) {
        Zoom zoom = new Zoom(1);
        leseffets.add(zoom);
        zoom.zoomer(b);
    }

    public void appliquerrota(Bandeau b) {

        Rotation rota = new Rotation(1);

        leseffets.add(rota);

        rota.rotation(b);

    }

    public void appliquercli(Bandeau b) {
      
        Clignotant cli = new Clignotant(5);
  
        leseffets.add(cli);
      
            cli.clignoter(b);
            
    }

    public void appliquertele(Bandeau b) {
       
        TeleType tele = new TeleType(1);
        
        leseffets.add(tele);
            tele.affichageGauche(b);
    }

    public void appliquerjdp(Bandeau b) {
       
        JeuDuPendu jdp = new JeuDuPendu(1);
       
        leseffets.add(jdp);
        
            jdp.pendu(b);
            b.sleep(1000);
    }

}
