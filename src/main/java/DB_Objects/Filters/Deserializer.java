package DB_Objects.Filters;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class Deserializer extends StdDeserializer<FilterSuper> {

    public Deserializer() {
        this(null);
    }

    public Deserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public FilterSuper deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {

        JsonNode node = jp.getCodec().readTree(jp);
        if (node.has("minTime")) {
            return new ObjectMapper().treeToValue(node, FilterTime.class);
        }
        else if (node.has("minPriceU")) {
            return new ObjectMapper().treeToValue(node, FilterPrice.class);
        }
        else if (node.has("maxselect")) {
            return new ObjectMapper().treeToValue(node, FilterCategory.class);
        }
        else if (node.has("multiselect")) {
            return new ObjectMapper().treeToValue(node, FilterMulti.class);
        }
        return null;
    }
}