package ru.netology;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        MissedCalls missedCalls = new MissedCalls();
        Scanner scanner = new Scanner(System.in);
        String input;
        int choice;
        String name;
        String surname;
        String phone;
        Group group1;
        Group[] group = Group.values();

        while(true){
            System.out.println("Меню:"
                    + "\n" + "1. Добавить контакт"
                    + "\n" + "2. Добавить пропущенный вызов"
                    + "\n" + "3. Вывести все пропущенные вызовы"
                    + "\n" + "4. Очистить пропущенные вызовы"
                    + "\n" + "5. Удалить контакт"
                    + "\n" + "6. Завершить работу"
                    + "\n" + "Выберите пункт из меню");

            input = scanner.nextLine();
            try {
                choice = Integer.parseInt (input);
            } catch(NumberFormatException exception) {
                System.out.println("введен не коректный номер  операции");
                continue;
            }
            if (choice == 6){
                break;
            }

            switch (choice){
                case 1:
                    while(true){
                        System.out.println("ВВедите имя контакта");
                        name = scanner.nextLine();
                        System.out.println("ВВедите фамилию контакта");
                        surname = scanner.nextLine();
                        System.out.println("ВВедите номер телефона");
                        phone = scanner.nextLine();
                        while(true){
                            System.out.println("Выберите группу"
                                    + "\n" + "1." + group[0]
                                    + "\n" + "2." + group[1]
                                    + "\n" + "3." + group[2]);
                            input = scanner.nextLine();
                            try {
                                choice = Integer.parseInt (input);
                            } catch(NumberFormatException exception) {
                                System.out.println("введен не коректный номер  операции");
                                continue;
                            }
                            if (choice >= 1 && choice <= 3){
                                group1 = group[choice - 1];
                                break;
                            } else {
                                System.out.println("введен не коректный номер группы");
                                continue;
                            }
                        }
                        contacts.addContacts(name, surname, phone, group1);
                        System.out.println("Контакт создан");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Введите номер того кто звонит");
                    input = scanner.nextLine();
                    missedCalls.addMissed(input);
                    break;
                case 3:
                    missedCalls.toMissed(contacts);
                    break;
                case 4:
                    missedCalls.removeMissed();
                    break;
                case 5:
                    System.out.println("Введите имя контакта");
                    input = scanner.nextLine();
                    name = input;
                    System.out.println("Введите фамилию контакта");
                    input = scanner.nextLine();
                    surname = input;
                    contacts.deletingContact(name, surname);
                    break;
            }
        }
    }
}
