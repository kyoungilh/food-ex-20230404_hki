package foodexhki.domain;

import foodexhki.domain.*;
import foodexhki.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Accepted extends AbstractEvent {

    private Long id;

    public Accepted(Cooking aggregate) {
        super(aggregate);
    }

    public Accepted() {
        super();
    }
}
