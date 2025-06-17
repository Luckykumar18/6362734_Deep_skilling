import model.Product;
import search.LinearSearch;
import search.BinarySearch;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(102, "T-shirt", "Clothing"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Laptop", "Electronics")
        };

        System.out.println("🔍 Linear Search:");
        int result1 = LinearSearch.search(products, "Phone");
        if (result1 != -1)
            System.out.println("Found: " + products[result1]);
        else
            System.out.println("Product not found");

        
        BinarySearch.sortByName(products);

        System.out.println("\n🔍 Binary Search:");
        int result2 = BinarySearch.search(products, "Phone");
        if (result2 != -1)
            System.out.println("Found: " + products[result2]);
        else
            System.out.println("Product not found");
    }
}
