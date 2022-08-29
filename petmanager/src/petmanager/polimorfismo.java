
package petmanager;

import calses.clsDoctor;
import calses.clsDog;
import calses.clsVeterinarie;
import calses.clscat;


public class polimorfismo {
    public static void main(String[] args) {
        //instancias de las clases hijas
               clsDog   dog= new  clsDog ("Criollo",false,"001" , "Firulais" ,  2013 ,    " negro", "Sano");
        
                clscat cat= new clscat("Angora","002" , "minino" ,  2018 ,    "Blanco y negro", "Enfermos");
                
                //instancias de veterinaria  y doctor
                clsDoctor doctor=new clsDoctor("Maria fernandez", "12345");
                clsVeterinarie Veterinarie= new clsVeterinarie("veterinaria mosquera" , "3133707852","calle 100 #45-09",doctor);
                
                String careDog=Veterinarie.PetCare(dog);
                System.out.println("El estado de salud de "+ dog.getName()+" es "+ careDog);
                
                String carecat=Veterinarie.PetCare(cat);
                System.out.println("El estado de salud de "+ cat.getName()+" es "+ carecat);
    }
}
