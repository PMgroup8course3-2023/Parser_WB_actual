package DB_Objects.Filters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilterPrice extends FilterSuper{
    int minPriceU;
    int maxPriceU;
}
