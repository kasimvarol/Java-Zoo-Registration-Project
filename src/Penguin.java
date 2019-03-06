/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKV
 */
public class Penguin extends Bird{
    private String beakColor;

    public Penguin(IdCard id, String name, double height, double weight, int age,  boolean flyability, String featherColor, String beakColor) {
        super(id, name, height, weight, age, flyability, featherColor);
        this.beakColor = beakColor;
    }
    
     public String ageStatus(){
        if(age<1)
            return "Age Status:Baby\n*************\n";
        else if(age<4)
            return "Age Status:Adolescence\n*************\n";
        else if(age<10)
            return "Age Status:Adult\n*************\n";
        else
            return "Age Status:Old\n*************\n";
    }
     public String bloodCirculation(){
        return "Warm-Blooded";
    }
     
     public String toString(){
        return "Bird\nPenguin\n" + super.toString() + "Beak Color: " + beakColor + "\n" + ageStatus();
    }
    
}
