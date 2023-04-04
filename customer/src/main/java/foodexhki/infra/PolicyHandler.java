package foodexhki.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import foodexhki.config.kafka.KafkaProcessor;
import foodexhki.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    OrderRepository orderRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CookStarted'"
    )
    public void wheneverCookStarted_UpdateDelivery(
        @Payload CookStarted cookStarted
    ) {
        CookStarted event = cookStarted;
        System.out.println(
            "\n\n##### listener UpdateDelivery : " + cookStarted + "\n\n"
        );

        // Sample Logic //
        Order.updateDelivery(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryConfirmed'"
    )
    public void wheneverDeliveryConfirmed_UpdateDelivery(
        @Payload DeliveryConfirmed deliveryConfirmed
    ) {
        DeliveryConfirmed event = deliveryConfirmed;
        System.out.println(
            "\n\n##### listener UpdateDelivery : " + deliveryConfirmed + "\n\n"
        );

        // Sample Logic //
        Order.updateDelivery(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FoodPicked'"
    )
    public void wheneverFoodPicked_UpdateDelivery(
        @Payload FoodPicked foodPicked
    ) {
        FoodPicked event = foodPicked;
        System.out.println(
            "\n\n##### listener UpdateDelivery : " + foodPicked + "\n\n"
        );

        // Sample Logic //
        Order.updateDelivery(event);
    }
}
