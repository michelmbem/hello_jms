package org.addy.hello_jms.messaging.consumer;

import lombok.extern.slf4j.Slf4j;
import org.addy.hello_jms.model.Person;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class PersonConsumer {

    @JmsListener(destination = "${hellojms.messaging.queues.person}")
    public void receivePerson(Person person) {
        log.info("Received person: {}, at: {}", person, LocalDateTime.now());
    }
}
