package search;

import model.Product;
import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

    // Assumes products array is sorted by name
    public static int search(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(targetName);

            if (compare == 0) return mid;
            else if (compare < 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void sortByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    }
}
