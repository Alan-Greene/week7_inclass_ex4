package week7_inclass_5;

public class InsuredPackage extends Package {

    double insurance_cost = 0;

    public InsuredPackage(double weight, char shipping_mode) {
        super(weight, shipping_mode);
        this.insurance_cost = calculate_insurance(calculate_cost(shipping_mode, weight));
    }

    public double calculate_insurance(double shipping_cost){
        double insurance;

        if (shipping_cost >= 0.0 && shipping_cost <= 1.00){
            insurance = 2.45;
        } else if (shipping_cost > 1.0 && shipping_cost <= 3.0){
            insurance = 3.95;
        } else {
            insurance = 5.55;        }

        return insurance;
    }

    @Override
    public void print_details(){
        super.print_details();
        System.out.printf("Insurance: %14.2f%n", this.insurance_cost);
    }
}
