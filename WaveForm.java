package com.telerikacademy;

import java.util.Scanner;

public class WaveForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int[] a = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        boolean flag = true;

        for (int i = 1; i < a.length -1; i++) {
            if(!((a[i] < a[i+1] && a[i] < a[i-1]) || (a[i] > a[i+1] && a[i] > a[i-1]))){
                System.out.println("No");
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("Yes");
    }
}