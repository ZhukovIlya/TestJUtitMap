package ru.netology;

import java.util.*;
import java.time.*;

public class MissedCalls {
    private Map<LocalDateTime, String> map = new TreeMap<>();

    public Map getMap(){
        return map;
    }


    public void addMissed(String phone) {
        this.map.put(LocalDateTime.now(), phone);
    }

    public void toMissed(Contacts contacts) {
        for (Map.Entry<LocalDateTime, String> entry : this.map.entrySet()) {
            String value = entry.getValue();
            if (contacts.getMap().containsKey(value)) {
                System.out.println("Вам звонил " + contacts.getMap().get(value).getName()
                        + " в " + entry.getKey());
            } else {
                System.out.println("Вам звонил " + entry.getValue()
                        + " в " + entry.getKey());
            }
        }
    }

    public void removeMissed() {
        this.map.clear();
        System.out.println("Пропущеные вызовы очищены");
    }
}
