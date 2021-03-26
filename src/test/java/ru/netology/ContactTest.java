package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.Group.*;

class ContactTest {


    @Test
    void getNameTest() {
        Contact user = new Contact("1", "2", "3", WORK);
        assertEquals("1", user.getName());
    }
}