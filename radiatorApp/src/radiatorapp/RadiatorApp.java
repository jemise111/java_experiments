/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package radiatorapp;

/**
 *
 * @author jemise111
 */
public class RadiatorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radiator myRadiator = new Radiator();
        myRadiator.printStatus();
        myRadiator.toggleTemp();
        myRadiator.printStatus();
        myRadiator.incrementSpeed();
        myRadiator.incrementSpeed();
        myRadiator.printStatus();
        myRadiator.incrementSpeed();
        myRadiator.incrementSpeed();
        myRadiator.incrementSpeed();
        myRadiator.printStatus();
        myRadiator.turnOff();
        myRadiator.printStatus();
    }
    
}
