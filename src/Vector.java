/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manu Singhal
 */
public class Vector 
{
    public double x;
    public double y;
    public double angleFromHorizontal;
    public double length;
        
    public Vector(double power, double angle)
    {
        length = power;
        angleFromHorizontal = angle;
        x = length * Math.cos(angleFromHorizontal);
        y = length * Math.sin(angleFromHorizontal);
    }
    
    public Vector addTo(Vector v)
    {
        return new Vector(x + v.x, y +v.y);
    }
    
    public void negate()
    {
        x *= -1; y *= -1;
        if(angleFromHorizontal < Math.PI)
            angleFromHorizontal += Math.PI;
        else
            angleFromHorizontal -= Math.PI;
    }
}
