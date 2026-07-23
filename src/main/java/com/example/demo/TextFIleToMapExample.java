package com.example.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TextFIleToMapExample {

    public static void main(String[] args) {

        Map<String, Integer> loadedMap = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("stock.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split("[\\s=]+"); // 공백 또는 = 로 구분
                String key = tokens[0];
                int value = Integer.parseInt(tokens[1]);
                loadedMap.put(key, value);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("로드된 맵: " + loadedMap);

    }
}
