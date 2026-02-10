package Session2;

import java.util.Random;

public class BikeInsuranceCustomerProfile implements CustomerProfile {

    public boolean isLoyal(){
        return new Random().nextBoolean();
    }
    
}
