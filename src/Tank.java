
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manu Singhal
 */
public class Tank 
{
    public static int muzzleSpeed = 200;
    
    public int myX;
    public double angleFromHori;
    public int health;
    public int ammo;
    public Color myColor;
    
    public Tank(Color c)
    {
        initTank(c);
    }
    
    public void move(boolean direction)
    {
        if(direction)
            myX ++;
        else
            myX --;
    }
    
    
    public void tiltAngle(boolean direction)
    {
        if(direction && angleFromHori > 0)
            angleFromHori --;
        else if(!direction && angleFromHori < Math.PI)
            angleFromHori ++;
    }
    
    public void shoot()
    {
        if(ammo > 0)
        {
            Bomb b = new Bomb(new Parabola(0, 0, new Vector(200, angleFromHori)));
        }
        else
            System.out.println("NO AMMO");
    }
    
    private void initTank(Color myColor)
    {
        angleFromHori = 0;
        health = 100;
    }
}
