package ru.netology;

import java.lang.StringBuilder;


public class Contact{
    private String name;
    private String surname;
    private String phone;
    private Group group;

    public Contact(String name, String surname, String phone, Group group){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.group = group;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name + " ");
        sb.append(surname + " ");
        sb.append(phone + " ");
        sb.append(group + " ");
        return sb.toString();
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPhone(){
        return phone;
    }
    public Group getGroup(){
        return group;
    }
}