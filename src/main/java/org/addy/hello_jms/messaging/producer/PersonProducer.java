package org.addy.hello_jms.messaging.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.addy.hello_jms.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PersonProducer {

    @Value("${hellojms.messaging.queues.person}")
    private String queueName;

    private final JmsTemplate jmsTemplate;

    public void sendPerson(Person person) {
        jmsTemplate.convertAndSend(queueName, person);
    }
}
