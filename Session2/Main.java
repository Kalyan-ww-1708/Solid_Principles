package Session2;

public class Main {
    public static void main(String[] args) {
        HealthInsuranceCustomerProfile hh = new HealthInsuranceCustomerProfile();
        BikeInsuranceCustomerProfile bb = new BikeInsuranceCustomerProfile();
        CalculatePremiumDiscountPercent cp = new CalculatePremiumDiscountPercent();
        System.out.println(cp.calculateDiscount(hh));
         CalculatePremiumDiscountPercent c2 = new CalculatePremiumDiscountPercent();
        System.out.println(c2.calculateDiscount(bb));
    }
    
}
