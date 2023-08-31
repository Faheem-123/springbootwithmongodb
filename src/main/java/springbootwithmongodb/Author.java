package springbootwithmongodb;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
//@Document(collation = "Author")
public class Author {
    private int authId;
    private String authName;
}
