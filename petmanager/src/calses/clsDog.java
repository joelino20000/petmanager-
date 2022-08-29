
package calses;


public class clsDog extends cpets {
    
    private String breed;
    private boolean pedigrie;

    public clsDog(String breed, boolean pedigrie, String code, String name, int born_year, String color, String health_status) {
        super(code, name, born_year, color, health_status);
        this.breed = breed;
        this.pedigrie = pedigrie;
    }

       @Override
    public void Sound (){
        System.out.println("El perro "+super.getName()+ "  hace guauuuuuuu");
    }

    
   public void walkArround(){
       System.out.println("El perro "+ super.getName()+" esta caminando");
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

    /**
     * @return the pedigrie
     */
    public boolean isPedigrie() {
        return pedigrie;
    }

    /**
     * @param pedigrie the pedigrie to set
     */
    public void setPedigrie(boolean pedigrie) {
        this.pedigrie = pedigrie;
    }
    
    
    
}
