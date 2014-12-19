
import java.awt.geom.Point2D;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A Parabola defines a set of points that a Bomb 
 * (or any projectile) will follow. This is primarily
 * used to determine where the Bomb will land.
 * @author Manu Singhal
 */
public class Parabola 
{
    public static int TIMESTEP = 1;
    public static double G_EARTH = -9.8;
    
    public double pointX;
    public double pointY;
    public Vector initialVector;
    
    public ArrayList<Point2D.Double> points;
    
    public Parabola(double x, double y, Vector v)
    {
        pointX = x;
        pointY = y;
        initialVector = v;
        
        points = new ArrayList();
        createParabola();
    }
    
    private boolean createParabola()
    {
        boolean successful = true;
        
        // using physics equation: yfin = yinit + vinit*t + a*t^2/2
        // this is only as good as our approximation of t
        // in this program, we will use t = 1 second.
        double tempYValue = pointY;
        double tempVValue = initialVector.y;
        while(tempYValue > 0)
        {
            double xFin = pointX + initialVector.x * TIMESTEP;
            tempYValue = pointY +(tempVValue * TIMESTEP) + (G_EARTH * Math.pow(TIMESTEP, 2) / 2);
            points.add(new Point2D.Double(xFin, tempYValue));
            
            tempVValue = tempVValue + G_EARTH * TIMESTEP;
        }
        
        return successful;
    }
}
