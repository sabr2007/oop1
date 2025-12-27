import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inventory inv = new Inventory("Astana", "Beka");

        Product p1 = new Product("milk", 300, 1);
        Product p2 = new Product("bread", 200, 2);
        Product p3 = new Product("cheese", 700, 3);
        Product p4 = new Product("sour cream", 400, 4);
        Product p5 = new Product("chocolate", 900, 1);
        inv.addProduct(p1);
        inv.addProduct(p2);
        inv.addProduct(p3);
        inv.addProduct(p4);
        inv.addProduct(p5);

        System.out.println(p1.shortInfo());
        System.out.println(p1.equals(p5)); //используя переписанный equals сравниваю айдишки

        Supplier s1 = new Supplier("Postavki Bistro", "87756329600", "Kazakhstan", 1);
        System.out.println(s1.shortInfo());


        while(true) {
            System.out.println("-----------------------------------");
            System.out.println("press 1 to show all products");
            System.out.println("press 2 to sort all products by price");
            System.out.println("press 3 to search product");
            System.out.println("press 0 to exit");
            System.out.println("-----------------------------------");

            int choice = sc.nextInt();
            if(choice == 0)
                break;
            if(choice == 1)
                inv.allProduct();
            if(choice == 2){
                inv.sortProduct();
                inv.allProduct();
            }
            if(choice == 3){
                System.out.println("enter the name for product");
                sc.nextLine();
                String prod = sc.nextLine();
                inv.searchProduct(prod);
            }
        }
        sc.close();


    }
}