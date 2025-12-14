public class Inventory {

    private String location;
    private String manager;

    public Inventory(String location, String manager){
        this.location = location;
        this.manager = manager;
    }
    public String getLocation(){
        return location;
    }
    public String getManager(){
        return manager;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setManager(String manager){
        this.manager = manager;
    }
    @Override
    public String toString(){
        return "Location: " + location + " " + "Manager: " + manager;
    }
}
