
public class Platypus extends Mammal{
    private double beakLength;

    public Platypus(IdCard id, String name, double height, double weight, int age, String procreation, boolean waterLife, double beakLength) {
        super(id, name, height, weight, age, procreation, waterLife);
        this.beakLength = beakLength;
    }

   
    
    public String ageStatus(){
        if(age < 3)
            return "Age Status:Baby\n*************\n";
        else if(age < 9)
            return "Age Status:Adolescence\n*************\n";
        else if(age < 14)
            return "Age Status:Adult\n*************\n";
        else
            return "Age Status:Old\n*************\n";
    }
    
    public String bloodCirculation(){
        return "Warm-Blooded";
    }
    
    public String toString(){
        return "Mammal\nPlatypus\n"+super.toString()+"Beak Length: "+beakLength+"\n" + ageStatus();
    }
}
