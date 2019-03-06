/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKV
 */
abstract public class Bird extends Animal {
    private boolean flyability;
    private String featherColor;

    public Bird(IdCard id, String name, double height, double weight, int age, boolean flyability, String featherColor) {
        super(id, name, height, weight, age);
        this.flyability = flyability;
        this.featherColor = featherColor;
    }
    public String toString(){
        return super.toString() + "Flyability: " + flyability +"\nFeather Color: " + featherColor +"\n"; 
    }
}
