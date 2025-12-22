public class Product extends BaseEntity {

    private String name;
    private double price;

    public Product(String name, double price, int id){
        super(id);              // передаём id в BaseEntity
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if(price < 0){
            System.out.println("price cannot be negative");
        } else {
            this.price = price;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product: " + name + " Price: " + price + " id: " + getId();
    }

    @Override
    public String shortInfo() {
        return "Product: " + name + ", price=" + price;
    }
}

