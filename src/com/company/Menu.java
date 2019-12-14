package com.company;

import java.util.*;

public class Menu {
    private Hobby hobby1 = new Hobby("Reading", 5, false);
    private Hobby hobby2 = new Hobby("Reading", 5, false);
    private Hobby hobby3 = new Hobby("Play football", 3, true);
    private Hobby hobby4 = new Hobby("Fishning", 7, true);
    private Hobby hobby5 = new Hobby("Camping", 1, true);
    private Hobby[] hobbies = new Hobby[] {hobby1, hobby2, hobby3, hobby4, hobby5};

    public void start(){
        Scanner scan = new Scanner(System.in);
        int x = 0;

        while (100 != x) {
            printMenu();
            x = scan.nextInt();

            switch (x){
                case 1:
                    workWithArraList();
                    break;
                case 2:
                    workWithLinkedlist();
                    break;
                case 3:
                    workWithHashSet();
                case 4:
                    workWithHashMap();
                    break;
                case 5:
                    MeasurementsProductivity measurementsProductivity = new MeasurementsProductivity();
                    measurementsProductivity.printTable();
                    break;
                case 6:
                    System.exit(1);
                    break;
            }
        }
    }


    public void printMenu(){
        System.out.println("1. Работа с Arraylist.");
        System.out.println("2. Работа с Linkedlist.");
        System.out.println("3. Работа с HashSet.");
        System.out.println("4. Работа с HashMap.");
        System.out.println("5. Произвести замеры производительности");
        System.out.println("6. Выход с программы.");
    }

    public void printMenu2() {
        System.out.println("1. Добавление элементов.");
        System.out.println("2. Удаление элементов.");
        System.out.println("3. Вывод на экран текущего состояния коллекции.");
        System.out.println("4. Вернуться в главное меню.");
        System.out.println("5. Выход с программы.");
    }

    public void workWithArraList() {
        ArrayList<Hobby> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int x = 0;

        while (100 != x) {
            printMenu2();
            x = scan.nextInt();

            switch (x){
                case 1:
                    int elemenc1 = 0;
                    showElementsOfHobbies();
                    System.out.println("Введите номер элемент, который хотите добавить в коллекцию:");
                    elemenc1 = scan.nextInt();
                    array.add(hobbies[elemenc1 - 1]);
                    break;
                case 2:
                    int elemenc2 = 0;
                    showElementsOfArray(array);
                    System.out.println("Введите индекс элемента, который хотите удалить из коллекцию:");
                    elemenc2 = scan.nextInt();
                    array.remove(array.get(elemenc2 - 1));
                    break;
                case 3:
                    showElementsOfArray(array);
                    break;
                case 4:
                    start();
                    break;
                case 5:
                    System.exit(1);
                    break;
            }
        }
    }

    public void workWithLinkedlist() {
        LinkedList<Hobby> linkedList = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        int x = 0;

        while (100 != x) {
            printMenu2();
            x = scan.nextInt();

            switch (x){
                case 1:
                    int elemenc1 = 0;
                    showElementsOfHobbies();
                    System.out.println("Введите номер элемент, который хотите добавить в коллекцию:");
                    elemenc1 = scan.nextInt();
                    linkedList.add(hobbies[elemenc1 - 1]);
                    break;
                case 2:
                    int elemenc2 = 0;
                    showElementsOfLinkedList(linkedList);
                    System.out.println("Введите индекс элемента, который хотите удалить из коллекцию:");
                    elemenc2 = scan.nextInt();
                    linkedList.remove(linkedList.get(elemenc2 - 1));
                    break;
                case 3:
                    showElementsOfLinkedList(linkedList);
                    break;
                case 4:
                    start();
                    break;
                case 5:
                    System.exit(1);
                    break;
            }
        }
    }

    public void workWithHashSet() {
        HashSet<Hobby> hashSet = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        int x = 0;

        while (100 != x) {
            printMenu2();
            x = scan.nextInt();

            switch (x){
                case 1:
                    int elemenc1 = 0;
                    showElementsOfHobbies();
                    System.out.println("Введите номер элемент, который хотите добавить в коллекцию:");
                    elemenc1 = scan.nextInt();
                    hashSet.add(hobbies[elemenc1 - 1]);
                    break;
                case 2:
                    int elemenc2 = 0;
                    showElementsOfHashSet(hashSet);
                    System.out.println("Введите индекс элемента, который хотите удалить из коллекцию:");
                    elemenc2 = scan.nextInt();
                    hashSet.remove(hobbies[elemenc2]);
                    break;
                case 3:
                    showElementsOfHashSet(hashSet);
                    break;
                case 4:
                    start();
                    break;
                case 5:
                    System.exit(1);
                    break;
            }
        }
    }

    public void workWithHashMap() {
        HashMap<Date, Hobby> hashMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int x = 0;

        while (100 != x) {
            printMenu2();
            x = scan.nextInt();

            switch (x){
                case 1:
                    int elemenc1;
                    showElementsOfHobbies();
                    System.out.println("Введите номер элемент, который хотите добавить в коллекцию:");
                    elemenc1 = scan.nextInt();
                    System.out.println("Введите значение ключа, для добавление в коллецию:");
                    int key = scan.nextInt();
                    hashMap.put(new Date(key), hobbies[elemenc1 - 1]);
                    break;
                case 2:
                    int elemenc2 = 0;
                    showElementsOfHashMap(hashMap);
                    System.out.println("Введите ключ элемента, который хотите удалить из коллекцию:");
                    elemenc2 = scan.nextInt();
                    hashMap.remove(new Date(elemenc2));
                    break;
                case 3:
                    showElementsOfHashMap(hashMap);
                    break;
                case 4:
                    start();
                    break;
                case 5:
                    System.exit(1);
                    break;
            }
        }
    }

    public void showElementsOfHobbies() {
        for (int i = 0; i < hobbies.length ; i++) {
            System.out.println((i + 1) + "-й элемент: " + hobbies[i]);
        }
    }

    public void showElementsOfArray(ArrayList<Hobby> arrayList){
        if (arrayList.size() > 0) {
            System.out.println("В текущей коллекции ArrayList находятся следующие элементы:");
            for (int i = 0; i < arrayList.size() ; i++) {
                System.out.println(i + 1 + "-й элемент: " + arrayList.get(i));
            }
        }else {
            System.out.println("Текущаю коллекция ArrayList пустая!");
        }
    }

    public void showElementsOfLinkedList(LinkedList<Hobby> linkedList){
        for (int i = 0; i < linkedList.size() ; i++) {
            System.out.println(i + 1 + "-й элемент: " + linkedList.get(i));
        }
    }

    public void showElementsOfHashSet(HashSet<Hobby> hashSet) {
        int i = 0;
        for (Hobby element: hashSet
        ) {
            System.out.println(i + 1 + "-й элемент: " + element);
        }
    }

    public void showElementsOfHashMap(HashMap<Date, Hobby> hashMap) {
        Set sgs = hashMap.entrySet();
        for (Object element: sgs) {
            System.out.println(element.toString());
        }
    }
}
