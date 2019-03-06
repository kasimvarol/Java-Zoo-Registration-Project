/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKV
 */
public class IdCard {
    protected int id;
    protected String state;
    protected String keepersName;
   

    public IdCard(int id, String state, String keepersName) {
        this.id = id;
        this.state = state;
        this.keepersName = keepersName;
    }
    
    public String toString(){
        return   id + "\nState: " + state+ "\nKeeper's Name: " + keepersName + "\n"; 
    }
}
