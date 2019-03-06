/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKV
 */
public class Snake extends Reptile {
    private boolean rattler;

    public Snake(IdCard id, String name, double height, double weight, int age, boolean poisonous, int limbCount, boolean rattler) {
        super(id, name, height, weight, age, poisonous, limbCount);
        this.rattler = rattler;
    }
    
    public String ageStatus(){
        if(age<1)
            return "Age Status:Baby\n*************\n";
        else if(age<3)
            return "Age Status:Adolescence\n*************\n";
        else if(age<7)
            return "Age Status:Adult\n*************\n";
        else
            return "Age Status:Old\n*************\n";
    }
    
    public String bloodCirculation(){
        return "Cold-Blooded";
    }
    
     public String toString(){
        return "Reptile\nSnake\n" + super.toString() + "Rattler: " + rattler + "\n" + ageStatus();
    }
    
    
}
