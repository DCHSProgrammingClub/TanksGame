/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The class that defines what a Bomb is. This
 * is the weapon that will come out of the Tank
 * once it has shot. Each Bomb has a corresponding
 * Parabola, a path that tells it where to go.
 * @author Manu Singhal
 */
public class Bomb 
{
    public Parabola path;
    
    public Bomb(Parabola pb)
    {
        path = pb;
    }
    
    public void explode() { /* Not sure what will go here */}
}
