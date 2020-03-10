package week7_inclass_5;

public class Package {
    double weight;
    char shipping_mode;
    double shipping_cost;

    public Package(double weight, char shipping_mode) {
        this.shipping_cost = calculate_cost(shipping_mode, weight);
        this.weight = weight;
        this.shipping_mode = shipping_mode;
    }

    public double calculate_cost(char shipping_mode, double weight) {
        double weight_in_lbs = weight * 16;
        double shipping_cost = 0.0;

        if (weight_in_lbs > 9) {
            if (shipping_mode == 'A') {
                shipping_cost = 2.00;
            } else {
                shipping_cost = 1.50;
            }
        } else {
            if (shipping_mode == 'A') {
                shipping_cost = 3.00;
            } else {
                shipping_cost = 2.35;
            }
        }

        return shipping_cost;
    }

    public void print_details(){
        System.out.printf("%22s%n", "Package details");
        System.out.printf("Weight in ounces: %8.2f%n", this.weight);
        System.out.printf("Shipping mode: %7c%n", this.shipping_mode);
        System.out.printf("Shopping cost: %10.2f%n", this.shipping_cost);
    }
}

