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

public interface ClimateControlSystem {
   public void toggleTemp();
   public void incrementSpeed();
   public void turnOff();
   public void printStatus();
   public static final int MAX_SPEED = 3;
}
