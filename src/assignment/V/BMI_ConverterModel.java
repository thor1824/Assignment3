/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.V;

/**
 *
 * @author thor1
 */
public class BMI_ConverterModel 
{
    public double bmi(double kg, double cm)
    {
        return kg/Math.pow((cm/100), 2);
    }
            
}
