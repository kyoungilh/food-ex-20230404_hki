package foodexhki.domain;

import foodexhki.domain.*;
import foodexhki.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FoodPicked extends AbstractEvent {

    private Long id;
    private String orderid;

    public FoodPicked(Delivery aggregate) {
        super(aggregate);
    }

    public FoodPicked() {
        super();
    }
}
