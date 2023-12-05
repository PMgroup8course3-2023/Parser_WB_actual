package DB_Objects.Filters;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = Deserializer.class)
public abstract class FilterSuper {
    String name;
    String key;
}
