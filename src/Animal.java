/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKV
 */
abstract public class Animal implements BloodCirculation{
   protected IdCard idc;
   protected String name;
   protected double height;
   protected double weight;
   protected int age;
   
   private static int numberOfAnimals=0;
   

    public Animal(IdCard idc, String name, double height, double weight, int age) {
        this.idc = idc;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        numberOfAnimals++;
       
    }
   public String toString(){
       return "Id: " + idc + "Name: " + name + "\nHeight: " + height + "\nWeight: " + weight + "\nAge: " + age + "\n";
   }
   
   abstract public String ageStatus();
   
   
   public static  String older(Animal a, Animal b){
       if(a.age>b.age)
           return "Older Animal\n" + a.toString();
       else
           return "Older Animal\n" + b.toString();
   }
   
   public static int getNumberOfAnimals(){
       return numberOfAnimals;
   }
           
   
}
