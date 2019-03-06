/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKV
 */
public class Lion extends Mammal{
    private boolean alpha;

    public Lion(IdCard id, String name, double height, double weight, int age, String procreation, boolean hasHorn, boolean alpha) {
        super(id, name, height, weight, age, procreation, hasHorn);
        this.alpha = alpha;
    }
    
    public String ageStatus(){
        if(age<2)
            return "Age Status:Baby\n*************\n";
        else if(age<4)
            return "Age Status:Adolescence\n*************\n";
        else if(age<8)
            return "Age Status:Adult\n*************\n";
        else
            return "Age Status:Old\n*************\n";
    }
    public String bloodCirculation(){
        return "Warm-Blooded";
    }
    
    public String toString(){
        return "Mammal\nLion\n" + super.toString() + "Alpha: " + alpha + "\n" + ageStatus();
    }

    
    
}
