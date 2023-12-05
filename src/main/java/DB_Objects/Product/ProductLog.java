package DB_Objects.Product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductLog {
    int cpm;
    int promotion;
    int promoPosition;
    int position;
    int advertId;
}
