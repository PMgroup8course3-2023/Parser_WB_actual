package DB_Objects.Filters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilterTime extends FilterSuper{
    int minTime;
    int maxTime;
}
