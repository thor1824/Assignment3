 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.rest;

import static java.awt.PageAttributes.MediaType.A;

/**
 *
 * @author thor1
 */
public class TextSolverControllerModel 
{
    public String excerciseVII(String name)
    {
        return ">"+name+"\n>"+name.toUpperCase()+"\n>"+name.toLowerCase()+"\n>"+name.length()+"\n>"+name.substring(0, 1)+"\n>"+name.indexOf("a");
    }
    
    public String excerciseIIX (String name)
    {
        if(name.contains(" "))
        {
            String[] splitName = name.split("\\s+");
            return splitName[0];
        }
        
        else
        {
            return name;
        }
        
    }
    
    public String excerciseIX (String name)
    {
        String[] splitName = name.split("\\s+");
        return splitName[1];
    }
    
    public int excerciseX (String name)
    {
    int numbCh = 0;  
        for (int i = 0; i < name.length() ; i++) 
        {
            int index = name.charAt(0+i);
            if (Character.isAlphabetic(index))
            {
               numbCh++;
            }
        }
        return numbCh;     
    }
    
    public String excerciseXI (String name)
    {
        String[] splitName = name.split(" ");
        int numbSp = 0;
        int e = splitName[0].length();
        String capName = splitName[0].substring(0, 1).toUpperCase() + name.substring(1, e) + " ";
        
        for (int i = 0; i < name.length() ; i++) 
        {
            int index = name.charAt(0+i);
            if (!Character.isAlphabetic(index))
            {
               numbSp++;
            }
        }
       
        for (int i = 0; i < numbSp; i++) 
        {
            int d = splitName[1 + i].length();
            capName += (splitName[1 + i].substring(0, 1).toUpperCase() + splitName[1 + i].substring(1, d) + " ");
               
        }
        return capName;
    }
}
