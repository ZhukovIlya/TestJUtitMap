package ru.netology;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


class MissedCallsTest {

    @Test
    void addMissedTestNull() {
        MissedCalls map = new MissedCalls();
        String phone = "2";
        map.addMissed(phone);
        assertFalse(map.getMap() == null || map.getMap().isEmpty());
    }

    @Test
    void addMissedTestAdd() {
        MissedCalls map = new MissedCalls();
        LocalDateTime time = LocalDateTime.now();
        String phone = "2";
        map.addMissed(phone);
        assertEquals("2", map.getMap().get(time));
    }


    @Test
    void removeMissedTest() {
        MissedCalls map = new MissedCalls();
        map.addMissed("1");
        map.addMissed("2");
        map.removeMissed();
        assertTrue(map.getMap() == null || map.getMap().isEmpty());
    }
}