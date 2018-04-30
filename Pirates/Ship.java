import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boat here.
 * 
 * @author (Tarun Arora) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    private int fuel;
    private int score;
    private int count;
        
    OceanTreasures food;
    OceanTreasures fuelFactory;
    OceanTreasures gemsFactory;
    OceanTreasures icebergFactory;
   
    public Ship() {
        fuel = 30;
        score = 0;
        count = 0;
        
        fuelFactory = new FuelFactory();
        icebergFactory = new IcebergFactory();
        shipContext = new Context(new ShipMovement());
        
    }
    
    public Ship (int fuel, int score) {
        this.fuel = fuel;
        this.score = score;
        count = 0;
    }
    
    /**
     * Act - do whatever the Boat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
      {
        
    }
    
    public int getFuel() {
        return this.fuel;
    }

    public void setFuel(int f) {
        this.fuel = f;
    }
}
