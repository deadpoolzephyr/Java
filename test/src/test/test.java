/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;



public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Lütfen birinci değeri giriniz: ");
        int x = sc.nextInt();
        System.out.println("Lütfen ikinci değeri giriniz: ");
        int y = sc.nextInt();
        int z = x+y;
        System.out.println("Toplam değer = " + z);
        
    }
}
