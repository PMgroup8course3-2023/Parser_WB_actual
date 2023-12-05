package DB_Objects.Filters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilterCategory extends FilterSuper{
    int maxselect;
    ArrayList<FilterCategoryItem> items;
}
@JsonIgnoreProperties(ignoreUnknown = true)
class FilterCategoryItem {
    int id;
    String name;
    int count;
}