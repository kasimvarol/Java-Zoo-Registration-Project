
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKV
 */
public class AnimalSys {
    private static ArrayList<Animal> animals = new ArrayList();
    
    public static boolean addAnimal(Animal a){
        for(int i=0; i<animals.size(); i++)
            if(animals.get(i).idc.id==a.idc.id)
                return false;
        animals.add(a);
        return true;
    }
    
    public static Animal searchAnimal(int bid){
        for(int i=0; i<animals.size(); i++)
            if(animals.get(i).idc.id==bid)
                return animals.get(i);
        return null;
    }
    
    public static boolean deleteAnimal(int bid){
        for(int i=0; i<animals.size(); i++)
            if(animals.get(i).idc.id==bid)
            {
                animals.remove(i);
                return true;
            }
        return false;
    }
    
    public static String displayWithString(){
        String res="";
        for(int i=0;i<animals.size(); i++){
            res+=animals.get(i).toString();
           
        }
        return res;
    }
    public static ArrayList<Animal> getAnimals(){
        return animals;
    }
    
    public static void readTxt(){
        File file = new File("animals.txt");
        Scanner in = null;
        try {
            in = new Scanner(file);
            int id;
            String state, keepersName;
            String name;
            double height;
            double weight;
            int age;
            String procreation;
            boolean waterLife, alpha;
            double beakLength;
            boolean poisonous;
            int limbCount;
            boolean rattler;
            int teethCount;
            boolean flyability;
            String featherColor;
            double altitude;
            String beakColor;
            String kind;
            
            while(in.hasNext()){
                kind = in.next();
                id = in.nextInt();
                state = in.next();
                keepersName = in.next();
                IdCard idc = new IdCard(id, state, keepersName);
                name = in.next();
                height = in.nextDouble();
                weight = in.nextDouble();
                age = in.nextInt();
                if(kind.equals("Lion")){
                    procreation = in.next();
                    waterLife = in.nextBoolean();
                    alpha = in.nextBoolean();
                    Lion ani = new Lion(idc, name, height, weight, age, procreation, waterLife, alpha);
                    AnimalSys.addAnimal(ani);
                }
                else if(kind.equals("Platypus")){
                    procreation = in.next();
                    waterLife = in.nextBoolean();
                    beakLength = in.nextDouble();
                    Platypus ani = new Platypus(idc, name, height, weight, age, procreation, waterLife, beakLength);
                    AnimalSys.addAnimal(ani);
                }
                else if(kind.equals("Snake")){
                    poisonous = in.nextBoolean();
                    limbCount = in.nextInt();
                    rattler= in.nextBoolean();
                    Snake ani = new Snake(idc, name, height, weight, age, poisonous, limbCount, rattler);
                    AnimalSys.addAnimal(ani);
                }
                else if(kind.equals("Crocodile")){
                    poisonous = in.nextBoolean();
                    limbCount = in.nextInt();
                    teethCount = in.nextInt();
                    Crocodile ani = new Crocodile(idc, name, height, weight, age, poisonous, limbCount, teethCount);
                    AnimalSys.addAnimal(ani);
                }
                else if(kind.equals("Eagle")){
                    flyability = in.nextBoolean();
                    featherColor = in.next();
                    altitude = in.nextDouble();
                    Eagle ani = new Eagle(idc, name, height, weight, age, flyability, featherColor, altitude);
                    AnimalSys.addAnimal(ani);
                }
                else if(kind.equals("Penguin")){
                    flyability = in.nextBoolean();
                    featherColor = in.next();
                    beakColor = in.next();
                    Penguin ani = new Penguin(idc, name, height, weight, age, flyability, featherColor, beakColor);
                    AnimalSys.addAnimal(ani);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AnimalSys.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            in.close();
        }
    }
    
}
