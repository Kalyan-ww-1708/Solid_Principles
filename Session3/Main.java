package Session3;

public class Main {

    public static void main(String[] args) {
        
        Product p1 = new Product();
        Product p2 = new Product(30);
        Product p3 = new InhouseProduct();

        System.out.println(p1.getDiscount());
        System.out.println(p2.getDiscount());
        System.out.println(p3.getDiscount());
    }
}
