/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKV
 */
abstract public class Reptile extends Animal {
    private boolean poisonous;
    private int limbCount;

    public Reptile(IdCard id, String name, double height, double weight, int age, boolean poisonous, int limbCount) {
        super(id, name, height, weight, age);
        this.poisonous = poisonous;
        this.limbCount = limbCount;
    }
    public String toString(){
        return super.toString() + "Poisonous: " + poisonous + "\nLimb Count: " + limbCount + "\n";
    }
    
}
