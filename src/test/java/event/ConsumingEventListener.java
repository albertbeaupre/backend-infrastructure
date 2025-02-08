package event;

import infrastructure.event.EventListener;

public class ConsumingEventListener implements EventListener<TestEvent> {

    @Override
    public void handle(TestEvent event) {
        event.message += "Hello";
        event.consume();
    }

}
