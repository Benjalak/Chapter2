/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pamarin.chapter2;

import java.util.Scanner;

/**
 *
 * @author Aom
 */
public class MuchValue {
    public static void main(String[] args) {
        System.out.println("input 3 value ?");
        Scanner scanner1 = new Scanner (System.in);
            int a =  scanner1.nextInt();
        Scanner scanner2 = new Scanner (System.in);
            int b =  scanner2.nextInt();
        Scanner scanner3 = new Scanner (System.in);
            int c =  scanner3.nextInt();
            
            if(a>b){
                 if(a>c){
                     System.out.println("much value ="+a);
              }
                 else{
                     System.out.println("much value ="+c);
                 }
      
            }
            else{ 
                if(b>c){
                     System.out.println("much value ="+b);
              }
                 else{
                     System.out.println("much value ="+c);
                 }
     
            }
    }
    
    }

