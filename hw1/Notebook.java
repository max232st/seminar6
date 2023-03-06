package org.example.seminar6.hw1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notebook {
    private String brand;
    private String modelName;
    private String cpuName;
    private int cores;
    private int ram;
    private int ssd;
    private String videoName;
    private int videoRam;
    private String os;
    private String color;
    private int price;

    @Override
    public String toString() {
        return System.out.printf("%s %s, %s, %d cores, ram %d gb, ssd %d gb, %s %d gb, %s, %s. Цена %d р.\n",
                brand, modelName, cpuName, cores, ram, ssd, videoName, videoRam, os, color, price).toString();
    }

}