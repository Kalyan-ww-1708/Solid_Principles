package Session3;


public class Product{

    public double discount = 20;
    public Product(){

    }
    public Product(double discount){
        this.discount = discount;
    }

    public double getDiscount(){
        return discount;
    }
}