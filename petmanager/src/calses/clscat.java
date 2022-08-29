
package calses;


public class clscat extends cpets {
    
    private String breed;

    public clscat(String breed, String code, String name, int born_year, String color, String health_status) {
        super(code, name, born_year, color, health_status);
        this.breed = breed;
    }
    
    
    
    
    public void SelfCleaning(){
        System.out.println("El gato"+super.getName() + "se esta limpiando");
    }
    
    @Override
    public void Sound (){
        System.out.println("El gato "+super.getName()+ "  hace miaaaauuu");
    }
    
   @Override
    public int getNumberOfBones(){
        return 230;
    }
    
    @Override
    public String getAnimalType(){
        return "gato"; 
    }
    
    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
