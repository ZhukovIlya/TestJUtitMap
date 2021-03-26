package ru.netology;

import java.util.*;


public class Contacts {
    private HashMap<String, Contact> map = new HashMap<>();

    public HashMap<String, Contact> getMap(){
        return map;
    }

    // добавить контакт
    public void addContacts(String name, String surname, String phone, Group group){
        this.map.put(phone, new Contact(name, surname, phone, group));
    }


    //удалить контакт
    public void deletingContact(String name, String surname){
        boolean found = false;
        for (Map.Entry<String, Contact> entry : this.map.entrySet()){
            String n = entry.getValue().getName();
            String s = entry.getValue().getSurname();
            if (n.equals(name) && s.equals(surname)){
                this.map.remove(entry.getKey());
                System.out.println("Контакт удалён");
                found = true;
            }
        }
        if (!found){
            System.out.println("Контакт не найден");
        }
    }

// вывести контакты

    public String toContacts(){
        StringBuilder wor = new StringBuilder();
        StringBuilder fri = new StringBuilder();
        StringBuilder fam = new StringBuilder();
        for (Map.Entry<String, Contact> entry : this.map.entrySet()){
            String key = entry.getKey();
            Group gr = this.map.get(key).getGroup();
            switch (gr){
                case WORK:
                    wor.append(entry + "\n");
                case FRIENDS:
                    fri.append(entry + "\n");
                case FAMILY:
                    fam.append(entry + "\n");
            }
        }
        String retn = "Работа " + "\n" + wor.toString() + "\n" + "Друзья " + fri.toString() + "\n" + "Семья " + "\n" + fam.toString();
        return retn;

    }

}
