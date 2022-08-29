
package petmanager;

import calses.clsDoctor;
import calses.clsVeterinarie;


public class AbstractClass {
    
    public static void main(String[] args) {
         //instancias de veterinaria  y doctor
                clsDoctor doctor=new clsDoctor("Maria fernandez", "12345");
                clsVeterinarie Veterinarie= new clsVeterinarie("veterinaria mosquera" , "3133707852","calle 100 #45-09",doctor);
                
                Veterinarie.setData(Veterinarie.getName()+ "  " + Veterinarie.getAddress());
                
               String data= Veterinarie.getHospitalInformation();
               String type =Veterinarie.getpatientType();
               String surgery=Veterinarie.surgery();
               
               
               
               System.out.println("Data " + data);
               System.out.println("Type " + type);
               System.out.println("Surgery" + surgery);
    }
}
