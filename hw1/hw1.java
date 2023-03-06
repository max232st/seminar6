package org.example.seminar6.hw1;


import java.util.*;

public class hw1 {
    public static void main(String[] args) {
        int n = 0;
        Map<Integer, String> desiredList = new HashMap<>();
        desiredList.put(1, "Производитель");
        desiredList.put(2, "Модель процессора");
        desiredList.put(3, "Объем памяти");
        desiredList.put(4, "Тип видеокарты");
        desiredList.put(5, "Объем диска");
        desiredList.put(6, "Цена");
        desiredList.put(7, "Выход");
        System.out.println("Выберите вариант поиска из списка:");
        while (n != 7) {
            n = Base.findChoice(desiredList);
            new Base().filterList(n);
        }
    }
}