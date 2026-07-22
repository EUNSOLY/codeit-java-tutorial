package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("example.txt")) {
            int data;

            // read()는 한 문자씩 읽어서 한 문자의 ASCII/유니코드 값을 반환
            // 파일 끝에 도달하면 -1을 반환
            // n자 파일일 경우 n번 디스크에 접근해야 함
            while ((data = fileReader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            // 파일이 없을 때 발생하는 에러
            System.out.println("파일 없을 때 ");
            e.printStackTrace();
        } catch (IOException e) {
//            throw new RuntimeException(e);
            // 입출력을 하는 도중에 발생하는 에러
            System.out.println("IOException");
            e.printStackTrace();

        }
    }

}
