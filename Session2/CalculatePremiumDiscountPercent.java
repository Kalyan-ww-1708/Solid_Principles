package Session2;

public class CalculatePremiumDiscountPercent {

    public int calculateDiscount(CustomerProfile cp){
        if(cp.isLoyal()){
            return 20;
        }
        return 0;
    }
}
