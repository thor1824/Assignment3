/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.VI;

/**
 *
 * @author thor1
 */
public class MoveCalculatorModel 
{
    public double calPane1(double x1, double x2, double y1, double y2)
    {
        return Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
    }   
    
    public double calPane2x(double v, double d, double x0)
    {
        return x0 + Math.sin(Math.toRadians(v)) * d;
    }
    public double calPane2y(double v, double d, double y0)
    {
        return y0 + Math.cos(Math.toRadians(v)) * d;
    }
}
