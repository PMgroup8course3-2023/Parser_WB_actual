package DB_Objects.Product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSize {
    String name;
    String origName;
    int rank;
    int optionId;
    int returnCost;
    int  wh;
    String sign;
    String payload;

}
