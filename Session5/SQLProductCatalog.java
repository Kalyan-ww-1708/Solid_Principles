package Session5;

import java.util.*;

public class SQLProductCatalog implements ProductRepository {

    public List<String> getAllProductNames(){
        return Arrays.asList("soap","toothpaste");
    }
    
}
