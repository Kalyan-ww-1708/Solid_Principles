package Session3;

public class InhouseProduct extends Product {

    @Override
    public double getDiscount(){
        discount = discount * 1.5 ;

        return discount;
    }
}
