package com.example.demo;

import java.util.Arrays;

public class CopyArrayExample {
    public static void main(String[] args) {
        // 참조형 타입 (값을 갖고있는 주소가 복사됨 Shallow Copy - 얇은 복사)
        int[] copier = {1,2,3};
        int[] copiee = copier;

        System.out.println(copier); // [I@2a139a55
        System.out.println(copiee); // [I@2a139a55

        copier[0] = 100;

        System.out.println(copier[0]); // 100
        System.out.println(copiee[0]); // 100

        // 참조형 타입 (값을 복사함 Depp Copy - 깊은 복사)
        int[] copier2 = {1, 2, 3};
        int[] copiee2 = new int[copier2.length];

        // for 문을 통한 깊은 복사 : 새 배열 만들어 값 따로 복사
        for (int i = 0; i < copier2.length; i++) {
            copiee2[i] = copier2[i];
        }

        System.out.println(copier2); // [I@15db9742
        System.out.println(copiee2); // [I@6d06d69c

        copier2[0] = 100;

        System.out.println(copier2[0]); // 100
        System.out.println(copiee2[0]); // 1

        // Arrays.copyOf() 통한 깊은 복사 : 새 배열 복사 함수
        int[] copier3 = {1, 2, 3};
        int[] copiee3 = Arrays.copyOf(copier3, copier3.length);

        copier3[0] = 100;

        System.out.println(copier3[0]); // 100
        System.out.println(copiee3[0]); // 1


        // System.arraycopy()를 통한 깊은 복사 : 고성능 복사
        int[] copier4 = {1, 2, 3};
        int[] copiee4 = new int[copier.length];

        System.arraycopy(copier4, 0, copiee4, 0, copiee4.length);

        copier4[0] = 100;

        System.out.println(copier4[0]); // 100
        System.out.println(copiee4[0]); // 1
    }
}