
package calses;


public class clsDoctor {
    
    private String name;
    private String licanse;

    public clsDoctor(String name, String licanse) {
        this.name = name;
        this.licanse = licanse;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the licanse
     */
    public String getLicanse() {
        return licanse;
    }

    /**
     * @param licanse the licanse to set
     */
    public void setLicanse(String licanse) {
        this.licanse = licanse;
    }
    
}
