package com.example.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CsvToMapExample {
    public static void main(String[] args) {
        Map<String, Integer> loadedMap = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("stock.csv"))) {
            String line;
            boolean header = true;

            while ((line = bufferedReader.readLine()) != null) {
                if (header) {
                    header = false; // 첫 줄(헤더) 건너뛰기
                    continue;
                }
                String[] tokens = line.split(",");
                String key = tokens[0];
                int value = Integer.parseInt(tokens[1]);
                loadedMap.put(key, value);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("CSV로부터 로드된 Map: " + loadedMap);

    }
}
