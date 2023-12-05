package DB_Objects.Product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductTable {
    int state;
    int version;
    TabParams params;
    ProductsArray data;
}

class ProductsArray {
    ArrayList<Product> products;
}

class TabParams {
    int version;
    String curr;
    int spp;
    int dest;
    int payloadVersion;
}
