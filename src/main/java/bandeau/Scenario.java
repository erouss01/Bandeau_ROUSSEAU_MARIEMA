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

    

    public void appliquer(Bandeau b) {
        JeuDuPendu jdp = new JeuDuPendu(1);
        TeleType tele = new TeleType(1);
        Clignotant cli = new Clignotant(5);
        Rotation rota = new Rotation(1);

        Zoom zoom = new Zoom(1);
        leseffets.add(zoom);

        leseffets.add(rota);

        leseffets.add(cli);

        leseffets.add(tele);
        leseffets.add(jdp);

        for (int i = 0; i < nbRepet; i++) {
            jdp.pendu(b);
            tele.affichageGauche(b);
            cli.clignoter(b);
            rota.rotation(b);
            zoom.zoomer(b);
        }
    }
}
