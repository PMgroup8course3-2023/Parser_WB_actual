package DB_Objects.Filters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FiltersTable {
    int state;
    FiltersArray data;
}

class FiltersArray {
    ArrayList<FilterSuper> filters;
}
