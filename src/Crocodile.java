/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKV
 */
public class Crocodile extends Reptile{
    private int teethCount;

    public Crocodile(IdCard id, String name, double height, double weight, int age, boolean poisonous, int limbCount, int teethCount) {
        super(id, name, height, weight, age, poisonous, limbCount);
        this.teethCount = teethCount;
    }
    
    public String ageStatus(){
        if(age<2)
            return "Age Status:Baby\n*************\n";
        else if(age<20)
            return "Age Status:Adolescence\n*************\n";
        else if(age<50)
            return "Age Status:Adult\n*************\n";
        else
            return "Age Status:Old\n*************\n";
    }
    public String bloodCirculation(){
        return "Cold-Blooded";
    }
    
    public String toString(){
        return "Reptile\nCrocodile\n" + super.toString() + "Teeth Count: " + teethCount + "\n" + ageStatus();
    }
}
