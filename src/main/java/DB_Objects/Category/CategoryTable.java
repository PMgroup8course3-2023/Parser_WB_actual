package DB_Objects.Category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryTable {
    int version;
    ArrayList<Category> data;

    public int getVersion() {
        return version;
    }

    public ArrayList<Category> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "CategoryTable{" +
                "version=" + version +
                ", data=" + data +
                '}';
    }
}
