/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petmanager;

import calses.clsDog;
import calses.clscat;

/**
 *
 * @author Joelito
 */
public class interfaces {
    
    public static void main(String[] args) {
              clsDog   dog = new  clsDog ("Criollo",false,"001" , "Firulais" ,  2013 ,    " negro", "Sano");
        
        clscat cat = new clscat("Angora","002" , "minino" ,  2018 ,    "Blanco y negro", "Enfermos");
        dog.getAnimalType();
        cat.getAnimalType();
        
        System.out.println(dog.getAnimalType());
        System.out.println(" "+ cat.getAnimalType());
        
        System.out.println(dog.getNumberOfBones());
        System.out.println(""+ cat.getNumberOfBones());
        
       
    }
}
