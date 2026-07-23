package com.example.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileToListExample {
    public static void main(String[] args) {

        List<String> loadedItems = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("items.txt"))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    loadedItems.add(line);              // 데이터 추가
                }

                if (line.startsWith("#")) continue; // 주석 제거
                //if(!isValidData(line)) continue;  // 데이터 검증
            }
            System.out.println("로드된 리스트: " + loadedItems);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
