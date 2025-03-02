package org.addy.hello_jms.model;

import java.time.LocalDate;

public record Person(String firstName,
                     String lastName,
                     Gender gender,
                     LocalDate birthDate) {
}
