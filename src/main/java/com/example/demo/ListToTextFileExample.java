package com.example.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListToTextFileExample {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");

        // 리스트를 파일로 저장
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("items.txt"))) {
            for (String item : items) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
