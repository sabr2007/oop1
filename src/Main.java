
public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("milk", 500, 1);
        Product p2 = new Product("bread", 200, 2);
        Product p3 = new Product("milk", 1000, 3);
        System.out.println(p1);

        Supplier s1 = new Supplier("Megapostavvki", "8 965 346 97 00", "NovoKazakhstan");

        System.out.println(s1);

        Inventory i1 = new Inventory("Astana", "Beka");
        System.out.println(i1);

        p1.setPrice(600);
        System.out.println(p1.getPrice());

        System.out.println(p1 == p2); // сравниваю ссылки на обьект

        System.out.println(p1.getName().equals(p2.getName())); // сравниваю значения конкретных полей
        System.out.println(p1.getName().equals(p3.getName()));
        System.out.println(p1.getPrice() == p2.getPrice());

        System.out.println(i1.getLocation() + "\n" + i1.getManager());
        
    }
}
