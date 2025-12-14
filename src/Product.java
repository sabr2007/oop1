public class Product {

    private String name;
    private double price;
    private int id;

    public Product(String name, double price, int id){
        this.name = name;
        this.price = price;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getId(){
        return id;
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
    public String toString(){
        return "Product: " + name + " " + "Price: " + price + " id: " + id;
    }
}

