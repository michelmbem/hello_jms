package org.addy.hello_jms.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.addy.hello_jms.messaging.producer.PersonProducer;
import org.addy.hello_jms.model.Person;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonProducer personProducer;

    public void processPerson(Person person) {
        personProducer.sendPerson(person);
    }
}
