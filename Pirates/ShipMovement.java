/**
 * Write a description of class iStrategy here.
 * 
 * @author (Rohit Sharma) 
 * @version (a version number or a date)
 */
import greenfoot.*;

public class ShipMovement extends Actor implements iStrategy
{
    public void move(Actor a){
       Ship ship = (Ship) a;
        if(Greenfoot.isKeyDown("space")) {
            ship.move(60);
            ship.setFuel(ship.getFuel() - 1);
        }
        if(Greenfoot.isKeyDown("right")) {
            ship.turn(90);
        }
        if(Greenfoot.isKeyDown("left")) {
            ship.turn(-90);
        }
        
    }
}
