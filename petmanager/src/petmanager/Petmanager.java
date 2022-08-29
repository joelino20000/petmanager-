
package petmanager;



import calses.*;
import calses.cpets ;
import java.util.Date;

public class Petmanager {

   
    public static void main(String[] args) {
        
        clsDog   dog1 = new  clsDog ("Criollo",false,"001" , "Firulais" ,  2013 ,    " negro", "Sano");
        
        clscat cat1 = new clscat("Angora","002" , "minino" ,  2018 ,    "Blanco y negro", "Enfermos");
        
        Date current_date = new Date ();
        int current_year =current_date.getYear();
        
        int agepet1 = current_year - dog1.getBorn_year();
        int agepet2 = current_year - cat1.getBorn_year();
        
        if(agepet1> agepet2){
        
            System.out.println("La mascota" + dog1.getName() + "es mayor que la mascota " + cat1.getName());
            
        }else{
        
            if(agepet2 > agepet1){
                System.out.println("La mascota" + cat1.getName() + "es mayor que la mascota " + dog1.getName());
            }else{
            System.out.println("La mascota" + dog1.getName() + "tiene la misma edad que la mascota " + cat1.getName());
            }
        }
        
        dog1.Eat();
    
        cat1.Eat();
        dog1.Move();
        cat1.Sound();
        
        dog1.walkArround();
        cat1.SelfCleaning();
    }
    
}
