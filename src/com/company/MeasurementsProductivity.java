package com.company;

import java.util.*;

public class MeasurementsProductivity {

    private ArrayList<Hobby> arrayList = new ArrayList<>();
    private LinkedList<Hobby> linkedList = new LinkedList<>();
    private HashSet<Hobby> hashSet = new HashSet<>();
    TreeSet<Hobby> treeSet = new TreeSet<>();
    private HashMap<Date, Hobby> hashMap = new HashMap<>();
    private TreeMap<Date, Hobby> treeMap = new TreeMap<>();
    private Hobby[] arrayObjects;

    public void generateObjects(int count) {
        Hobby[] array = new Hobby[count];
        for (int i = 0; i < count; i++) {
            Hobby hobby = new Hobby("Reading" + i, 5, false);
            array[i] = hobby;
        }
        arrayObjects = array;
    }

    public void printTable() {

        long[] timeToAdd = addElementsToCollection();
        long[] timeToGet = removeElementsToCollection();
        long[] timeToRemove = getElementsFromList();
        System.out.println("-------------------------------------------------------");
        System.out.println("               add      remove      getElement");
        System.out.println("-------------------------------------------------------");
        System.out.println("Arraylist        " + timeToAdd[0] + "      " + timeToGet[0]+"         " + timeToRemove[0]);
        System.out.println("Linkedlist       " + timeToAdd[1] + "      " + timeToGet[1]+"         " + timeToRemove[1]);
        System.out.println("HashSet          " + timeToAdd[2] + "      " + timeToGet[2]+"         " + timeToRemove[2]);
        System.out.println("TreeSet          " + timeToAdd[3] + "      " + timeToGet[3]+"         " + timeToRemove[3]);
        System.out.println("HashMap          " + timeToAdd[4] + "      " + timeToGet[4]+"         " + timeToRemove[4]);
        System.out.println("TreeMap          " + timeToAdd[5] + "      " + timeToGet[5]+"         " + timeToRemove[5]);
        System.out.println("-------------------------------------------------------");
    }

    public long[] addElementsToCollection() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов, которое нужно добавить в коллекции:");
        int amount = scan.nextInt();
        generateObjects(amount);

        long t1ArrayList = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            arrayList.add(arrayObjects[i]);
        }
        long t2ArrayList = System.currentTimeMillis();
        long timeToAddElementsArrayList = t2ArrayList - t1ArrayList;

        long t1LinkedList = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            linkedList.add(arrayObjects[i]);
        }
        long t2LinkedList = System.currentTimeMillis();
        long timeToAddElementsLinkedList = t2LinkedList - t1LinkedList;

        long t1HashSet = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            hashSet.add(arrayObjects[i]);
        }
        long t2HashSet = System.currentTimeMillis();
        long timeToAddElementsHashSet = t2HashSet - t1HashSet;

        long t1TreeSet = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            hashSet.add(arrayObjects[i]);
        }
        long t2TreeSet = System.currentTimeMillis();
        long timeToAddElementsTreeSet = t2TreeSet - t1TreeSet;

        long t1HashMap = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            hashMap.put(new Date(i), arrayObjects[i]);
        }
        long t2HashMap = System.currentTimeMillis();
        long timeToAddElementsHashMap = t2HashMap - t1HashMap;

        long t1TreeMap = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            treeMap.put(new Date(i), arrayObjects[i]);
        }
        long t2TreeMap = System.currentTimeMillis();
        long timeToAddElementsTreeMap = t2TreeMap - t1TreeMap;

        return new long[] {timeToAddElementsArrayList, timeToAddElementsLinkedList, timeToAddElementsHashSet, timeToAddElementsTreeSet, timeToAddElementsHashMap,timeToAddElementsTreeMap };
    }

    public long[] removeElementsToCollection() {

        long t1ArrayList = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayObjects[i]);
        }
        long t2ArrayList = System.currentTimeMillis();
        long timeToRemoveElementsArrayList = t2ArrayList - t1ArrayList;

        long t1Linkedlist = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(arrayObjects[i]);
        }
        long t2Linkedlist = System.currentTimeMillis();
        long timeToRemoveElementsLinkedlist = t2Linkedlist - t1Linkedlist;

        long t1HashSet = System.currentTimeMillis();
        for (int i = 0; i < hashSet.size(); i++) {
            hashSet.remove(arrayObjects[i]);
        }
        long t2HashSet = System.currentTimeMillis();
        long timeToRemoveElementsHashSet = t2HashSet - t1HashSet;

        long t1TreeSet = System.currentTimeMillis();
        for (int i = 0; i < treeSet.size(); i++) {
            treeSet.remove(arrayObjects[i]);
        }
        long t2TreeSet = System.currentTimeMillis();
        long timeToRemoveElementsTreeSet = t2TreeSet - t1TreeSet;

        long t1HashMap = System.currentTimeMillis();
        for (int i = 0; i < hashMap.size(); i++) {
            hashMap.remove(new Date(i), arrayObjects[i]);
        }
        long t2HashMap = System.currentTimeMillis();
        long timeToRemoveElementsHashMap = t2HashMap - t1HashMap;

        long t1TreeMap = System.currentTimeMillis();
        for (int i = 0; i < treeMap.size(); i++) {
            treeMap.remove(new Date(i), arrayObjects[i]);
        }
        long t2TreeMap = System.currentTimeMillis();
        long timeToRemoveElementsTreeMap = t2TreeMap - t1TreeMap;

        return new long[] {timeToRemoveElementsArrayList, timeToRemoveElementsLinkedlist, timeToRemoveElementsHashSet, timeToRemoveElementsTreeSet, timeToRemoveElementsHashMap, timeToRemoveElementsTreeMap};
    }

    public long[] getElementsFromList() {
        Hobby hobby;
        long t1ArrayList = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            hobby = arrayList.get(i);
        }
        long t2ArrayList = System.currentTimeMillis();
        long timeToGetElementsArrayList = t2ArrayList - t1ArrayList;

        long t1Linkedlist = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            hobby = linkedList.get(i);
        }
        long t2Linkedlist = System.currentTimeMillis();
        long timeToGetElementsLinkedlist = t2Linkedlist - t1Linkedlist;

        long t1HashSet = System.currentTimeMillis();
        for (Hobby hob:hashSet) {
            hobby = hob;
        }
        long t2HashSet = System.currentTimeMillis();
        long timeToGetElementsHashSet = t2HashSet - t1HashSet;

        long t1TreeSet = System.currentTimeMillis();
        for (Hobby hob:treeSet) {
            hobby = hob;
        }
        long t2TreeSet = System.currentTimeMillis();
        long timeToGetElementsTreeSet = t2TreeSet - t1TreeSet;

        long t1HashMap = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            hobby = hashMap.get(new Date(i));
        }
        long t2HashMap = System.currentTimeMillis();
        long timeToGetElementsHashMap = t2HashMap - t1HashMap;

        long t1TreeMap = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            hobby = treeMap.get(new Date(i));
        }
        long t2TreeMap = System.currentTimeMillis();
        long timeToGetElementsTreeMap = t2TreeMap - t1TreeMap;

        return new long[] {timeToGetElementsArrayList, timeToGetElementsLinkedlist, timeToGetElementsHashSet, timeToGetElementsTreeSet, timeToGetElementsHashMap, timeToGetElementsTreeMap};
    }
}
