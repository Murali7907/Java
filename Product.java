import java.util.Scanner;

class Product {
    String pname, pcode;
    int price;

    // Constructor with parameters
    public Product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    // Default constructor
    public Product() {}

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Product code: " + this.pcode);
        System.out.println("Product name: " + this.pname);
        System.out.println("Product price: " + this.price);
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[][] pnc = new String[3][2]; // To store product names and codes
        int[] price = new int[3]; // To store prices
        int min = 0;

        System.out.println("Enter the 3 product details:");

        // Collecting product details
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the product name, product code, price for product " + (i + 1));
            pnc[i][0] = sc.nextLine(); // product name
            pnc[i][1] = sc.nextLine(); // product code
            price[i] = Integer.parseInt(sc.nextLine()); // price

            // Finding product with minimum price
            if (i == 0 || price[i] < price[min]) {
                min = i;
            }
        }

        // Creating product objects for each product
        Product p1 = new Product(pnc[0][0], pnc[0][1], price[0]);
        Product p2 = new Product(pnc[1][0], pnc[1][1], price[1]);
        Product p3 = new Product(pnc[2][0], pnc[2][1], price[2]);

        // Displaying product details
        System.out.println("The product details:");
        System.out.println("Product 1:");
        p1.display();
        System.out.println("Product 2:");
        p2.display();
        System.out.println("Product 3:");
        p3.display();

        // Displaying product with minimum price
        System.out.println("\nProduct with minimum price:");
        System.out.println("\nProduct name: " + pnc[min][0]);
        System.out.println("Product code: " + pnc[min][1]);
        System.out.println("Product price: " + price[min]);
    }
}