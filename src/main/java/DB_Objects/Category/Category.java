package DB_Objects.Category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {
    int id;
    String name;
    String url;
    String shardKey;
    String rawQuery;
    String query;
    ArrayList<Category> nodes;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", shardKey='" + shardKey + '\'' +
                ", rawQuery='" + rawQuery + '\'' +
                ", query='" + query + '\'' +
                ", nodes=" + nodes +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getShardKey() {
        return shardKey;
    }

    public String getRawQuery() {
        return rawQuery;
    }

    public String getQuery() {
        return query;
    }

    public ArrayList<Category> getNodes() {
        return nodes;
    }
}
