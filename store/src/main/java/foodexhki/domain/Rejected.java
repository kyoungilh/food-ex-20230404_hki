package foodexhki.domain;

import foodexhki.domain.*;
import foodexhki.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;

    public Rejected(Cooking aggregate) {
        super(aggregate);
    }

    public Rejected() {
        super();
    }
}
