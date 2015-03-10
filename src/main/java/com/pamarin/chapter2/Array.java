/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pamarin.chapter2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aom-Cpe
 */
public class Array {
     public static void main(String[] args) {
        int number[] = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++){
            number[i] = (int)(Math.random()*10+1);
            System.out.println("Array[" + i + "] = "+ number[i]);
        }
        
        Arrays.sort(number);
        
        System.out.println("Maximum = " + number[number.length - 1]);
    }
}
