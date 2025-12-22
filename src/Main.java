import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Inventory inv = new Inventory("Astana", "Beka");

        Supplier s1 = new Supplier(1, "Megapostavvki", "8 965 346 97 00", "NovoKazakhstan");
        System.out.println(s1);

        while (true) {
            System.out.println("INVENTORY MENU ");
            System.out.println("1 Add product");
            System.out.println("2 List all products");

            System.out.print("Choose: ");

            int choice = Integer.parseInt(sc.nextLine());

            if(choice == 0){
                break;
            }

            if (choice == 1) {
                System.out.print("Enter product id: ");
                int id = Integer.parseInt(sc.nextLine());

                System.out.print("Enter product name: ");
                String name = sc.nextLine();

                System.out.print("Enter product price: ");
                double price = Double.parseDouble(sc.nextLine());

                Product p = new Product(name, price, id);
                inv.addProduct(p);

                System.out.println("Added: " + p);
            }

            if (choice == 2) {
                System.out.println("ALL PRODUCTS");
                inv.printAllProducts();
            }
        }
        sc.close();
        inv.searchByName("milk");

        inv.filterByMaxPrice(600);

        inv.sortByPriceAsc();
        inv.printAllProducts();

        BaseEntity entity = s1;
        System.out.println(entity.shortInfo());
    }
}
