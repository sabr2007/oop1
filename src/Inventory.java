import java.util.ArrayList;
import java.util.Comparator;
public class Inventory {

    private String location;
    private String manager;
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void printAllProducts() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found with name: " + name);
        }
    }

    public void filterByMaxPrice(double maxPrice) {
        boolean found = false;
        for (Product p : products) {
            if (p.getPrice() <= maxPrice) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found with price <= " + maxPrice);
        }
    }

    public void sortByPriceAsc() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Sorted by price (ASC).");
    }

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
