public class productFiltering {

    public static void filterProducts(String category) {
        System.out.println("Filtering products by category:" + category);
    }
    public static void filterProducts(int minPrice, int maxPrice) {
        System.out.println("Filtering products by price range:$" + minPrice + " to $" + maxPrice);
    }
    public static void filterProducts(String brand,Boolean isBrand) {
        if(isBrand){
        System.out.println("Filtering products by brand:" + brand);
        }
    }
    public static void filterProducts(String category, int minPrice, int maxPrice) {
        System.out.println("Filtering products by category:" + category + ",price range: $" + minPrice + " to $" + maxPrice);
    }
    public static void filterProducts(String category, int minPrice, int maxPrice, String brand) {
        System.out.println("Filtering products by category:" + category + ",price range: $" + minPrice + " to $" + maxPrice + ",brand:" + brand);
    }

    public static void main(String[] args) {
        filterProducts("Electronics");
        filterProducts(100, 500);
        filterProducts("Apple",true);
        filterProducts("Fashion", 50, 200);
        filterProducts("Electronics", 300, 1000, "Samsung");
    }
}
