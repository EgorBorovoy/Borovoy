/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

import java.util.Random;

/**
 *
 * @author Åãîğ
 */
public class ÍîâûéClass {
   
    public static void main(String[] args) {
        
        //first matrix
        int[][] firstMatrix  = new int[5][5];
        Random f=new Random(); 
        System.out.println("____________1stMatrix_________-");
        for (int i = 0;i < 5; i++) {
            for (int j =0; j < 5; j++){
                firstMatrix[i][j] = f.nextInt(20);
                System.out.print(firstMatrix[i][j]+"\t");
            }
            System.out.println();
        }
}
}
