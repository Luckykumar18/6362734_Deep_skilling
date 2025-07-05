package search;

import model.Product;

public class LinearSearch {
    public static int search(Product[] products, String targetName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(targetName)) {
                return i;
            }
        }
        return -1; // not found
    }
}
