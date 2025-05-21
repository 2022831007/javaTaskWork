class Restaurant {
   public String name;
    Restaurant(String name) {
        this.name=name;
    }
    int estimateDeliveryTime() {
        return 40;
    }
    void displayInfo() {
        System.out.println(this.name+" has the"+ " estimated delivery time: " + estimateDeliveryTime() + " minutes");
    }
    double tax() {
        return 0.10*200;
    }
    double food() {
        return 200+tax();
    }
    void calculateBill() {
        System.out.println(food());
    }

}
class FastFoodRestaurant extends Restaurant {
    
    FastFoodRestaurant(String name) {
        super(name);
    }

    int estimateDeliveryTime() {
        return 20;
    }
    double tax() {
        return 0.15*100;
    }
    double food() {
        return 100+tax();
    }
}

class FineDineRestaurant extends Restaurant {

    FineDineRestaurant(String name) {
        super(name);
    }

    int estimateDeliveryTime() {
        return 60;
    }
     double tax() {
        return 0.25*600;
    }
    double food() {
        return 600+tax();
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Restaurant normal = new Restaurant("Normal ");
        FastFoodRestaurant fastfood = new FastFoodRestaurant("Fast Food ");
        FineDineRestaurant fineDine = new FineDineRestaurant("Luxurious Food ");
        normal.displayInfo();
        normal.calculateBill();
        fastfood.displayInfo();
        fastfood.calculateBill();
        fineDine.displayInfo();
        fineDine.calculateBill();
    }
}
