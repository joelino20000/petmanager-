
package petmanager;

import calses.*;



public class polimorfismo2 {
    public static void main(String[] args) {
        //instancias de las clases hijas
               clsDog   dog= new  clsDog ("Criollo",false,"001" , "Firulais" ,  2013 ,    " negro", "Sano");
        
                clscat cat= new clscat("Angora","002" , "minino" ,  2018 ,    "Blanco y negro", "Enfermos");
                
                dog.Sound();
                cat.Sound();
    }
}
