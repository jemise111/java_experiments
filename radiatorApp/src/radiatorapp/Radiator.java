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
public class Radiator implements ClimateControlSystem{
    int speed = 0;
    boolean heat = false;
    
    public void toggleTemp() {
        heat = !heat;
    }
    
    public void incrementSpeed() {
        if (speed < MAX_SPEED) {
            speed += 1;
        }
    }
    
    public void turnOff() {
        speed = 0;
    }
    
    public void printStatus() {
        System.out.println("Heat: " + heat + ". Speed: " + speed + ".");
    }
}
