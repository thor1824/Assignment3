/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.IV;

/**
 *
 * @author thor1
 */
public class TemperaturConverterModel 
{
    public double getTemperaturInFahrenheit(double cel)
    {
        return cel * 9 / 5 + 32;
    }
    public double getFahrenheitInTemperatur(double fahr)
    {
        
        return (fahr - 32)* 5/9;
    }
}


