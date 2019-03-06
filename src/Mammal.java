/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKV
 */
abstract public class Mammal extends Animal{
    private String procreation;
    private boolean waterLife;

    public Mammal(IdCard id, String name, double height, double weight, int age, String procreation, boolean waterLife) {
        super(id, name, height, weight, age);
        this.procreation = procreation;
        this.waterLife = waterLife;
    }
    public String toString(){
        return super.toString() + "Procreation: " + procreation + "\nWaterLife: " + waterLife + "\n"; 
    }
    
     
    
    
}
