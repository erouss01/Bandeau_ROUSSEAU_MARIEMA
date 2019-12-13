package bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {
    private final Bandeau monBandeau = new Bandeau();
    
    public static void main(String[] args) {
	    new ExempleDUtilisation().exemple();
    }
    
    public void exemple() {
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        Scenario scenario = new Scenario(2);

        monBandeau.setMessage("Hello ");   
        scenario.appliquer(monBandeau);
        monBandeau.setMessage("Mr");   
        scenario.appliquer(monBandeau);
        monBandeau.setMessage("Bastide, ");   
        scenario.appliquer(monBandeau);
            monBandeau.setMessage("Joyeux");   
        scenario.appliquer(monBandeau);
        monBandeau.setMessage("Noël !!!");   
        scenario.appliquer(monBandeau);
   
} 
}
