package org.example.seminar6.hw1;

import java.util.*;


public class Base {
    Notebook note1 = new Notebook("Lenovo", "C17", "Intel i7",
            4, 8, 512, "Intel Graphics", 4, "Windows", "черный", 45000);
    Notebook note2 = new Notebook("Acer", "Aspire 17", "AMD Ryzen 3 3600H",
            4, 8, 512, "NVIDIA GTX 1650", 4, "Linux", ",белый", 36000);
    Notebook note3 = new Notebook("ASUS", "X15", "Intel i5 ",
            4, 16, 1024, "Intel Graphics", 4, "Windows", "черный", 46000);
    Notebook note4 = new Notebook("HP", "HP 17ci", "Intel i7",
            8, 16, 1024, "NVIDIA GeForce RTX 3070", 8, "Windows", "белый", 45000);
    Notebook note5 = new Notebook("Acer", "Aspire 15", "AMD Ryzen 5 5500U",
            6, 8, 512, "AMD Radeon Graphics", 4, "Linux", "черный", 57000);
    public List<Notebook> notebookList = new ArrayList<>(Arrays.asList(note1, note2, note3, note4, note5));


    public static int findChoice(Map<Integer, String> mapList) {
        int choice = -1;

        printMap(mapList);

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите цифру: ");
        while (choice < 1 || choice > mapList.size()) {
            if (sc.hasNextInt()) choice = sc.nextInt();
            if (!(choice > 0 && choice < mapList.size() + 1)) {
                System.out.println("Не корректный ввод!");
                System.out.print("Введите цифру: ");
                sc.nextLine();
            }
        }
        return choice;
    }

     public void filterList(Integer n) {
        int count = 1;
        int choice;
        Map<Integer, String> findList = new HashMap<>();
        switch (n) {
            case (1):
                for (Notebook el : notebookList) {
                    if (!findList.values().contains(el.getBrand())) {
                        findList.put(count, el.getBrand());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Notebook el : notebookList) {
                    if (el.getBrand().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                break;
            case (2):
                for (Notebook el : notebookList) {
                    if (!findList.values().contains(el.getCpuName())) {
                        findList.put(count, el.getCpuName());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Notebook el : notebookList) {
                    if (el.getCpuName().toString().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                break;
            case (3):
                for (Notebook el : notebookList) {
                    if (!findList.values().contains(Integer.toString(el.getRam()))) {
                        findList.put(count, Integer.toString(el.getRam()));
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Notebook el : notebookList) {
                    if (Integer.toString(el.getRam()).equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                break;
            case (4):
                for (Notebook el : notebookList) {
                    if (!findList.values().contains(el.getVideoName())) {
                        findList.put(count, el.getVideoName());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Notebook el : notebookList) {
                    if (el.getVideoName().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                break;
            case (5):
                for (Notebook el : notebookList) {
                    if (!findList.values().contains(Integer.toString(el.getSsd()))) {
                        findList.put(count, Integer.toString(el.getSsd()));
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Notebook el : notebookList) {
                    if (Integer.toString(el.getSsd()).equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                break;
            case (6):
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите минимальную сумму: ");
                int minPrice = scanner.nextInt();
                System.out.print("Введите максимальную сумму: ");
                int maxPrice = scanner.nextInt();
                List<Notebook> fList = new ArrayList<>();
                for (Notebook el : notebookList) {
                    if (el.getPrice() >= minPrice && el.getPrice() <= maxPrice) {
                        fList.add(el);
                    }
                }
                for (Notebook el : fList) {
                    el.toString();
                }
                break;
        }
    }

    public static void printMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.printf("%d - %s;%n", item.getKey(), item.getValue());
        }
    }
}
