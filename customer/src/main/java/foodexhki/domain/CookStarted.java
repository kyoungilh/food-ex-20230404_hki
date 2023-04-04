package foodexhki.domain;

import foodexhki.domain.*;
import foodexhki.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private String orderid;
}
