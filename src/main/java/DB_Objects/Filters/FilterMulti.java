package DB_Objects.Filters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilterMulti extends FilterSuper{
    int multiselect;
    ArrayList<FilterMultiItem> items;
}
@JsonIgnoreProperties(ignoreUnknown = true)
class FilterMultiItem {
    int id;
    String name;
}
