/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKV
 */
public class Eagle extends Bird{
    private double altitude;

    public Eagle(IdCard id, String name, double height, double weight, int age, boolean flyability, String featherColor, double altitude) {
        super(id, name, height, weight, age, flyability, featherColor);
        this.altitude = altitude;
    }
    public String ageStatus(){
        if(age<1)
            return "Age Status:Baby\n*************\n";
        else if(age<7)
            return "Age Status:Adolescence\n*************\n";
        else if(age<15)
            return "Age Status:Adult\n*************\n";
        else
            return "Old";
    }
     public String bloodCirculation(){
        return "Warm-Blooded";
    }
     
     public String toString(){
        return "Bird\nEagle\n" + super.toString() + "Altitude: " + altitude + "\n" + ageStatus();
    }
    
    
}
