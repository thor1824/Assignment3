/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.III;

/**
 *
 * @author thor1
 */
public class NumberConversionModel
{
    public String getGreetingsMessage(String name)
    {
        return ("hello, " + name + ". greetings from the top java developer");
    }
    
    public double getMilesFromKilometers(double km)
    {
        return km*1.609344;
    }
    
    public double getKilometersFromMiles(double miles)
    {
        return  miles/1.609344;
    }
}
    

