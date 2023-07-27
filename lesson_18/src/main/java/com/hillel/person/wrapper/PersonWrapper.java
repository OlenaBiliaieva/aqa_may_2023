package com.hillel.person.wrapper;

import com.hillel.person.Person;

import java.io.IOException;

public class PersonWrapper {

    private Person person;

    public PersonWrapper(Person person) {
        this.person = person;
    }

    public Person getPerson() throws IOException {
        if (person == null)
            throw new IOException("person is null");
        return this.person;
    }
}
