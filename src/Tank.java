
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
    public int position;
    public int health;
    public int ammo;
    public Color myColor;
    
    public Tank(Color col)
    {
        myColor = col;
    }
}
